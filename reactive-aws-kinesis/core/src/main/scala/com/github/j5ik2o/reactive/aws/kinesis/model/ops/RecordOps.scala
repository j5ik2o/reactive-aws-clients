// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RecordBuilderOps(val self: Record.Builder) extends AnyVal {

  final def sequenceNumberAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  }

  final def approximateArrivalTimestampAsScala(value: Option[java.time.Instant]): Record.Builder = {
    value.fold(self) { v =>
      self.approximateArrivalTimestamp(v)
    }
  }

  final def dataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): Record.Builder = {
    value.fold(self) { v =>
      self.data(v)
    }
  }

  final def partitionKeyAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v =>
      self.partitionKey(v)
    }
  }

  final def encryptionTypeAsScala(value: Option[EncryptionType]): Record.Builder = {
    value.fold(self) { v =>
      self.encryptionType(v)
    }
  }

}

final class RecordOps(val self: Record) extends AnyVal {

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

  final def approximateArrivalTimestampAsScala: Option[java.time.Instant] = Option(self.approximateArrivalTimestamp)

  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.data)

  final def partitionKeyAsScala: Option[String] = Option(self.partitionKey)

  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecordOps {

  implicit def toRecordBuilderOps(v: Record.Builder): RecordBuilderOps = new RecordBuilderOps(v)

  implicit def toRecordOps(v: Record): RecordOps = new RecordOps(v)

}
