// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeprovisionByoipCidrResponseBuilderOps(val self: DeprovisionByoipCidrResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala(value: Option[ByoipCidr]): DeprovisionByoipCidrResponse.Builder = {
    value.fold(self) { v => self.byoipCidr(v) }
  }

}

final class DeprovisionByoipCidrResponseOps(val self: DeprovisionByoipCidrResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def byoipCidrAsScala: Option[ByoipCidr] = Option(self.byoipCidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeprovisionByoipCidrResponseOps {

  implicit def toDeprovisionByoipCidrResponseBuilderOps(
      v: DeprovisionByoipCidrResponse.Builder
  ): DeprovisionByoipCidrResponseBuilderOps = new DeprovisionByoipCidrResponseBuilderOps(v)

  implicit def toDeprovisionByoipCidrResponseOps(v: DeprovisionByoipCidrResponse): DeprovisionByoipCidrResponseOps =
    new DeprovisionByoipCidrResponseOps(v)

}
