package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  GlobalSecondaryIndexDescription => JavaGlobalSecondaryIndexDescription
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  IndexStatus,
  GlobalSecondaryIndexDescription => ScalaGlobalSecondaryIndexDescription
}

import scala.collection.JavaConverters._

object GlobalSecondaryIndexDescriptionOps {

  import KeySchemaElementOps._
  import ProjectionOps._
  import ProvisionedThroughputDescriptionOps._

  implicit class ScalaGlobalSecondaryIndexDescriptionOps(val self: ScalaGlobalSecondaryIndexDescription)
      extends AnyVal {

    def toJava: JavaGlobalSecondaryIndexDescription = {
      val result = new JavaGlobalSecondaryIndexDescription()
      self.indexName.foreach(result.setIndexName)
      self.keySchema.map(_.map(_.toJava).asJava).foreach(result.setKeySchema)
      self.projection.map(_.toJava).foreach(result.setProjection)
      self.indexStatus.map(_.entryName).foreach(result.setIndexStatus)
      self.backFilling.foreach(v => result.setBackfilling(v))
      self.provisionedThroughput.map(_.toJava).foreach(result.setProvisionedThroughput)
      self.indexSizeBytes.foreach(v => result.setIndexSizeBytes(v))
      self.itemCount.foreach(v => result.setItemCount(v))
      self.indexArn.foreach(result.setIndexArn)
      result
    }

  }

  implicit class JavaGlobalSecondaryIndexDescriptionOps(val self: JavaGlobalSecondaryIndexDescription) extends AnyVal {

    def toScala: ScalaGlobalSecondaryIndexDescription = {
      ScalaGlobalSecondaryIndexDescription()
        .withIndexName(Option(self.getIndexName))
        .withKeySchema(Option(self.getKeySchema).map(_.asScala.map(_.toScala)))
        .withProjection(Option(self.getProjection).map(_.toScala))
        .withIndexStatus(Option(self.getIndexStatus).map(IndexStatus.withName))
        .withBackFilling(Option(self.getBackfilling))
        .withProvisionedThroughput(Option(self.getProvisionedThroughput).map(_.toScala))
        .withIndexSizeBytes(Option(self.getIndexSizeBytes))
        .withItemCount(Option(self.getItemCount))
        .withIndexArn(Option(self.getIndexArn))
    }

  }

}
