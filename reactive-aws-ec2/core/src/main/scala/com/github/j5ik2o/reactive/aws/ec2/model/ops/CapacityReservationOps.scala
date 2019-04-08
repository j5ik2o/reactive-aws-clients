// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationBuilderOps(val self: CapacityReservation.Builder) extends AnyVal {

  final def capacityReservationIdAsScala(value: Option[String]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.capacityReservationId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def instancePlatformAsScala(value: Option[CapacityReservationInstancePlatform]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.instancePlatform(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def tenancyAsScala(value: Option[CapacityReservationTenancy]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  final def totalInstanceCountAsScala(value: Option[Int]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.totalInstanceCount(v)
    }
  }

  final def availableInstanceCountAsScala(value: Option[Int]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.availableInstanceCount(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def ephemeralStorageAsScala(value: Option[Boolean]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.ephemeralStorage(v)
    }
  }

  final def stateAsScala(value: Option[CapacityReservationState]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def endDateAsScala(value: Option[java.time.Instant]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.endDate(v)
    }
  }

  final def endDateTypeAsScala(value: Option[EndDateType]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.endDateType(v)
    }
  }

  final def instanceMatchCriteriaAsScala(value: Option[InstanceMatchCriteria]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.instanceMatchCriteria(v)
    }
  }

  final def createDateAsScala(value: Option[java.time.Instant]): CapacityReservation.Builder = {
    value.fold(self) { v =>
      self.createDate(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CapacityReservation.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CapacityReservationOps(val self: CapacityReservation) extends AnyVal {

  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def instancePlatformAsScala: Option[CapacityReservationInstancePlatform] = Option(self.instancePlatform)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def tenancyAsScala: Option[CapacityReservationTenancy] = Option(self.tenancy)

  final def totalInstanceCountAsScala: Option[Int] = Option(self.totalInstanceCount)

  final def availableInstanceCountAsScala: Option[Int] = Option(self.availableInstanceCount)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def ephemeralStorageAsScala: Option[Boolean] = Option(self.ephemeralStorage)

  final def stateAsScala: Option[CapacityReservationState] = Option(self.state)

  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  final def endDateTypeAsScala: Option[EndDateType] = Option(self.endDateType)

  final def instanceMatchCriteriaAsScala: Option[InstanceMatchCriteria] = Option(self.instanceMatchCriteria)

  final def createDateAsScala: Option[java.time.Instant] = Option(self.createDate)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationOps {

  implicit def toCapacityReservationBuilderOps(v: CapacityReservation.Builder): CapacityReservationBuilderOps =
    new CapacityReservationBuilderOps(v)

  implicit def toCapacityReservationOps(v: CapacityReservation): CapacityReservationOps = new CapacityReservationOps(v)

}
