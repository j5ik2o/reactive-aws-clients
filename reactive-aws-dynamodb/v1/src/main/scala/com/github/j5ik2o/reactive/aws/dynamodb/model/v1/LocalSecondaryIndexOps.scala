package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndex => JavaLocalSecondaryIndex }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndex => ScalaLocalSecondaryIndex }

import scala.collection.JavaConverters._

object LocalSecondaryIndexOps {

  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexOps(val self: ScalaLocalSecondaryIndex) extends AnyVal {

    def toJava: JavaLocalSecondaryIndex = {
      val result = new JavaLocalSecondaryIndex()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      result
    }

  }

  implicit class JavaLocalSecondaryIndexOps(val self: JavaLocalSecondaryIndex) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndex = {
      ScalaLocalSecondaryIndex()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
    }
  }

}
