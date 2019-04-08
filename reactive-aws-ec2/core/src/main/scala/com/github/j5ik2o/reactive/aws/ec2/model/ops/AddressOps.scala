// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AddressBuilderOps(val self: Address.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

  final def allocationIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def associationIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  final def domainAsScala(value: Option[DomainType]): Address.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def networkInterfaceOwnerIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceOwnerId(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Address.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def publicIpv4PoolAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.publicIpv4Pool(v)
    }
  }

}

final class AddressOps(val self: Address) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def associationIdAsScala: Option[String] = Option(self.associationId)

  final def domainAsScala: Option[DomainType] = Option(self.domain)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def networkInterfaceOwnerIdAsScala: Option[String] = Option(self.networkInterfaceOwnerId)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddressOps {

  implicit def toAddressBuilderOps(v: Address.Builder): AddressBuilderOps = new AddressBuilderOps(v)

  implicit def toAddressOps(v: Address): AddressOps = new AddressOps(v)

}
