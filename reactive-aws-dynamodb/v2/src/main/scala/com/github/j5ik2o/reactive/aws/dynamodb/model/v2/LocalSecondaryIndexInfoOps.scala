// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndexInfo => ScalaLocalSecondaryIndexInfo, _ }
import software.amazon.awssdk.services.dynamodb.model.{ LocalSecondaryIndexInfo => JavaLocalSecondaryIndexInfo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexInfoOps {

  implicit class ScalaLocalSecondaryIndexInfoOps(val self: ScalaLocalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexInfo = {
      val result = JavaLocalSecondaryIndexInfo.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection

      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexInfoOps(val self: JavaLocalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexInfo = {
      ScalaLocalSecondaryIndexInfo()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
    }

  }

}
