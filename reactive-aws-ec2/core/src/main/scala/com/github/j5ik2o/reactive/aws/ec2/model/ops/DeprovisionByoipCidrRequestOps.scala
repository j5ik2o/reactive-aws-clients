// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeprovisionByoipCidrRequestBuilderOps(val self: DeprovisionByoipCidrRequest.Builder) extends AnyVal {

  final def cidrAsScala(value: Option[String]): DeprovisionByoipCidrRequest.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

}

final class DeprovisionByoipCidrRequestOps(val self: DeprovisionByoipCidrRequest) extends AnyVal {

  final def cidrAsScala: Option[String] = Option(self.cidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeprovisionByoipCidrRequestOps {

  implicit def toDeprovisionByoipCidrRequestBuilderOps(
      v: DeprovisionByoipCidrRequest.Builder
  ): DeprovisionByoipCidrRequestBuilderOps = new DeprovisionByoipCidrRequestBuilderOps(v)

  implicit def toDeprovisionByoipCidrRequestOps(v: DeprovisionByoipCidrRequest): DeprovisionByoipCidrRequestOps =
    new DeprovisionByoipCidrRequestOps(v)

}
