// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateAddressRequestBuilderOps(val self: AssociateAddressRequest.Builder) extends AnyVal {

  final def allocationIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.allocationId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

  final def allowReassociationAsScala(value: Option[Boolean]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.allowReassociation(v)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): AssociateAddressRequest.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

}

final class AssociateAddressRequestOps(val self: AssociateAddressRequest) extends AnyVal {

  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

  final def allowReassociationAsScala: Option[Boolean] = Option(self.allowReassociation)

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateAddressRequestOps {

  implicit def toAssociateAddressRequestBuilderOps(
      v: AssociateAddressRequest.Builder
  ): AssociateAddressRequestBuilderOps = new AssociateAddressRequestBuilderOps(v)

  implicit def toAssociateAddressRequestOps(v: AssociateAddressRequest): AssociateAddressRequestOps =
    new AssociateAddressRequestOps(v)

}
