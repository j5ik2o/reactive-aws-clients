package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  LocalSecondaryIndexDescription => ScalaLocalSecondaryIndexDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  LocalSecondaryIndexDescription => JavaLocalSecondaryIndexDescription
}

import scala.collection.JavaConverters._
object LocalSecondaryIndexDescriptionOps {
  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexDescriptionOps(val self: ScalaLocalSecondaryIndexDescription) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexDescription = {
      val result = JavaLocalSecondaryIndexDescription.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      self.indexSizeBytes.foreach(v => result.indexSizeBytes(v))
      self.itemCount.foreach(v => result.itemCount(v))
      self.indexArn.foreach(result.indexArn)
      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexDescriptionOps(val self: JavaLocalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexDescription = {
      ScalaLocalSecondaryIndexDescription()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
        .withIndexSizeBytes(Option(self.indexSizeBytes))
        .withItemCount(Option(self.itemCount))
        .withIndexArn(Option(self.indexArn))
    }

  }
}
