// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateIamInstanceProfileRequestBuilderOps(val self: DisassociateIamInstanceProfileRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): DisassociateIamInstanceProfileRequest.Builder = {
    value.fold(self) { v => self.associationId(v) }
  }

}

final class DisassociateIamInstanceProfileRequestOps(val self: DisassociateIamInstanceProfileRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateIamInstanceProfileRequestOps {

  implicit def toDisassociateIamInstanceProfileRequestBuilderOps(
      v: DisassociateIamInstanceProfileRequest.Builder
  ): DisassociateIamInstanceProfileRequestBuilderOps = new DisassociateIamInstanceProfileRequestBuilderOps(v)

  implicit def toDisassociateIamInstanceProfileRequestOps(
      v: DisassociateIamInstanceProfileRequest
  ): DisassociateIamInstanceProfileRequestOps = new DisassociateIamInstanceProfileRequestOps(v)

}
