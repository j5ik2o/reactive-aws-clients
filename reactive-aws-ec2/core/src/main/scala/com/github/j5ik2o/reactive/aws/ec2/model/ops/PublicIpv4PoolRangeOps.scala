// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PublicIpv4PoolRangeBuilderOps(val self: PublicIpv4PoolRange.Builder) extends AnyVal {

  final def firstAddressAsScala(value: Option[String]): PublicIpv4PoolRange.Builder = {
    value.fold(self) { v =>
      self.firstAddress(v)
    }
  }

  final def lastAddressAsScala(value: Option[String]): PublicIpv4PoolRange.Builder = {
    value.fold(self) { v =>
      self.lastAddress(v)
    }
  }

  final def addressCountAsScala(value: Option[Int]): PublicIpv4PoolRange.Builder = {
    value.fold(self) { v =>
      self.addressCount(v)
    }
  }

  final def availableAddressCountAsScala(value: Option[Int]): PublicIpv4PoolRange.Builder = {
    value.fold(self) { v =>
      self.availableAddressCount(v)
    }
  }

}

final class PublicIpv4PoolRangeOps(val self: PublicIpv4PoolRange) extends AnyVal {

  final def firstAddressAsScala: Option[String] = Option(self.firstAddress)

  final def lastAddressAsScala: Option[String] = Option(self.lastAddress)

  final def addressCountAsScala: Option[Int] = Option(self.addressCount)

  final def availableAddressCountAsScala: Option[Int] = Option(self.availableAddressCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublicIpv4PoolRangeOps {

  implicit def toPublicIpv4PoolRangeBuilderOps(v: PublicIpv4PoolRange.Builder): PublicIpv4PoolRangeBuilderOps =
    new PublicIpv4PoolRangeBuilderOps(v)

  implicit def toPublicIpv4PoolRangeOps(v: PublicIpv4PoolRange): PublicIpv4PoolRangeOps = new PublicIpv4PoolRangeOps(v)

}
