// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ScanResponseBuilderOps(val self: ScanResponse.Builder) extends AnyVal {

  final def itemsAsScala(value: Option[Seq[Map[String, AttributeValue]]]): ScanResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.items(v.map(_.asJava).asJava)
    }
  }

  final def countAsScala(value: Option[Int]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  final def scannedCountAsScala(value: Option[Int]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.scannedCount(v)
    }
  }

  final def lastEvaluatedKeyAsScala(value: Option[Map[String, AttributeValue]]): ScanResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.lastEvaluatedKey(v.asJava)
    }
  }

  final def consumedCapacityAsScala(value: Option[ConsumedCapacity]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  }

}

final class ScanResponseOps(val self: ScanResponse) extends AnyVal {

  final def itemsAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.items).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap)
  }

  final def countAsScala: Option[Int] = Option(self.count)

  final def scannedCountAsScala: Option[Int] = Option(self.scannedCount)

  final def lastEvaluatedKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.lastEvaluatedKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScanResponseOps {

  implicit def toScanResponseBuilderOps(v: ScanResponse.Builder): ScanResponseBuilderOps = new ScanResponseBuilderOps(v)

  implicit def toScanResponseOps(v: ScanResponse): ScanResponseOps = new ScanResponseOps(v)

}
