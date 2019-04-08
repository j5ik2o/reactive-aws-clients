// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AdvertiseByoipCidrResponseBuilderOps(val self: AdvertiseByoipCidrResponse.Builder) extends AnyVal {

  final def byoipCidrAsScala(value: Option[ByoipCidr]): AdvertiseByoipCidrResponse.Builder = {
    value.fold(self) { v =>
      self.byoipCidr(v)
    }
  }

}

final class AdvertiseByoipCidrResponseOps(val self: AdvertiseByoipCidrResponse) extends AnyVal {

  final def byoipCidrAsScala: Option[ByoipCidr] = Option(self.byoipCidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAdvertiseByoipCidrResponseOps {

  implicit def toAdvertiseByoipCidrResponseBuilderOps(
      v: AdvertiseByoipCidrResponse.Builder
  ): AdvertiseByoipCidrResponseBuilderOps = new AdvertiseByoipCidrResponseBuilderOps(v)

  implicit def toAdvertiseByoipCidrResponseOps(v: AdvertiseByoipCidrResponse): AdvertiseByoipCidrResponseOps =
    new AdvertiseByoipCidrResponseOps(v)

}
