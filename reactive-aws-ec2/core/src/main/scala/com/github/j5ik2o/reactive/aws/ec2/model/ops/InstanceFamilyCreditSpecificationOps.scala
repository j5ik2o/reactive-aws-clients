// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceFamilyCreditSpecificationBuilderOps(val self: InstanceFamilyCreditSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala(value: Option[UnlimitedSupportedInstanceFamily]): InstanceFamilyCreditSpecification.Builder = {
            value.fold(self){ v => self.instanceFamily(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala(value: Option[String]): InstanceFamilyCreditSpecification.Builder = {
            value.fold(self){ v => self.cpuCredits(v) }
            } 


}

final class InstanceFamilyCreditSpecificationOps(val self: InstanceFamilyCreditSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceFamilyAsScala: Option[UnlimitedSupportedInstanceFamily] = Option(self.instanceFamily) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceFamilyCreditSpecificationOps {

implicit def toInstanceFamilyCreditSpecificationBuilderOps(v: InstanceFamilyCreditSpecification.Builder): InstanceFamilyCreditSpecificationBuilderOps = new InstanceFamilyCreditSpecificationBuilderOps(v)

implicit def toInstanceFamilyCreditSpecificationOps(v: InstanceFamilyCreditSpecification): InstanceFamilyCreditSpecificationOps = new InstanceFamilyCreditSpecificationOps(v)

}

