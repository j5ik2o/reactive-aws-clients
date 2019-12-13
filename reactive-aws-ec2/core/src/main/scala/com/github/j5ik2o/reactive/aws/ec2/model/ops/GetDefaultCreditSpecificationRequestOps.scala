// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetDefaultCreditSpecificationRequestBuilderOps(val self: GetDefaultCreditSpecificationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala(
      value: Option[UnlimitedSupportedInstanceFamily]
  ): GetDefaultCreditSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

}

final class GetDefaultCreditSpecificationRequestOps(val self: GetDefaultCreditSpecificationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala: Option[UnlimitedSupportedInstanceFamily] = Option(self.instanceFamily)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDefaultCreditSpecificationRequestOps {

  implicit def toGetDefaultCreditSpecificationRequestBuilderOps(
      v: GetDefaultCreditSpecificationRequest.Builder
  ): GetDefaultCreditSpecificationRequestBuilderOps = new GetDefaultCreditSpecificationRequestBuilderOps(v)

  implicit def toGetDefaultCreditSpecificationRequestOps(
      v: GetDefaultCreditSpecificationRequest
  ): GetDefaultCreditSpecificationRequestOps = new GetDefaultCreditSpecificationRequestOps(v)

}
