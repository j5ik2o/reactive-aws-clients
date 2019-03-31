// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndexInfo => ScalaGlobalSecondaryIndexInfo, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndexInfo => JavaGlobalSecondaryIndexInfo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexInfoOps {

  implicit class ScalaGlobalSecondaryIndexInfoOps(val self: ScalaGlobalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexInfo = {
      val result = JavaGlobalSecondaryIndexInfo.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.provisionedThroughput(v.toJava)
      } // ProvisionedThroughput

      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexInfoOps(val self: JavaGlobalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexInfo = {
      ScalaGlobalSecondaryIndexInfo()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withProvisionedThroughput(Option(self.provisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
    }

  }

}
