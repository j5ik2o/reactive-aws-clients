// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndexInfo => ScalaLocalSecondaryIndexInfo, _ }
import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndexInfo => JavaLocalSecondaryIndexInfo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexInfoOps {

  implicit class ScalaLocalSecondaryIndexInfoOps(val self: ScalaLocalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexInfo = {
      val result = new JavaLocalSecondaryIndexInfo()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.withProjection(v.toJava)
      } // Projection

      result
    }

  }

  implicit class JavaLocalSecondaryIndexInfoOps(val self: JavaLocalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexInfo = {
      ScalaLocalSecondaryIndexInfo()
        .withIndexName(Option(self.getIndexName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.getProjection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
    }

  }

}
