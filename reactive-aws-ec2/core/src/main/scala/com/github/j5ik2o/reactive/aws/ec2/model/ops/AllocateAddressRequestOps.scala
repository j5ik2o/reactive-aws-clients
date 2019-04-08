// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateAddressRequestBuilderOps(val self: AllocateAddressRequest.Builder) extends AnyVal {

  final def domainAsScala(value: Option[DomainType]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

  final def addressAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.address(v)
    }
  }

  final def publicIpv4PoolAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.publicIpv4Pool(v)
    }
  }

}

final class AllocateAddressRequestOps(val self: AllocateAddressRequest) extends AnyVal {

  final def domainAsScala: Option[DomainType] = Option(self.domain)

  final def addressAsScala: Option[String] = Option(self.address)

  final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateAddressRequestOps {

  implicit def toAllocateAddressRequestBuilderOps(v: AllocateAddressRequest.Builder): AllocateAddressRequestBuilderOps =
    new AllocateAddressRequestBuilderOps(v)

  implicit def toAllocateAddressRequestOps(v: AllocateAddressRequest): AllocateAddressRequestOps =
    new AllocateAddressRequestOps(v)

}
