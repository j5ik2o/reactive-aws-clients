package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ LocalSecondaryIndexInfo => JavaLocalSecondaryIndexInfo }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ LocalSecondaryIndexInfo => ScalaLocalSecondaryIndexInfo }

import scala.collection.JavaConverters._

object LocalSecondaryIndexInfoOps {
  import KeySchemaElementOps._
  import ProjectionOps._

  implicit class ScalaLocalSecondaryIndexInfoOps(val self: ScalaLocalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaLocalSecondaryIndexInfo = {
      val result = new JavaLocalSecondaryIndexInfo()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      result
    }

  }

  implicit class JavaLocalSecondaryIndexInfoOps(val self: JavaLocalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaLocalSecondaryIndexInfo = {
      ScalaLocalSecondaryIndexInfo()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala))).withProjection(
          Option(self.getProjection).map(_.toScala)
        )
    }

  }

}
