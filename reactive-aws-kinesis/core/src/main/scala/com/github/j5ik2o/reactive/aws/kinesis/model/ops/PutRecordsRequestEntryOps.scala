// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class PutRecordsRequestEntryBuilderOps(val self: PutRecordsRequestEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): PutRecordsRequestEntry.Builder = {
    value.fold(self) { v => self.data(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def explicitHashKeyAsScala(value: Option[String]): PutRecordsRequestEntry.Builder = {
    value.fold(self) { v => self.explicitHashKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionKeyAsScala(value: Option[String]): PutRecordsRequestEntry.Builder = {
    value.fold(self) { v => self.partitionKey(v) }
  }

}

final class PutRecordsRequestEntryOps(val self: PutRecordsRequestEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.data)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def explicitHashKeyAsScala: Option[String] = Option(self.explicitHashKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionKeyAsScala: Option[String] = Option(self.partitionKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutRecordsRequestEntryOps {

  implicit def toPutRecordsRequestEntryBuilderOps(v: PutRecordsRequestEntry.Builder): PutRecordsRequestEntryBuilderOps =
    new PutRecordsRequestEntryBuilderOps(v)

  implicit def toPutRecordsRequestEntryOps(v: PutRecordsRequestEntry): PutRecordsRequestEntryOps =
    new PutRecordsRequestEntryOps(v)

}
