package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  TransactWriteItemsResponse => ScalaTransactWriteItemsResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItemsResponse => JavaTransactWriteItemsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemsResponseOps {

  implicit class JavaTransactWriteItemsResponseOps(val self: JavaTransactWriteItemsResponse) extends AnyVal {

    def toScala: ScalaTransactWriteItemsResponse = {
      ScalaTransactWriteItemsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
        .withItemCollectionMetrics(Option(self.itemCollectionMetrics).map { v =>
          import scala.collection.JavaConverters._, ItemCollectionMetricsOps._;
          v.asScala.toMap.mapValues(_.asScala.map(_.toScala))
        }) // Map[String, Seq[ItemCollectionMetrics]]
    }

  }

}
