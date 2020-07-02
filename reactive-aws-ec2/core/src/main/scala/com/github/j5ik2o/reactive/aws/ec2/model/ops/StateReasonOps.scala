// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StateReasonBuilderOps(val self: StateReason.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): StateReason.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): StateReason.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class StateReasonOps(val self: StateReason) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStateReasonOps {

  implicit def toStateReasonBuilderOps(v: StateReason.Builder): StateReasonBuilderOps = new StateReasonBuilderOps(v)

  implicit def toStateReasonOps(v: StateReason): StateReasonOps = new StateReasonOps(v)

}
