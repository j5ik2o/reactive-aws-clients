package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ ScanResult => JavaScanResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ScanResponse => ScalaScanResponse }

import scala.collection.JavaConverters._

object ScanResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class ScalaScanResponseOps(val self: ScalaScanResponse) extends AnyVal {

    def toJava: JavaScanResponse = {
      val result = new JavaScanResponse()
      self.items.map(_.map(_.mapValues(_.toJava).asJava).asJava).foreach(result.setItems)
      self.count.foreach(v => result.setCount(v))
      self.scannedCount.foreach(v => result.setScannedCount(v))
      self.lastEvaluatedKey.map(_.mapValues(_.toJava).asJava).foreach(result.setLastEvaluatedKey)
      self.consumedCapacity.map(_.toJava).foreach(result.setConsumedCapacity)
      result
    }

  }

  implicit class JavaScanResponseOps(val self: JavaScanResponse) extends AnyVal {

    def toScala: ScalaScanResponse = {
      ScalaScanResponse()
        .withItems(Option(self.getItems).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withCount(Option(self.getCount))
        .withScannedCount(Option(self.getScannedCount))
        .withLastEvaluatedKey(Option(self.getLastEvaluatedKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
    }
  }

}
