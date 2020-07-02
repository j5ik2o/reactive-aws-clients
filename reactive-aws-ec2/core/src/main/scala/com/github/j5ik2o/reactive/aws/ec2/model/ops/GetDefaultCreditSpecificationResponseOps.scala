// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetDefaultCreditSpecificationResponseBuilderOps(val self: GetDefaultCreditSpecificationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyCreditSpecificationAsScala(
      value: Option[InstanceFamilyCreditSpecification]
  ): GetDefaultCreditSpecificationResponse.Builder = {
    value.fold(self) { v => self.instanceFamilyCreditSpecification(v) }
  }

}

final class GetDefaultCreditSpecificationResponseOps(val self: GetDefaultCreditSpecificationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyCreditSpecificationAsScala: Option[InstanceFamilyCreditSpecification] =
    Option(self.instanceFamilyCreditSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetDefaultCreditSpecificationResponseOps {

  implicit def toGetDefaultCreditSpecificationResponseBuilderOps(
      v: GetDefaultCreditSpecificationResponse.Builder
  ): GetDefaultCreditSpecificationResponseBuilderOps = new GetDefaultCreditSpecificationResponseBuilderOps(v)

  implicit def toGetDefaultCreditSpecificationResponseOps(
      v: GetDefaultCreditSpecificationResponse
  ): GetDefaultCreditSpecificationResponseOps = new GetDefaultCreditSpecificationResponseOps(v)

}
