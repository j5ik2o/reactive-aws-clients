// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndex => ScalaLocalSecondaryIndex, _ }
import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndex => JavaLocalSecondaryIndex }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexOps {

  implicit class ScalaLocalSecondaryIndexOps(val self: ScalaLocalSecondaryIndex) extends AnyVal {

    def toJava: JavaLocalSecondaryIndex = {
      val result = new JavaLocalSecondaryIndex()
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

  implicit class JavaLocalSecondaryIndexOps(val self: JavaLocalSecondaryIndex) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndex = {
      ScalaLocalSecondaryIndex()
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
