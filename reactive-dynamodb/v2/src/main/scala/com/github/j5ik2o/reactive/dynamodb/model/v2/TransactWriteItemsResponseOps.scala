package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ TransactWriteItemsResponse => ScalaTransactWriteItemsResponse }
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItemsResponse => JavaTransactWriteItemsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object TransactWriteItemsResponseOps {

  import ConsumedCapacityOps._
  import ItemCollectionMetricsOps._

  implicit class JavaTransactWriteItemsResponseOps(val self: JavaTransactWriteItemsResponse) extends AnyVal {

    def toScala: ScalaTransactWriteItemsResponse = {
      ScalaTransactWriteItemsResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.asScala.map(_.toScala)))
        .withItemCollectionMetrics(
          Option(self.itemCollectionMetrics).map(_.asScala.toMap.mapValues(_.asScala.map(_.toScala)))
        )
    }

  }

}
