// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetLaunchTemplateOverridesRequestBuilderOps(val self: FleetLaunchTemplateOverridesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[InstanceType]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxPriceAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.maxPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def weightedCapacityAsScala(value: Option[Double]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.weightedCapacity(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def priorityAsScala(value: Option[Double]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.priority(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala(value: Option[Placement]): FleetLaunchTemplateOverridesRequest.Builder = {
            value.fold(self){ v => self.placement(v) }
            } 


}

final class FleetLaunchTemplateOverridesRequestOps(val self: FleetLaunchTemplateOverridesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxPriceAsScala: Option[String] = Option(self.maxPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def weightedCapacityAsScala: Option[Double] = Option(self.weightedCapacity) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def priorityAsScala: Option[Double] = Option(self.priority) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala: Option[Placement] = Option(self.placement) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetLaunchTemplateOverridesRequestOps {

implicit def toFleetLaunchTemplateOverridesRequestBuilderOps(v: FleetLaunchTemplateOverridesRequest.Builder): FleetLaunchTemplateOverridesRequestBuilderOps = new FleetLaunchTemplateOverridesRequestBuilderOps(v)

implicit def toFleetLaunchTemplateOverridesRequestOps(v: FleetLaunchTemplateOverridesRequest): FleetLaunchTemplateOverridesRequestOps = new FleetLaunchTemplateOverridesRequestOps(v)

}

