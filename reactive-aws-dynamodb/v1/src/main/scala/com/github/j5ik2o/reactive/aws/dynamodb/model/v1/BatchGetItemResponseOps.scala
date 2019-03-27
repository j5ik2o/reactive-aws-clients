// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchGetItemResponse => ScalaBatchGetItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ BatchGetItemResult => JavaBatchGetItemResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchGetItemResponseOps {

  implicit class JavaBatchGetItemResponseOps(val self: JavaBatchGetItemResponse) extends AnyVal {

    def toScala: ScalaBatchGetItemResponse = {
      ScalaBatchGetItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withResponses(Option(self.getResponses).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala)))
        }) // Map[String, Seq[Map[String, AttributeValue]]]
        .withUnprocessedKeys(Option(self.getUnprocessedKeys).map { v =>
          import scala.collection.JavaConverters._, KeysAndAttributesOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, KeysAndAttributes]
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
    }

  }

}
