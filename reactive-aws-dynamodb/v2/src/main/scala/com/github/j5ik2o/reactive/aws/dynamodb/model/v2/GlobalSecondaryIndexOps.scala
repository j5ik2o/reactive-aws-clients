package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GlobalSecondaryIndex => ScalaGlobalSecondaryIndex }
import software.amazon.awssdk.services.dynamodb.model.{ GlobalSecondaryIndex => JavaGlobalSecondaryIndex }

import scala.collection.JavaConverters._

object GlobalSecondaryIndexOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputOps._

  implicit class ScalaGlobalSecondaryIndexOps(val self: ScalaGlobalSecondaryIndex) extends AnyVal {

    def toJava: JavaGlobalSecondaryIndex = {
      val result = JavaGlobalSecondaryIndex.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexOps(val self: JavaGlobalSecondaryIndex) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndex = {
      ScalaGlobalSecondaryIndex()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
    }

  }

}
