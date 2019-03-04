package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndexInfo => ScalaGlobalSecondaryIndexInfo }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndexInfo => JavaGlobalSecondaryIndexInfo }

import scala.collection.JavaConverters._

object GlobalSecondaryIndexInfoOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaGlobalSecondaryIndexInfoOps(val self: ScalaGlobalSecondaryIndexInfo) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexInfo = {
      val result = JavaGlobalSecondaryIndexInfo.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexInfoOps(val self: JavaGlobalSecondaryIndexInfo) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexInfo = {
      ScalaGlobalSecondaryIndexInfo()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
    }
  }

}
