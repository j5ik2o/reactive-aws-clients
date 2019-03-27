// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndexInfo => ScalaGlobalSecondaryIndexInfo, _ }
import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndexInfo => JavaGlobalSecondaryIndexInfo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlobalSecondaryIndexInfoOps {

  implicit class ScalaGlobalSecondaryIndexInfoOps(val self: ScalaGlobalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexInfo = {
      val result = new JavaGlobalSecondaryIndexInfo()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.withProjection(v.toJava)
      } // Projection
      self.provisionedThroughput.foreach { v =>
        import ProvisionedThroughputOps._; result.withProvisionedThroughput(v.toJava)
      } // ProvisionedThroughput

      result
    }

  }

  implicit class JavaGlobalSecondaryIndexInfoOps(val self: JavaGlobalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexInfo = {
      ScalaGlobalSecondaryIndexInfo()
        .withIndexName(Option(self.getIndexName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.getProjection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map { v =>
          import ProvisionedThroughputOps._; v.toScala
        }) // ProvisionedThroughput
    }

  }

}
