// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceBuilderOps(val self: ScheduledInstance.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def createDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  final def hourlyPriceAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  final def instanceCountAsScala(value: Option[Int]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def networkPlatformAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.networkPlatform(v)
    }
  }

  final def nextSlotStartTimeAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.nextSlotStartTime(v)
    }
  }

  final def platformAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def previousSlotEndTimeAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.previousSlotEndTime(v)
    }
  }

  final def recurrenceAsScala(value: Option[ScheduledInstanceRecurrence]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.recurrence(v)
    }
  }

  final def scheduledInstanceIdAsScala(value: Option[String]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.scheduledInstanceId(v)
    }
  }

  final def slotDurationInHoursAsScala(value: Option[Int]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.slotDurationInHours(v)
    }
  }

  final def termEndDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.termEndDate(v)
    }
  }

  final def termStartDateAsScala(value: Option[java.time.Instant]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.termStartDate(v)
    }
  }

  final def totalScheduledInstanceHoursAsScala(value: Option[Int]): ScheduledInstance.Builder = {
    value.fold(self) { v =>
      self.totalScheduledInstanceHours(v)
    }
  }

}

final class ScheduledInstanceOps(val self: ScheduledInstance) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def networkPlatformAsScala: Option[String] = Option(self.networkPlatform)

  final def nextSlotStartTimeAsScala: Option[java.time.Instant] = Option(self.nextSlotStartTime)

  final def platformAsScala: Option[String] = Option(self.platform)

  final def previousSlotEndTimeAsScala: Option[java.time.Instant] = Option(self.previousSlotEndTime)

  final def recurrenceAsScala: Option[ScheduledInstanceRecurrence] = Option(self.recurrence)

  final def scheduledInstanceIdAsScala: Option[String] = Option(self.scheduledInstanceId)

  final def slotDurationInHoursAsScala: Option[Int] = Option(self.slotDurationInHours)

  final def termEndDateAsScala: Option[java.time.Instant] = Option(self.termEndDate)

  final def termStartDateAsScala: Option[java.time.Instant] = Option(self.termStartDate)

  final def totalScheduledInstanceHoursAsScala: Option[Int] = Option(self.totalScheduledInstanceHours)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstanceOps {

  implicit def toScheduledInstanceBuilderOps(v: ScheduledInstance.Builder): ScheduledInstanceBuilderOps =
    new ScheduledInstanceBuilderOps(v)

  implicit def toScheduledInstanceOps(v: ScheduledInstance): ScheduledInstanceOps = new ScheduledInstanceOps(v)

}
