package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ BatchGetItemResult => JavaBatchGetItemResult }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse }

import scala.collection.JavaConverters._

object BatchGetItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import KeysAndAttributesOps._

  implicit class JavaBatchGetItemResponseOps(val self: JavaBatchGetItemResult) extends AnyVal {

    def toScala: ScalaBatchGetItemResponse = {
      ScalaBatchGetItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withResponses(
          Option(self.getResponses)
            .map(_.asScala.toMap).map(
              _.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala)))
            )
        ).withUnprocessedKeys(Option(self.getUnprocessedKeys).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.asScala.map(_.toScala)))
    }

  }

}
