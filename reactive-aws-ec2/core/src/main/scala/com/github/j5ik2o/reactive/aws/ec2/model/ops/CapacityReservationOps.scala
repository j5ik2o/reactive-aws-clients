// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationBuilderOps(val self: CapacityReservation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationIdAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.capacityReservationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.ownerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationArnAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.capacityReservationArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneIdAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.availabilityZoneId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instancePlatformAsScala(value: Option[CapacityReservationInstancePlatform]): CapacityReservation.Builder = {
            value.fold(self){ v => self.instancePlatform(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): CapacityReservation.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tenancyAsScala(value: Option[CapacityReservationTenancy]): CapacityReservation.Builder = {
            value.fold(self){ v => self.tenancy(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalInstanceCountAsScala(value: Option[Int]): CapacityReservation.Builder = {
            value.fold(self){ v => self.totalInstanceCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availableInstanceCountAsScala(value: Option[Int]): CapacityReservation.Builder = {
            value.fold(self){ v => self.availableInstanceCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala(value: Option[Boolean]): CapacityReservation.Builder = {
            value.fold(self){ v => self.ebsOptimized(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ephemeralStorageAsScala(value: Option[Boolean]): CapacityReservation.Builder = {
            value.fold(self){ v => self.ephemeralStorage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[CapacityReservationState]): CapacityReservation.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endDateAsScala(value: Option[java.time.Instant]): CapacityReservation.Builder = {
            value.fold(self){ v => self.endDate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endDateTypeAsScala(value: Option[EndDateType]): CapacityReservation.Builder = {
            value.fold(self){ v => self.endDateType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceMatchCriteriaAsScala(value: Option[InstanceMatchCriteria]): CapacityReservation.Builder = {
            value.fold(self){ v => self.instanceMatchCriteria(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createDateAsScala(value: Option[java.time.Instant]): CapacityReservation.Builder = {
            value.fold(self){ v => self.createDate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): CapacityReservation.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class CapacityReservationOps(val self: CapacityReservation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala: Option[String] = Option(self.ownerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationArnAsScala: Option[String] = Option(self.capacityReservationArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[String] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instancePlatformAsScala: Option[CapacityReservationInstancePlatform] = Option(self.instancePlatform) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tenancyAsScala: Option[CapacityReservationTenancy] = Option(self.tenancy) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalInstanceCountAsScala: Option[Int] = Option(self.totalInstanceCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availableInstanceCountAsScala: Option[Int] = Option(self.availableInstanceCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ephemeralStorageAsScala: Option[Boolean] = Option(self.ephemeralStorage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[CapacityReservationState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def endDateTypeAsScala: Option[EndDateType] = Option(self.endDateType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceMatchCriteriaAsScala: Option[InstanceMatchCriteria] = Option(self.instanceMatchCriteria) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationOps {

implicit def toCapacityReservationBuilderOps(v: CapacityReservation.Builder): CapacityReservationBuilderOps = new CapacityReservationBuilderOps(v)

implicit def toCapacityReservationOps(v: CapacityReservation): CapacityReservationOps = new CapacityReservationOps(v)

}

