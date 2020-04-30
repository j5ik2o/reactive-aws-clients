// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceBuilderOps(val self: ScheduledInstance.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.availabilityZone(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.createDate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hourlyPriceAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.hourlyPrice(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceCountAsScala(value: Option[Int]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.instanceCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkPlatformAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.networkPlatform(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextSlotStartTimeAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.nextSlotStartTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.platform(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def previousSlotEndTimeAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.previousSlotEndTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def recurrenceAsScala(value: Option[ScheduledInstanceRecurrence]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.recurrence(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def scheduledInstanceIdAsScala(value: Option[String]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.scheduledInstanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def slotDurationInHoursAsScala(value: Option[Int]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.slotDurationInHours(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def termEndDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.termEndDate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def termStartDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.termStartDate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalScheduledInstanceHoursAsScala(value: Option[Int]): ScheduledInstance.Builder = {
            value.fold(self){ v => self.totalScheduledInstanceHours(v) }
            } 


}

final class ScheduledInstanceOps(val self: ScheduledInstance) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceCountAsScala: Option[Int] = Option(self.instanceCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[String] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkPlatformAsScala: Option[String] = Option(self.networkPlatform) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextSlotStartTimeAsScala: Option[java.time.Instant] = Option(self.nextSlotStartTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala: Option[String] = Option(self.platform) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def previousSlotEndTimeAsScala: Option[java.time.Instant] = Option(self.previousSlotEndTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def recurrenceAsScala: Option[ScheduledInstanceRecurrence] = Option(self.recurrence) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def scheduledInstanceIdAsScala: Option[String] = Option(self.scheduledInstanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def slotDurationInHoursAsScala: Option[Int] = Option(self.slotDurationInHours) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def termEndDateAsScala: Option[java.time.Instant] = Option(self.termEndDate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def termStartDateAsScala: Option[java.time.Instant] = Option(self.termStartDate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def totalScheduledInstanceHoursAsScala: Option[Int] = Option(self.totalScheduledInstanceHours) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstanceOps {

implicit def toScheduledInstanceBuilderOps(v: ScheduledInstance.Builder): ScheduledInstanceBuilderOps = new ScheduledInstanceBuilderOps(v)

implicit def toScheduledInstanceOps(v: ScheduledInstance): ScheduledInstanceOps = new ScheduledInstanceOps(v)

}

