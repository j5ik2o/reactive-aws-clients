// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BatchGetItemResponse => JavaBatchGetItemResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchGetItemResponseOps {

  implicit class JavaBatchGetItemResponseOps(val self: JavaBatchGetItemResponse) extends AnyVal {

    def toScala: ScalaBatchGetItemResponse = {
      ScalaBatchGetItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withResponses(Option(self.responses).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala)))
        }) // Map[String, Seq[Map[String, AttributeValue]]]
        .withUnprocessedKeys(Option(self.unprocessedKeys).map { v =>
          import scala.collection.JavaConverters._, KeysAndAttributesOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, KeysAndAttributes]
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
    }

  }

}
