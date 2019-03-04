package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndexInfo => ScalaLocalSecondaryIndexInfo }
import software.amazon.awssdk.services.dynamodb.model.{ LocalSecondaryIndexInfo => JavaLocalSecondaryIndexInfo }

import scala.collection.JavaConverters._

object LocalSecondaryIndexInfoOps {
  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexInfoOps(val self: ScalaLocalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexInfo = {
      val result = JavaLocalSecondaryIndexInfo.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      result.build()
    }

  }

  implicit class JavaLocalSecondaryIndexInfoOps(val self: JavaLocalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexInfo = {
      ScalaLocalSecondaryIndexInfo()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala))).withProjection(
          Option(self.projection).map(_.toScala)
        )
    }

  }

}
