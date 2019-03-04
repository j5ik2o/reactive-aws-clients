package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TransactGetItemsResult => JavaTransactGetItemsResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ TransactGetItemsResponse => ScalaTransactGetItemsResponse }

import scala.collection.JavaConverters._

object TransactGetItemsResponseOps {

  import ItemResponseOps._
  import ConsumedCapacityOps._

  implicit class JavaTransactGetItemsResponseOps(val self: JavaTransactGetItemsResponse) extends AnyVal {

    def toScala: ScalaTransactGetItemsResponse = {
      ScalaTransactGetItemsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withResponses(Option(self.getResponses).map(_.asScala.map(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.asScala.map(_.toScala)))
    }

  }

}
