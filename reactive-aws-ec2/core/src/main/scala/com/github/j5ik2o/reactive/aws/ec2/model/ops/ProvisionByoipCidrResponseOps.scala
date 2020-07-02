// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProvisionByoipCidrResponseBuilderOps(val self: ProvisionByoipCidrResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala(value: Option[ByoipCidr]): ProvisionByoipCidrResponse.Builder = {
    value.fold(self) { v => self.byoipCidr(v) }
  }

}

final class ProvisionByoipCidrResponseOps(val self: ProvisionByoipCidrResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala: Option[ByoipCidr] = Option(self.byoipCidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionByoipCidrResponseOps {

  implicit def toProvisionByoipCidrResponseBuilderOps(
      v: ProvisionByoipCidrResponse.Builder
  ): ProvisionByoipCidrResponseBuilderOps = new ProvisionByoipCidrResponseBuilderOps(v)

  implicit def toProvisionByoipCidrResponseOps(v: ProvisionByoipCidrResponse): ProvisionByoipCidrResponseOps =
    new ProvisionByoipCidrResponseOps(v)

}
