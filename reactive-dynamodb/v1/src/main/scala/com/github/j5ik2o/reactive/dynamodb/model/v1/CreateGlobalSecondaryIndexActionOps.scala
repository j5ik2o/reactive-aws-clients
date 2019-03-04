package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  CreateGlobalSecondaryIndexAction => JavaCreateGlobalSecondaryIndexAction
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  CreateGlobalSecondaryIndexAction => ScalaCreateGlobalSecondaryIndexAction
}

import scala.collection.JavaConverters._

object CreateGlobalSecondaryIndexActionOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaCreateGlobalSecondaryIndexActionOps(val self: ScalaCreateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toJava: JavaCreateGlobalSecondaryIndexAction = {
      val result = new JavaCreateGlobalSecondaryIndexAction()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      result
    }

  }

  implicit class JavaCreateGlobalSecondaryIndexActionOps(val self: JavaCreateGlobalSecondaryIndexAction)
      extends AnyVal {

    def toScala: ScalaCreateGlobalSecondaryIndexAction = {
      ScalaCreateGlobalSecondaryIndexAction()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
    }

  }

}
