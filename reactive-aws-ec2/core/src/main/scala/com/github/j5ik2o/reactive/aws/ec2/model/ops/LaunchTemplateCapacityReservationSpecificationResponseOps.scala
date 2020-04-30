// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateCapacityReservationSpecificationResponseBuilderOps(val self: LaunchTemplateCapacityReservationSpecificationResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationPreferenceAsScala(value: Option[CapacityReservationPreference]): LaunchTemplateCapacityReservationSpecificationResponse.Builder = {
            value.fold(self){ v => self.capacityReservationPreference(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationTargetAsScala(value: Option[CapacityReservationTargetResponse]): LaunchTemplateCapacityReservationSpecificationResponse.Builder = {
            value.fold(self){ v => self.capacityReservationTarget(v) }
            } 


}

final class LaunchTemplateCapacityReservationSpecificationResponseOps(val self: LaunchTemplateCapacityReservationSpecificationResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationPreferenceAsScala: Option[CapacityReservationPreference] = Option(self.capacityReservationPreference) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationTargetAsScala: Option[CapacityReservationTargetResponse] = Option(self.capacityReservationTarget) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateCapacityReservationSpecificationResponseOps {

implicit def toLaunchTemplateCapacityReservationSpecificationResponseBuilderOps(v: LaunchTemplateCapacityReservationSpecificationResponse.Builder): LaunchTemplateCapacityReservationSpecificationResponseBuilderOps = new LaunchTemplateCapacityReservationSpecificationResponseBuilderOps(v)

implicit def toLaunchTemplateCapacityReservationSpecificationResponseOps(v: LaunchTemplateCapacityReservationSpecificationResponse): LaunchTemplateCapacityReservationSpecificationResponseOps = new LaunchTemplateCapacityReservationSpecificationResponseOps(v)

}

