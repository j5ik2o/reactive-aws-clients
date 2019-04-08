// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceAvailabilityBuilderOps(val self: ScheduledInstanceAvailability.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def availableInstanceCountAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.availableInstanceCount(v)
    }
  }

  final def firstSlotStartTimeAsScala(value: Option[java.time.Instant]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.firstSlotStartTime(v)
    }
  }

  final def hourlyPriceAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def maxTermDurationInDaysAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.maxTermDurationInDays(v)
    }
  }

  final def minTermDurationInDaysAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.minTermDurationInDays(v)
    }
  }

  final def networkPlatformAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.networkPlatform(v)
    }
  }

  final def platformAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def purchaseTokenAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.purchaseToken(v)
    }
  }

  final def recurrenceAsScala(value: Option[ScheduledInstanceRecurrence]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.recurrence(v)
    }
  }

  final def slotDurationInHoursAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.slotDurationInHours(v)
    }
  }

  final def totalScheduledInstanceHoursAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.totalScheduledInstanceHours(v)
    }
  }

}

final class ScheduledInstanceAvailabilityOps(val self: ScheduledInstanceAvailability) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def availableInstanceCountAsScala: Option[Int] = Option(self.availableInstanceCount)

  final def firstSlotStartTimeAsScala: Option[java.time.Instant] = Option(self.firstSlotStartTime)

  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def maxTermDurationInDaysAsScala: Option[Int] = Option(self.maxTermDurationInDays)

  final def minTermDurationInDaysAsScala: Option[Int] = Option(self.minTermDurationInDays)

  final def networkPlatformAsScala: Option[String] = Option(self.networkPlatform)

  final def platformAsScala: Option[String] = Option(self.platform)

  final def purchaseTokenAsScala: Option[String] = Option(self.purchaseToken)

  final def recurrenceAsScala: Option[ScheduledInstanceRecurrence] = Option(self.recurrence)

  final def slotDurationInHoursAsScala: Option[Int] = Option(self.slotDurationInHours)

  final def totalScheduledInstanceHoursAsScala: Option[Int] = Option(self.totalScheduledInstanceHours)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstanceAvailabilityOps {

  implicit def toScheduledInstanceAvailabilityBuilderOps(
      v: ScheduledInstanceAvailability.Builder
  ): ScheduledInstanceAvailabilityBuilderOps = new ScheduledInstanceAvailabilityBuilderOps(v)

  implicit def toScheduledInstanceAvailabilityOps(v: ScheduledInstanceAvailability): ScheduledInstanceAvailabilityOps =
    new ScheduledInstanceAvailabilityOps(v)

}
