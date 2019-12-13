// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllocateAddressRequestBuilderOps(val self: AllocateAddressRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala(value: Option[DomainType]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.address(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.publicIpv4Pool(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.networkBorderGroup(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerOwnedIpv4PoolAsScala(value: Option[String]): AllocateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.customerOwnedIpv4Pool(v)
    }
  }

}

final class AllocateAddressRequestOps(val self: AllocateAddressRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala: Option[DomainType] = Option(self.domain)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressAsScala: Option[String] = Option(self.address)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkBorderGroupAsScala: Option[String] = Option(self.networkBorderGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerOwnedIpv4PoolAsScala: Option[String] = Option(self.customerOwnedIpv4Pool)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllocateAddressRequestOps {

  implicit def toAllocateAddressRequestBuilderOps(v: AllocateAddressRequest.Builder): AllocateAddressRequestBuilderOps =
    new AllocateAddressRequestBuilderOps(v)

  implicit def toAllocateAddressRequestOps(v: AllocateAddressRequest): AllocateAddressRequestOps =
    new AllocateAddressRequestOps(v)

}
