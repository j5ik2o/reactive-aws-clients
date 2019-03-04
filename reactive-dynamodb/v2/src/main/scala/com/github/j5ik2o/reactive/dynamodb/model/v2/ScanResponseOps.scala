package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ ScanResponse => ScalaScanResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ScanResponse => JavaScanResponse }

import scala.collection.JavaConverters._

object ScanResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class ScalaScanResponseOps(val self: ScalaScanResponse) extends AnyVal {

    def toJava: JavaScanResponse = {
      val result = JavaScanResponse.builder()
      self.items.map(_.map(_.mapValues(_.toJava).asJava).asJava).foreach(result.items)
      self.count.foreach(v => result.count(v))
      self.scannedCount.foreach(v => result.scannedCount(v))
      self.lastEvaluatedKey.map(_.mapValues(_.toJava).asJava).foreach(result.lastEvaluatedKey)
      self.consumedCapacity.map(_.toJava).foreach(result.consumedCapacity)
      result.build()
    }

  }

  implicit class JavaScanResponseOps(val self: JavaScanResponse) extends AnyVal {

    def toScala: ScalaScanResponse = {
      ScalaScanResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withItems(Option(self.items).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withCount(Option(self.count))
        .withScannedCount(Option(self.scannedCount))
        .withLastEvaluatedKey(Option(self.lastEvaluatedKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.consumedCapacity).map(_.toScala))
    }
  }

}
