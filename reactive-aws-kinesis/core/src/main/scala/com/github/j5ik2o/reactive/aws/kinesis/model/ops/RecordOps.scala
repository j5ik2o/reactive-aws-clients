// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class RecordBuilderOps(val self: Record.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v => self.sequenceNumber(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateArrivalTimestampAsScala(value: Option[java.time.Instant]): Record.Builder = {
    value.fold(self) { v => self.approximateArrivalTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): Record.Builder = {
    value.fold(self) { v => self.data(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionKeyAsScala(value: Option[String]): Record.Builder = {
    value.fold(self) { v => self.partitionKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala(value: Option[EncryptionType]): Record.Builder = {
    value.fold(self) { v => self.encryptionType(v) }
  }

}

final class RecordOps(val self: Record) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def approximateArrivalTimestampAsScala: Option[java.time.Instant] = Option(self.approximateArrivalTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.data)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionKeyAsScala: Option[String] = Option(self.partitionKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala: Option[EncryptionType] = Option(self.encryptionType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRecordOps {

  implicit def toRecordBuilderOps(v: Record.Builder): RecordBuilderOps = new RecordBuilderOps(v)

  implicit def toRecordOps(v: Record): RecordOps = new RecordOps(v)

}
