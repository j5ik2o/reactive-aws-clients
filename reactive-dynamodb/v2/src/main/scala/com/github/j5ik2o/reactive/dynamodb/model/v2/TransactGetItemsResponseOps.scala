package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ TransactGetItemsResponse => ScalaTransactGetItemsResponse }
import software.amazon.awssdk.services.dynamodb.model.{ TransactGetItemsResponse => JavaTransactGetItemsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object TransactGetItemsResponseOps {

  import ConsumedCapacityOps._
  import ItemResponseOps._

  implicit class JavaTransactGetItemsResponseOps(val self: JavaTransactGetItemsResponse) extends AnyVal {

    def toScala: ScalaTransactGetItemsResponse = {
      ScalaTransactGetItemsResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withResponses(Option(self.responses).map(_.asScala.map(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.asScala.map(_.toScala)))
    }

  }

}
