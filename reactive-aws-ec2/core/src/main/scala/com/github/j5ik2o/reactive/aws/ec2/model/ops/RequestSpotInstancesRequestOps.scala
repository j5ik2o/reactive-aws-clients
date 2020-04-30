// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotInstancesRequestBuilderOps(val self: RequestSpotInstancesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneGroupAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.availabilityZoneGroup(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blockDurationMinutesAsScala(value: Option[Int]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.blockDurationMinutes(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceCountAsScala(value: Option[Int]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.instanceCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchGroupAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.launchGroup(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchSpecificationAsScala(value: Option[RequestSpotLaunchSpecification]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.launchSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotPriceAsScala(value: Option[String]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.spotPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[SpotInstanceType]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validFromAsScala(value: Option[java.time.Instant]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.validFrom(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validUntilAsScala(value: Option[java.time.Instant]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.validUntil(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInterruptionBehaviorAsScala(value: Option[InstanceInterruptionBehavior]): RequestSpotInstancesRequest.Builder = {
            value.fold(self){ v => self.instanceInterruptionBehavior(v) }
            } 


}

final class RequestSpotInstancesRequestOps(val self: RequestSpotInstancesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneGroupAsScala: Option[String] = Option(self.availabilityZoneGroup) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blockDurationMinutesAsScala: Option[Int] = Option(self.blockDurationMinutes) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceCountAsScala: Option[Int] = Option(self.instanceCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchGroupAsScala: Option[String] = Option(self.launchGroup) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchSpecificationAsScala: Option[RequestSpotLaunchSpecification] = Option(self.launchSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotPriceAsScala: Option[String] = Option(self.spotPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[SpotInstanceType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInterruptionBehaviorAsScala: Option[InstanceInterruptionBehavior] = Option(self.instanceInterruptionBehavior) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotInstancesRequestOps {

implicit def toRequestSpotInstancesRequestBuilderOps(v: RequestSpotInstancesRequest.Builder): RequestSpotInstancesRequestBuilderOps = new RequestSpotInstancesRequestBuilderOps(v)

implicit def toRequestSpotInstancesRequestOps(v: RequestSpotInstancesRequest): RequestSpotInstancesRequestOps = new RequestSpotInstancesRequestOps(v)

}

