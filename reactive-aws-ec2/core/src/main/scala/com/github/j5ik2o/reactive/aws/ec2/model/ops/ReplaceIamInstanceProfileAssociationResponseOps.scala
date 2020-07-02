// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceIamInstanceProfileAssociationResponseBuilderOps(
    val self: ReplaceIamInstanceProfileAssociationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationAsScala(
      value: Option[IamInstanceProfileAssociation]
  ): ReplaceIamInstanceProfileAssociationResponse.Builder = {
    value.fold(self) { v => self.iamInstanceProfileAssociation(v) }
  }

}

final class ReplaceIamInstanceProfileAssociationResponseOps(val self: ReplaceIamInstanceProfileAssociationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationAsScala: Option[IamInstanceProfileAssociation] =
    Option(self.iamInstanceProfileAssociation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceIamInstanceProfileAssociationResponseOps {

  implicit def toReplaceIamInstanceProfileAssociationResponseBuilderOps(
      v: ReplaceIamInstanceProfileAssociationResponse.Builder
  ): ReplaceIamInstanceProfileAssociationResponseBuilderOps =
    new ReplaceIamInstanceProfileAssociationResponseBuilderOps(v)

  implicit def toReplaceIamInstanceProfileAssociationResponseOps(
      v: ReplaceIamInstanceProfileAssociationResponse
  ): ReplaceIamInstanceProfileAssociationResponseOps = new ReplaceIamInstanceProfileAssociationResponseOps(v)

}
