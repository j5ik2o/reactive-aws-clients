// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SendDiagnosticInterruptRequestBuilderOps(val self: SendDiagnosticInterruptRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): SendDiagnosticInterruptRequest.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

}

final class SendDiagnosticInterruptRequestOps(val self: SendDiagnosticInterruptRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendDiagnosticInterruptRequestOps {

  implicit def toSendDiagnosticInterruptRequestBuilderOps(
      v: SendDiagnosticInterruptRequest.Builder
  ): SendDiagnosticInterruptRequestBuilderOps = new SendDiagnosticInterruptRequestBuilderOps(v)

  implicit def toSendDiagnosticInterruptRequestOps(
      v: SendDiagnosticInterruptRequest
  ): SendDiagnosticInterruptRequestOps = new SendDiagnosticInterruptRequestOps(v)

}
