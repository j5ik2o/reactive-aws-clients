// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstanceAvailabilityRequestBuilderOps(val self: DescribeScheduledInstanceAvailabilityRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def firstSlotStartTimeRangeAsScala(value: Option[SlotDateTimeRangeRequest]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.firstSlotStartTimeRange(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxSlotDurationInHoursAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.maxSlotDurationInHours(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def minSlotDurationInHoursAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.minSlotDurationInHours(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def recurrenceAsScala(value: Option[ScheduledInstanceRecurrenceRequest]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
            value.fold(self){ v => self.recurrence(v) }
            } 


}

final class DescribeScheduledInstanceAvailabilityRequestOps(val self: DescribeScheduledInstanceAvailabilityRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def firstSlotStartTimeRangeAsScala: Option[SlotDateTimeRangeRequest] = Option(self.firstSlotStartTimeRange) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxSlotDurationInHoursAsScala: Option[Int] = Option(self.maxSlotDurationInHours) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def minSlotDurationInHoursAsScala: Option[Int] = Option(self.minSlotDurationInHours) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def recurrenceAsScala: Option[ScheduledInstanceRecurrenceRequest] = Option(self.recurrence) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeScheduledInstanceAvailabilityRequestOps {

implicit def toDescribeScheduledInstanceAvailabilityRequestBuilderOps(v: DescribeScheduledInstanceAvailabilityRequest.Builder): DescribeScheduledInstanceAvailabilityRequestBuilderOps = new DescribeScheduledInstanceAvailabilityRequestBuilderOps(v)

implicit def toDescribeScheduledInstanceAvailabilityRequestOps(v: DescribeScheduledInstanceAvailabilityRequest): DescribeScheduledInstanceAvailabilityRequestOps = new DescribeScheduledInstanceAvailabilityRequestOps(v)

}

