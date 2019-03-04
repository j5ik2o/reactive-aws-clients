package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ BatchWriteItemResponse => ScalaBatchWriteItemResponse }
import software.amazon.awssdk.services.dynamodb.model.{ BatchWriteItemResponse => JavaBatchWriteItemResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object BatchWriteItemResponseOps {

  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._
  import WriteRequestOps._

  implicit class JavaBatchWriteItemResponseOps(val self: JavaBatchWriteItemResponse) extends AnyVal {

    def toScala: ScalaBatchWriteItemResponse = {
      ScalaBatchWriteItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withUnprocessedItems(Option(self.unprocessedItems()).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala))))
        .withItemCollectionMetrics(
          Option(self.itemCollectionMetrics()).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala)))
        )
        .withConsumedCapacity(Option(self.consumedCapacity()).map(_.asScala.map(_.toScala)))
    }

  }

}
