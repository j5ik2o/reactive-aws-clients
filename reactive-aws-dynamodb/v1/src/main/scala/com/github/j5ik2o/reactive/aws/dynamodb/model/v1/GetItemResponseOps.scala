package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ GetItemResult => JavaGetItemResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemResponse => ScalaGetItemResponse }

import scala.collection.JavaConverters._

object GetItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class JavaGetItemResponseOps(val self: JavaGetItemResponse) extends AnyVal {

    def toScala: ScalaGetItemResponse = {
      ScalaGetItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withItem(Option(self.getItem).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
    }

  }

}
