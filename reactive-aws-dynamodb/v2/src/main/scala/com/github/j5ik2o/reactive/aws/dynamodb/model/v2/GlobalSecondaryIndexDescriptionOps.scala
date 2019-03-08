package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  IndexStatus,
  GlobalSecondaryIndexDescription => ScalaGlobalSecondaryIndexDescription
}
import software.amazon.awssdk.services.dynamodb.model.{
  GlobalSecondaryIndexDescription => JavaGlobalSecondaryIndexDescription
}

import scala.collection.JavaConverters._
object GlobalSecondaryIndexDescriptionOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputDescriptionOps._

  implicit class ScalaGlobalSecondaryIndexDescriptionOps(val self: ScalaGlobalSecondaryIndexDescription)
      extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexDescription = {
      val result = JavaGlobalSecondaryIndexDescription.builder()
      self.indexName.foreach(result.indexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.keySchema)
      self.projection.map(_.toJava).foreach(result.projection)
      self.indexStatus.map(_.entryName).foreach(result.indexStatus)
      self.backfilling.foreach(v => result.backfilling(v))
      self.provisionedThroughput.map(_.toJava).foreach(result.provisionedThroughput)
      self.indexSizeBytes.foreach(v => result.indexSizeBytes(v))
      self.itemCount.foreach(v => result.itemCount(v))
      self.indexArn.foreach(result.indexArn)
      result.build()
    }

  }

  implicit class JavaGlobalSecondaryIndexDescriptionOps(val self: JavaGlobalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexDescription = {
      ScalaGlobalSecondaryIndexDescription()
        .withIndexName(Option(self.indexName))
        .withKeySchema(Option(self.keySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.projection).map(_.toScala))
        .withIndexStatus(Option(self.indexStatus).map(_.toString).map(IndexStatus.withName))
        .withBackfilling(Option(self.backfilling))
        .withProvisionedThroughput(Option(self.provisionedThroughput).map(_.toScala))
        .withIndexSizeBytes(Option(self.indexSizeBytes))
        .withItemCount(Option(self.itemCount))
        .withIndexArn(Option(self.indexArn))
    }

  }

}
