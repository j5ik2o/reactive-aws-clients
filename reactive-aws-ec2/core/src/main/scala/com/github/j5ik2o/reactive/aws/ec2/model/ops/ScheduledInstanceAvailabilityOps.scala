// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceAvailabilityBuilderOps(val self: ScheduledInstanceAvailability.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableInstanceCountAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.availableInstanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firstSlotStartTimeAsScala(value: Option[java.time.Instant]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.firstSlotStartTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hourlyPriceAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.hourlyPrice(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxTermDurationInDaysAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.maxTermDurationInDays(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTermDurationInDaysAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.minTermDurationInDays(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkPlatformAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.networkPlatform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTokenAsScala(value: Option[String]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.purchaseToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurrenceAsScala(value: Option[ScheduledInstanceRecurrence]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.recurrence(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def slotDurationInHoursAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.slotDurationInHours(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalScheduledInstanceHoursAsScala(value: Option[Int]): ScheduledInstanceAvailability.Builder = {
    value.fold(self) { v =>
      self.totalScheduledInstanceHours(v)
    }
  }

}

final class ScheduledInstanceAvailabilityOps(val self: ScheduledInstanceAvailability) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableInstanceCountAsScala: Option[Int] = Option(self.availableInstanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firstSlotStartTimeAsScala: Option[java.time.Instant] = Option(self.firstSlotStartTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hourlyPriceAsScala: Option[String] = Option(self.hourlyPrice)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxTermDurationInDaysAsScala: Option[Int] = Option(self.maxTermDurationInDays)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minTermDurationInDaysAsScala: Option[Int] = Option(self.minTermDurationInDays)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkPlatformAsScala: Option[String] = Option(self.networkPlatform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[String] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def purchaseTokenAsScala: Option[String] = Option(self.purchaseToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recurrenceAsScala: Option[ScheduledInstanceRecurrence] = Option(self.recurrence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def slotDurationInHoursAsScala: Option[Int] = Option(self.slotDurationInHours)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
