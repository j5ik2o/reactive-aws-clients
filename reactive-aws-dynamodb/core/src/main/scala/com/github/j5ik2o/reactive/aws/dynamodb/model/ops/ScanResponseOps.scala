// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ScanResponseBuilderOps(val self: ScanResponse.Builder) extends AnyVal {

  final def withItemsAsScala(value: Option[Seq[Map[String, AttributeValue]]]): ScanResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.items(v.map(_.asJava).asJava)
    } // Seq[Map[String, AttributeValue]]
  }

  final def withCountAsScala(value: Option[Int]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  } // Int

  final def withScannedCountAsScala(value: Option[Int]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.scannedCount(v)
    }
  } // Int

  final def withLastEvaluatedKeyAsScala(value: Option[Map[String, AttributeValue]]): ScanResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.lastEvaluatedKey(v.asJava)
    } // Map[String, AttributeValue]
  }

  final def withConsumedCapacityAsScala(value: Option[ConsumedCapacity]): ScanResponse.Builder = {
    value.fold(self) { v =>
      self.consumedCapacity(v)
    }
  } // ConsumedCapacity

}

final class ScanResponseOps(val self: ScanResponse) extends AnyVal {

  final def itemsAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.items).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala.toMap)
  } // Seq[Map[String, AttributeValue]]

  final def countAsScala: Option[Int] = Option(self.count) // Int

  final def scannedCountAsScala: Option[Int] = Option(self.scannedCount) // Int

  final def lastEvaluatedKeyAsScala: Option[Map[String, AttributeValue]] = Option(self.lastEvaluatedKey).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, AttributeValue]

  final def consumedCapacityAsScala: Option[ConsumedCapacity] = Option(self.consumedCapacity) // ConsumedCapacity

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScanResponseOps {

  implicit def toScanResponseBuilderOps(v: ScanResponse.Builder): ScanResponseBuilderOps = new ScanResponseBuilderOps(v)

  implicit def toScanResponseOps(v: ScanResponse): ScanResponseOps = new ScanResponseOps(v)

}
