// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AdvertiseByoipCidrRequestBuilderOps(val self: AdvertiseByoipCidrRequest.Builder) extends AnyVal {

  final def cidrAsScala(value: Option[String]): AdvertiseByoipCidrRequest.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

}

final class AdvertiseByoipCidrRequestOps(val self: AdvertiseByoipCidrRequest) extends AnyVal {

  final def cidrAsScala: Option[String] = Option(self.cidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvertiseByoipCidrRequestOps {

  implicit def toAdvertiseByoipCidrRequestBuilderOps(
      v: AdvertiseByoipCidrRequest.Builder
  ): AdvertiseByoipCidrRequestBuilderOps = new AdvertiseByoipCidrRequestBuilderOps(v)

  implicit def toAdvertiseByoipCidrRequestOps(v: AdvertiseByoipCidrRequest): AdvertiseByoipCidrRequestOps =
    new AdvertiseByoipCidrRequestOps(v)

}
