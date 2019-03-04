package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndex => JavaGlobalSecondaryIndex }
import com.github.j5ik2o.reactive.dynamodb.model.{ GlobalSecondaryIndex => ScalaGlobalSecondaryIndex }

import scala.collection.JavaConverters._

object GlobalSecondaryIndexOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaGlobalSecondaryIndexOps(val self: ScalaGlobalSecondaryIndex) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndex = {
      val result = new JavaGlobalSecondaryIndex()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      result
    }

  }

  implicit class JavaGlobalSecondaryIndexOps(val self: JavaGlobalSecondaryIndex) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndex = {
      ScalaGlobalSecondaryIndex()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
    }

  }

}
