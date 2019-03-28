// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  LocalSecondaryIndexDescription => ScalaLocalSecondaryIndexDescription,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndexDescription => JavaLocalSecondaryIndexDescription }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexDescriptionOps {

  implicit class ScalaLocalSecondaryIndexDescriptionOps(val self: ScalaLocalSecondaryIndexDescription) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexDescription = {
      val result = new JavaLocalSecondaryIndexDescription()
      self.indexName.filter(_.nonEmpty).foreach(v => result.withIndexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.withKeySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.withProjection(v.toJava)
      } // Projection
      self.indexSizeBytes.map(_.longValue).foreach(v => result.withIndexSizeBytes(v)) // Long
      self.itemCount.map(_.longValue).foreach(v => result.withItemCount(v))           // Long
      self.indexArn.filter(_.nonEmpty).foreach(v => result.withIndexArn(v))           // String

      result
    }

  }

  implicit class JavaLocalSecondaryIndexDescriptionOps(val self: JavaLocalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexDescription = {
      ScalaLocalSecondaryIndexDescription()
        .withIndexName(Option(self.getIndexName)) // String
        .withKeySchema(Option(self.getKeySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.getProjection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withIndexSizeBytes(Option(self.getIndexSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.getItemCount).map(_.longValue)) // Long
        .withIndexArn(Option(self.getIndexArn)) // String
    }

  }

}
