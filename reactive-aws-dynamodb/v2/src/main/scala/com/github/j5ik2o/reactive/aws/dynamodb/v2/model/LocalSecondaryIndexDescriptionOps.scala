// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  LocalSecondaryIndexDescription => ScalaLocalSecondaryIndexDescription,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  LocalSecondaryIndexDescription => JavaLocalSecondaryIndexDescription
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LocalSecondaryIndexDescriptionOps {

  implicit class ScalaLocalSecondaryIndexDescriptionOps(val self: ScalaLocalSecondaryIndexDescription) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexDescription = {
      val result = JavaLocalSecondaryIndexDescription.builder()
      self.indexName.filter(_.nonEmpty).foreach(v => result.indexName(v)) // String
      self.keySchema.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, KeySchemaElementOps._; result.keySchema(v.map(_.toJava).asJava)
      } // Seq[KeySchemaElement]
      self.projection.foreach { v =>
        import ProjectionOps._; result.projection(v.toJava)
      } // Projection
      self.indexSizeBytes.map(_.longValue).foreach(v => result.indexSizeBytes(v)) // Long
      self.itemCount.map(_.longValue).foreach(v => result.itemCount(v))           // Long
      self.indexArn.filter(_.nonEmpty).foreach(v => result.indexArn(v))           // String

      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexDescriptionOps(val self: JavaLocalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexDescription = {
      ScalaLocalSecondaryIndexDescription()
        .withIndexName(Option(self.indexName)) // String
        .withKeySchema(Option(self.keySchema).map { v =>
          import scala.collection.JavaConverters._, KeySchemaElementOps._; v.asScala.map(_.toScala)
        }) // Seq[KeySchemaElement]
        .withProjection(Option(self.projection).map { v =>
          import ProjectionOps._; v.toScala
        }) // Projection
        .withIndexSizeBytes(Option(self.indexSizeBytes).map(_.longValue)) // Long
        .withItemCount(Option(self.itemCount).map(_.longValue)) // Long
        .withIndexArn(Option(self.indexArn)) // String
    }

  }

}
