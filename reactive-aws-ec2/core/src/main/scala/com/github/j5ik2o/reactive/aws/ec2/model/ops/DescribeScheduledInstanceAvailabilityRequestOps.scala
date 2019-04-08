// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeScheduledInstanceAvailabilityRequestBuilderOps(
    val self: DescribeScheduledInstanceAvailabilityRequest.Builder
) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def firstSlotStartTimeRangeAsScala(
      value: Option[SlotDateTimeRangeRequest]
  ): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.firstSlotStartTimeRange(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def maxSlotDurationInHoursAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.maxSlotDurationInHours(v)
    }
  }

  final def minSlotDurationInHoursAsScala(value: Option[Int]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.minSlotDurationInHours(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def recurrenceAsScala(
      value: Option[ScheduledInstanceRecurrenceRequest]
  ): DescribeScheduledInstanceAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.recurrence(v)
    }
  }

}

final class DescribeScheduledInstanceAvailabilityRequestOps(val self: DescribeScheduledInstanceAvailabilityRequest)
    extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def firstSlotStartTimeRangeAsScala: Option[SlotDateTimeRangeRequest] = Option(self.firstSlotStartTimeRange)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def maxSlotDurationInHoursAsScala: Option[Int] = Option(self.maxSlotDurationInHours)

  final def minSlotDurationInHoursAsScala: Option[Int] = Option(self.minSlotDurationInHours)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def recurrenceAsScala: Option[ScheduledInstanceRecurrenceRequest] = Option(self.recurrence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeScheduledInstanceAvailabilityRequestOps {

  implicit def toDescribeScheduledInstanceAvailabilityRequestBuilderOps(
      v: DescribeScheduledInstanceAvailabilityRequest.Builder
  ): DescribeScheduledInstanceAvailabilityRequestBuilderOps =
    new DescribeScheduledInstanceAvailabilityRequestBuilderOps(v)

  implicit def toDescribeScheduledInstanceAvailabilityRequestOps(
      v: DescribeScheduledInstanceAvailabilityRequest
  ): DescribeScheduledInstanceAvailabilityRequestOps = new DescribeScheduledInstanceAvailabilityRequestOps(v)

}
