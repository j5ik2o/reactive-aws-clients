// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateAddressResponseBuilderOps(val self: AssociateAddressResponse.Builder) extends AnyVal {

  final def associationIdAsScala(value: Option[String]): AssociateAddressResponse.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

}

final class AssociateAddressResponseOps(val self: AssociateAddressResponse) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateAddressResponseOps {

  implicit def toAssociateAddressResponseBuilderOps(
      v: AssociateAddressResponse.Builder
  ): AssociateAddressResponseBuilderOps = new AssociateAddressResponseBuilderOps(v)

  implicit def toAssociateAddressResponseOps(v: AssociateAddressResponse): AssociateAddressResponseOps =
    new AssociateAddressResponseOps(v)

}
