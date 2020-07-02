// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateIamInstanceProfileResponseBuilderOps(val self: AssociateIamInstanceProfileResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationAsScala(
      value: Option[IamInstanceProfileAssociation]
  ): AssociateIamInstanceProfileResponse.Builder = {
    value.fold(self) { v => self.iamInstanceProfileAssociation(v) }
  }

}

final class AssociateIamInstanceProfileResponseOps(val self: AssociateIamInstanceProfileResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationAsScala: Option[IamInstanceProfileAssociation] =
    Option(self.iamInstanceProfileAssociation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateIamInstanceProfileResponseOps {

  implicit def toAssociateIamInstanceProfileResponseBuilderOps(
      v: AssociateIamInstanceProfileResponse.Builder
  ): AssociateIamInstanceProfileResponseBuilderOps = new AssociateIamInstanceProfileResponseBuilderOps(v)

  implicit def toAssociateIamInstanceProfileResponseOps(
      v: AssociateIamInstanceProfileResponse
  ): AssociateIamInstanceProfileResponseOps = new AssociateIamInstanceProfileResponseOps(v)

}
