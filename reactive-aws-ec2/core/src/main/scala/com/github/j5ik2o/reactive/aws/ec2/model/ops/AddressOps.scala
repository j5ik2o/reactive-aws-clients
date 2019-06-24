// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AddressBuilderOps(val self: Address.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala(value: Option[DomainType]): Address.Builder = {
    value.fold(self) { v =>
      self.domain(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceOwnerIdAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceOwnerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Address.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolAsScala(value: Option[String]): Address.Builder = {
    value.fold(self) { v =>
      self.publicIpv4Pool(v)
    }
  }

}

final class AddressOps(val self: Address) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpAsScala: Option[String] = Option(self.publicIp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainAsScala: Option[DomainType] = Option(self.domain)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceOwnerIdAsScala: Option[String] = Option(self.networkInterfaceOwnerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publicIpv4PoolAsScala: Option[String] = Option(self.publicIpv4Pool)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddressOps {

  implicit def toAddressBuilderOps(v: Address.Builder): AddressBuilderOps = new AddressBuilderOps(v)

  implicit def toAddressOps(v: Address): AddressOps = new AddressOps(v)

}
