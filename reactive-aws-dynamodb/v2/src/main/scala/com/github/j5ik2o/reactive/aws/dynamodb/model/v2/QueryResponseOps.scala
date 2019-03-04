package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryResponse => ScalaQueryResponse }
import software.amazon.awssdk.services.dynamodb.model.{ QueryResponse => JavaQueryResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object QueryResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class JavaQueryResponseOps(val self: JavaQueryResponse) extends AnyVal {

    def toScala: ScalaQueryResponse = {
      ScalaQueryResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withItems(Option(self.items).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withCount(Option(self.count))
        .withScannedCount(Option(self.scannedCount))
        .withLastEvaluatedKey(Option(self.lastEvaluatedKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.toScala))
    }

  }

}
