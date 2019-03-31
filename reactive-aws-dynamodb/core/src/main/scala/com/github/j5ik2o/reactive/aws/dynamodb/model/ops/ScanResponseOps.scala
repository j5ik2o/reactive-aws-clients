// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScanResponse => ScalaScanResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ScanResponse => JavaScanResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ScanResponseOps {

  implicit class JavaScanResponseOps(val self: JavaScanResponse) extends AnyVal {

    def toScala: ScalaScanResponse = {
      ScalaScanResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withItems(Option(self.items).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.map(_.asScala.toMap.mapValues(_.toScala))
        }) // Seq[Map[String, AttributeValue]]
        .withCount(Option(self.count).map(_.intValue)) // Int
        .withScannedCount(Option(self.scannedCount).map(_.intValue)) // Int
        .withLastEvaluatedKey(Option(self.lastEvaluatedKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withConsumedCapacity(Option(self.consumedCapacity).map { v =>
          import ConsumedCapacityOps._; v.toScala
        }) // ConsumedCapacity
    }

  }

}
