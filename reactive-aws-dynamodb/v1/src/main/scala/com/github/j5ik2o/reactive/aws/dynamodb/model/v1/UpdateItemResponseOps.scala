package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UpdateItemResult => JavaUpdateItemResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateItemResponse => ScalaUpdateItemResponse }

import scala.collection.JavaConverters._

object UpdateItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaUpdateItemResponseOps(val self: JavaUpdateItemResponse) extends AnyVal {

    def toScala: ScalaUpdateItemResponse = {
      ScalaUpdateItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAttributes(Option(self.getAttributes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map(_.toScala))
    }

  }

}
