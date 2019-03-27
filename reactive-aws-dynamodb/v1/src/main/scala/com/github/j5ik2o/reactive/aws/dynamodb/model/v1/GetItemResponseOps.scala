// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetItemResponse => ScalaGetItemResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetItemResult => JavaGetItemResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetItemResponseOps {

  implicit class JavaGetItemResponseOps(val self: JavaGetItemResponse) extends AnyVal {

    def toScala: ScalaGetItemResponse = {
      ScalaGetItemResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withItem(Option(self.getItem).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import ConsumedCapacityOps._; v.toScala
        }) // ConsumedCapacity
    }

  }

}
