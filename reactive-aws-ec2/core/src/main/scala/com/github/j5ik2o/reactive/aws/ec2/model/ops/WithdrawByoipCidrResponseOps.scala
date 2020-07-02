// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class WithdrawByoipCidrResponseBuilderOps(val self: WithdrawByoipCidrResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala(value: Option[ByoipCidr]): WithdrawByoipCidrResponse.Builder = {
    value.fold(self) { v => self.byoipCidr(v) }
  }

}

final class WithdrawByoipCidrResponseOps(val self: WithdrawByoipCidrResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala: Option[ByoipCidr] = Option(self.byoipCidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWithdrawByoipCidrResponseOps {

  implicit def toWithdrawByoipCidrResponseBuilderOps(
      v: WithdrawByoipCidrResponse.Builder
  ): WithdrawByoipCidrResponseBuilderOps = new WithdrawByoipCidrResponseBuilderOps(v)

  implicit def toWithdrawByoipCidrResponseOps(v: WithdrawByoipCidrResponse): WithdrawByoipCidrResponseOps =
    new WithdrawByoipCidrResponseOps(v)

}
