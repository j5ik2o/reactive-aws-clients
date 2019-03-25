package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndexInfo => ScalaGlobalSecondaryIndexInfo, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndexInfo => JavaGlobalSecondaryIndexInfo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexInfoOps {

  implicit class ScalaGlobalSecondaryIndexInfoOps(val self: ScalaGlobalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexInfo = {
      val result = JavaGlobalSecondaryIndexInfo.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String, case String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement], case Seq[_], UserDefined
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection, case Other
      self.provisionedThroughput.foreach { v =>
        result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput, case Other

      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexInfoOps(val self: JavaGlobalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexInfo = {
      ScalaGlobalSecondaryIndexInfo()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement], Seq-6
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection, Map-12
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          v.toScala
        }) // ProvisionedThroughput, Map-12
    }

  }

}
