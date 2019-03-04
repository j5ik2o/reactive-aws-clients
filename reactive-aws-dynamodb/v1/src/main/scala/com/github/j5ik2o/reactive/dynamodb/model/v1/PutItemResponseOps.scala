package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ PutItemResult => JavaPutItemResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ PutItemResponse => ScalaPutItemResponse }

import scala.collection.JavaConverters._

object PutItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaPutItemResponseOps(val self: JavaPutItemResponse) extends AnyVal {

    def toScala: ScalaPutItemResponse = {
      ScalaPutItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withAttributes(Option(self.getAttributes).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
        .withItemCollectionMetrics(Option(self.getItemCollectionMetrics).map(_.toScala))
    }

  }

}
