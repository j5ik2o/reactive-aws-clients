// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceIamInstanceProfileAssociationRequestBuilderOps(
    val self: ReplaceIamInstanceProfileAssociationRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala(
      value: Option[IamInstanceProfileSpecification]
  ): ReplaceIamInstanceProfileAssociationRequest.Builder = {
    value.fold(self) { v => self.iamInstanceProfile(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): ReplaceIamInstanceProfileAssociationRequest.Builder = {
    value.fold(self) { v => self.associationId(v) }
  }

}

final class ReplaceIamInstanceProfileAssociationRequestOps(val self: ReplaceIamInstanceProfileAssociationRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceIamInstanceProfileAssociationRequestOps {

  implicit def toReplaceIamInstanceProfileAssociationRequestBuilderOps(
      v: ReplaceIamInstanceProfileAssociationRequest.Builder
  ): ReplaceIamInstanceProfileAssociationRequestBuilderOps =
    new ReplaceIamInstanceProfileAssociationRequestBuilderOps(v)

  implicit def toReplaceIamInstanceProfileAssociationRequestOps(
      v: ReplaceIamInstanceProfileAssociationRequest
  ): ReplaceIamInstanceProfileAssociationRequestOps = new ReplaceIamInstanceProfileAssociationRequestOps(v)

}
