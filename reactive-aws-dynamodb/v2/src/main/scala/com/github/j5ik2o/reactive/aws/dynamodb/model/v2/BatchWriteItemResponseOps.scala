package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ BatchWriteItemResponse => ScalaBatchWriteItemResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ BatchWriteItemResponse => JavaBatchWriteItemResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object BatchWriteItemResponseOps {

  implicit class JavaBatchWriteItemResponseOps(val self: JavaBatchWriteItemResponse) extends AnyVal {

    def toScala: ScalaBatchWriteItemResponse = {
      ScalaBatchWriteItemResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withUnprocessedItems(Option(self.unprocessedItems).map { v =>
          import scala.collection.JavaConverters._, WriteRequestOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[WriteRequest]], Map-4
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map { v =>
          import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[ItemCollectionMetrics]], Map-4
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import scala.collection.JavaConverters._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity], Seq-6
    }

  }

}
