package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndex => ScalaLocalSecondaryIndex }
import software.amazon.awssdk.services.dynamodb.model.{ LocalSecondaryIndex => JavaLocalSecondaryIndex }

import scala.collection.JavaConverters._

object LocalSecondaryIndexOps {
  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexOps(val self: ScalaLocalSecondaryIndex) extends AnyVal {

    def toJava: JavaLocalSecondaryIndex = {
      val result = JavaLocalSecondaryIndex.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexOps(val self: JavaLocalSecondaryIndex) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndex = {
      ScalaLocalSecondaryIndex()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
    }
  }

}
