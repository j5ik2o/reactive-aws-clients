// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyDefaultCreditSpecificationRequestBuilderOps(val self: ModifyDefaultCreditSpecificationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala(value: Option[UnlimitedSupportedInstanceFamily]): ModifyDefaultCreditSpecificationRequest.Builder = {
            value.fold(self){ v => self.instanceFamily(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala(value: Option[String]): ModifyDefaultCreditSpecificationRequest.Builder = {
            value.fold(self){ v => self.cpuCredits(v) }
            } 


}

final class ModifyDefaultCreditSpecificationRequestOps(val self: ModifyDefaultCreditSpecificationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala: Option[UnlimitedSupportedInstanceFamily] = Option(self.instanceFamily) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyDefaultCreditSpecificationRequestOps {

implicit def toModifyDefaultCreditSpecificationRequestBuilderOps(v: ModifyDefaultCreditSpecificationRequest.Builder): ModifyDefaultCreditSpecificationRequestBuilderOps = new ModifyDefaultCreditSpecificationRequestBuilderOps(v)

implicit def toModifyDefaultCreditSpecificationRequestOps(v: ModifyDefaultCreditSpecificationRequest): ModifyDefaultCreditSpecificationRequestOps = new ModifyDefaultCreditSpecificationRequestOps(v)

}

