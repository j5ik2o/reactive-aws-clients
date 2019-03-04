package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DeleteItemResult => JavaDeleteItemResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteItemResponse => ScalaDeleteItemResponse }

import scala.collection.JavaConverters._

object DeleteItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaDeleteItemResponseOps(val self: JavaDeleteItemResponse) extends AnyVal {

    def toScala: ScalaDeleteItemResponse = {
      ScalaDeleteItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAttributes(Option(self.getAttributes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map(_.toScala))
    }

  }

}
