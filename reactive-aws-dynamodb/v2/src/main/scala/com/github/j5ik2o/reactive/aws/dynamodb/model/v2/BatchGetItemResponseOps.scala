package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemResponse => JavaBatchGetItemResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object BatchGetItemResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._
  import KeysAndAttributesOps._

  implicit class JavaBatchGetItemResponseOps(val self: JavaBatchGetItemResponse) extends AnyVal {
    def toScala: ScalaBatchGetItemResponse = {
      ScalaBatchGetItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withResponses(
          Option(self.responses)
            .map(_.asScala.toMap).map(
              _.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala)))
            )
        )
        .withUnprocessedKeys(Option(self.unprocessedKeys).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.asScala.map(_.toScala)))
    }

  }

}
