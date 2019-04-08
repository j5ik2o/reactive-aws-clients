// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrivateIpAddressSpecificationBuilderOps(val self: PrivateIpAddressSpecification.Builder) extends AnyVal {

  final def primaryAsScala(value: Option[Boolean]): PrivateIpAddressSpecification.Builder = {
    value.fold(self) { v =>
      self.primary(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): PrivateIpAddressSpecification.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

}

final class PrivateIpAddressSpecificationOps(val self: PrivateIpAddressSpecification) extends AnyVal {

  final def primaryAsScala: Option[Boolean] = Option(self.primary)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrivateIpAddressSpecificationOps {

  implicit def toPrivateIpAddressSpecificationBuilderOps(
      v: PrivateIpAddressSpecification.Builder
  ): PrivateIpAddressSpecificationBuilderOps = new PrivateIpAddressSpecificationBuilderOps(v)

  implicit def toPrivateIpAddressSpecificationOps(v: PrivateIpAddressSpecification): PrivateIpAddressSpecificationOps =
    new PrivateIpAddressSpecificationOps(v)

}
