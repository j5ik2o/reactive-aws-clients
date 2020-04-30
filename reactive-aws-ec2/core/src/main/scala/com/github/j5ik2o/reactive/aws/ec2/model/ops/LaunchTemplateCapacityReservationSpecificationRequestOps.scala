// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateCapacityReservationSpecificationRequestBuilderOps(val self: LaunchTemplateCapacityReservationSpecificationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationPreferenceAsScala(value: Option[CapacityReservationPreference]): LaunchTemplateCapacityReservationSpecificationRequest.Builder = {
            value.fold(self){ v => self.capacityReservationPreference(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationTargetAsScala(value: Option[CapacityReservationTarget]): LaunchTemplateCapacityReservationSpecificationRequest.Builder = {
            value.fold(self){ v => self.capacityReservationTarget(v) }
            } 


}

final class LaunchTemplateCapacityReservationSpecificationRequestOps(val self: LaunchTemplateCapacityReservationSpecificationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationPreferenceAsScala: Option[CapacityReservationPreference] = Option(self.capacityReservationPreference) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationTargetAsScala: Option[CapacityReservationTarget] = Option(self.capacityReservationTarget) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateCapacityReservationSpecificationRequestOps {

implicit def toLaunchTemplateCapacityReservationSpecificationRequestBuilderOps(v: LaunchTemplateCapacityReservationSpecificationRequest.Builder): LaunchTemplateCapacityReservationSpecificationRequestBuilderOps = new LaunchTemplateCapacityReservationSpecificationRequestBuilderOps(v)

implicit def toLaunchTemplateCapacityReservationSpecificationRequestOps(v: LaunchTemplateCapacityReservationSpecificationRequest): LaunchTemplateCapacityReservationSpecificationRequestOps = new LaunchTemplateCapacityReservationSpecificationRequestOps(v)

}

