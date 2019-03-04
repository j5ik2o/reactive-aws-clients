package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GlobalSecondaryIndexInfo => JavaGlobalSecondaryIndexInfo }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndexInfo => ScalaGlobalSecondaryIndexInfo }

import scala.collection.JavaConverters._

object GlobalSecondaryIndexInfoOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaGlobalSecondaryIndexInfoOps(val self: ScalaGlobalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexInfo = {
      val result = new JavaGlobalSecondaryIndexInfo()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      result
    }

  }

  implicit class JavaGlobalSecondaryIndexInfoOps(val self: JavaGlobalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexInfo = {
      ScalaGlobalSecondaryIndexInfo()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
    }
  }

}
