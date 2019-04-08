// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateAddressResponseBuilderOps(val self: AllocateAddressResponse.Builder) extends AnyVal {

  final def publicIpAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

  final def allocationIdAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def publicIpv4PoolAsScala(value: Option[String]): AllocateAddressResponse.Builder = {
    value.fold(self) { v =>
      self.publicIpv4Pool(v)
    }
  }

  final def domainAsScala(value: Option[DomainType]): AllocateAddressResponse.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

}

final class AllocateAddressResponseOps(val self: AllocateAddressResponse) extends AnyVal {

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool)

  final def domainAsScala: Option[DomainType] = Option(self.domain)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateAddressResponseOps {

  implicit def toAllocateAddressResponseBuilderOps(
      v: AllocateAddressResponse.Builder
  ): AllocateAddressResponseBuilderOps = new AllocateAddressResponseBuilderOps(v)

  implicit def toAllocateAddressResponseOps(v: AllocateAddressResponse): AllocateAddressResponseOps =
    new AllocateAddressResponseOps(v)

}
