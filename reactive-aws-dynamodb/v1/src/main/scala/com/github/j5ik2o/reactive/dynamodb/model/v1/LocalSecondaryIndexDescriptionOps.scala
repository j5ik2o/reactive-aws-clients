package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndexDescription => JavaLocalSecondaryIndexDescription }
import com.github.j5ik2o.reactive.dynamodb.model.{
  LocalSecondaryIndexDescription => ScalaLocalSecondaryIndexDescription
}

import scala.collection.JavaConverters._

object LocalSecondaryIndexDescriptionOps {

  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexDescriptionOps(val self: ScalaLocalSecondaryIndexDescription) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexDescription = {
      val result = new JavaLocalSecondaryIndexDescription()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      self.indexSizeBytes.foreach(v => result.setIndexSizeBytes(v))
      self.itemCount.foreach(v => result.setItemCount(v))
      self.indexArn.foreach(result.setIndexArn)
      result
    }

  }

  implicit class JavaLocalSecondaryIndexDescriptionOps(val self: JavaLocalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexDescription = {
      ScalaLocalSecondaryIndexDescription()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
        .withIndexSizeBytes(Option(self.getIndexSizeBytes))
        .withItemCount(Option(self.getItemCount))
        .withIndexArn(Option(self.getIndexArn))
    }

  }

}
