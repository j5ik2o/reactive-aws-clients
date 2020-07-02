// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class AttemptDetailBuilderOps(val self: AttemptDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala(value: Option[AttemptContainerDetail]): AttemptDetail.Builder = {
    value.fold(self) { v => self.container(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v => self.startedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v => self.stoppedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): AttemptDetail.Builder = {
    value.fold(self) { v => self.statusReason(v) }
  }

}

final class AttemptDetailOps(val self: AttemptDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerAsScala: Option[AttemptContainerDetail] = Option(self.container)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttemptDetailOps {

  implicit def toAttemptDetailBuilderOps(v: AttemptDetail.Builder): AttemptDetailBuilderOps =
    new AttemptDetailBuilderOps(v)

  implicit def toAttemptDetailOps(v: AttemptDetail): AttemptDetailOps = new AttemptDetailOps(v)

}
