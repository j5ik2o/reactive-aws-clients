// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyDefaultCreditSpecificationResponseBuilderOps(
    val self: ModifyDefaultCreditSpecificationResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyCreditSpecificationAsScala(
      value: Option[InstanceFamilyCreditSpecification]
  ): ModifyDefaultCreditSpecificationResponse.Builder = {
    value.fold(self) { v =>
      self.instanceFamilyCreditSpecification(v)
    }
  }

}

final class ModifyDefaultCreditSpecificationResponseOps(val self: ModifyDefaultCreditSpecificationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyCreditSpecificationAsScala: Option[InstanceFamilyCreditSpecification] =
    Option(self.instanceFamilyCreditSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyDefaultCreditSpecificationResponseOps {

  implicit def toModifyDefaultCreditSpecificationResponseBuilderOps(
      v: ModifyDefaultCreditSpecificationResponse.Builder
  ): ModifyDefaultCreditSpecificationResponseBuilderOps = new ModifyDefaultCreditSpecificationResponseBuilderOps(v)

  implicit def toModifyDefaultCreditSpecificationResponseOps(
      v: ModifyDefaultCreditSpecificationResponse
  ): ModifyDefaultCreditSpecificationResponseOps = new ModifyDefaultCreditSpecificationResponseOps(v)

}
