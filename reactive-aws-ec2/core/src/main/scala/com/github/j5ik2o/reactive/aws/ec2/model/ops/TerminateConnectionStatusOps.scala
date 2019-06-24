// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TerminateConnectionStatusBuilderOps(val self: TerminateConnectionStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionIdAsScala(value: Option[String]): TerminateConnectionStatus.Builder = {
    value.fold(self) { v =>
      self.connectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStatusAsScala(value: Option[ClientVpnConnectionStatus]): TerminateConnectionStatus.Builder = {
    value.fold(self) { v =>
      self.previousStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentStatusAsScala(value: Option[ClientVpnConnectionStatus]): TerminateConnectionStatus.Builder = {
    value.fold(self) { v =>
      self.currentStatus(v)
    }
  }

}

final class TerminateConnectionStatusOps(val self: TerminateConnectionStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionIdAsScala: Option[String] = Option(self.connectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStatusAsScala: Option[ClientVpnConnectionStatus] = Option(self.previousStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentStatusAsScala: Option[ClientVpnConnectionStatus] = Option(self.currentStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTerminateConnectionStatusOps {

  implicit def toTerminateConnectionStatusBuilderOps(
      v: TerminateConnectionStatus.Builder
  ): TerminateConnectionStatusBuilderOps = new TerminateConnectionStatusBuilderOps(v)

  implicit def toTerminateConnectionStatusOps(v: TerminateConnectionStatus): TerminateConnectionStatusOps =
    new TerminateConnectionStatusOps(v)

}
