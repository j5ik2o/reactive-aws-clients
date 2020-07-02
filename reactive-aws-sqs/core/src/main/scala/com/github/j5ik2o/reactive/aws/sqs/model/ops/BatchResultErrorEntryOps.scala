// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class BatchResultErrorEntryBuilderOps(val self: BatchResultErrorEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): BatchResultErrorEntry.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def senderFaultAsScala(value: Option[Boolean]): BatchResultErrorEntry.Builder = {
    value.fold(self) { v => self.senderFault(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): BatchResultErrorEntry.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): BatchResultErrorEntry.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class BatchResultErrorEntryOps(val self: BatchResultErrorEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def senderFaultAsScala: Option[Boolean] = Option(self.senderFault)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchResultErrorEntryOps {

  implicit def toBatchResultErrorEntryBuilderOps(v: BatchResultErrorEntry.Builder): BatchResultErrorEntryBuilderOps =
    new BatchResultErrorEntryBuilderOps(v)

  implicit def toBatchResultErrorEntryOps(v: BatchResultErrorEntry): BatchResultErrorEntryOps =
    new BatchResultErrorEntryOps(v)

}
