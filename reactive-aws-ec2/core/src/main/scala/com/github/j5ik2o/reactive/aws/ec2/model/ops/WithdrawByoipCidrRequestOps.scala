// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class WithdrawByoipCidrRequestBuilderOps(val self: WithdrawByoipCidrRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): WithdrawByoipCidrRequest.Builder = {
    value.fold(self) { v => self.cidr(v) }
  }

}

final class WithdrawByoipCidrRequestOps(val self: WithdrawByoipCidrRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToWithdrawByoipCidrRequestOps {

  implicit def toWithdrawByoipCidrRequestBuilderOps(
      v: WithdrawByoipCidrRequest.Builder
  ): WithdrawByoipCidrRequestBuilderOps = new WithdrawByoipCidrRequestBuilderOps(v)

  implicit def toWithdrawByoipCidrRequestOps(v: WithdrawByoipCidrRequest): WithdrawByoipCidrRequestOps =
    new WithdrawByoipCidrRequestOps(v)

}
