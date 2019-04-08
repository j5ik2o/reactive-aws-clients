// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateIamInstanceProfileRequestBuilderOps(val self: AssociateIamInstanceProfileRequest.Builder)
    extends AnyVal {

  final def iamInstanceProfileAsScala(
      value: Option[IamInstanceProfileSpecification]
  ): AssociateIamInstanceProfileRequest.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): AssociateIamInstanceProfileRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class AssociateIamInstanceProfileRequestOps(val self: AssociateIamInstanceProfileRequest) extends AnyVal {

  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateIamInstanceProfileRequestOps {

  implicit def toAssociateIamInstanceProfileRequestBuilderOps(
      v: AssociateIamInstanceProfileRequest.Builder
  ): AssociateIamInstanceProfileRequestBuilderOps = new AssociateIamInstanceProfileRequestBuilderOps(v)

  implicit def toAssociateIamInstanceProfileRequestOps(
      v: AssociateIamInstanceProfileRequest
  ): AssociateIamInstanceProfileRequestOps = new AssociateIamInstanceProfileRequestOps(v)

}
