package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  CreateGlobalSecondaryIndexAction => ScalaCreateGlobalSecondaryIndexAction
}
import software.amazon.awssdk.services.dynamodb.model.{
  CreateGlobalSecondaryIndexAction => JavaCreateGlobalSecondaryIndexAction
}

import scala.collection.JavaConverters._

object CreateGlobalSecondaryIndexActionOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaCreateGlobalSecondaryIndexActionOps(val self: ScalaCreateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaCreateGlobalSecondaryIndexAction = {
      val result = JavaCreateGlobalSecondaryIndexAction.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      result.build()
    }

  }

  implicit class JavaCreateGlobalSecondaryIndexActionOps(val self: JavaCreateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaCreateGlobalSecondaryIndexAction = {
      ScalaCreateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
    }

  }

}
