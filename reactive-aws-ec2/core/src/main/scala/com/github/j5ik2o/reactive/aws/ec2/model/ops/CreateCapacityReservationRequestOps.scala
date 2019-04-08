// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCapacityReservationRequestBuilderOps(val self: CreateCapacityReservationRequest.Builder)
    extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def instancePlatformAsScala(
      value: Option[CapacityReservationInstancePlatform]
  ): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.instancePlatform(v)
    }
  }

  final def availabilityZoneAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def tenancyAsScala(value: Option[CapacityReservationTenancy]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.tenancy(v)
    }
  }

  final def instanceCountAsScala(value: Option[Int]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def ephemeralStorageAsScala(value: Option[Boolean]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.ephemeralStorage(v)
    }
  }

  final def endDateAsScala(value: Option[java.time.Instant]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.endDate(v)
    }
  }

  final def endDateTypeAsScala(value: Option[EndDateType]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.endDateType(v)
    }
  }

  final def instanceMatchCriteriaAsScala(
      value: Option[InstanceMatchCriteria]
  ): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceMatchCriteria(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateCapacityReservationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateCapacityReservationRequestOps(val self: CreateCapacityReservationRequest) extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def instancePlatformAsScala: Option[CapacityReservationInstancePlatform] = Option(self.instancePlatform)

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def tenancyAsScala: Option[CapacityReservationTenancy] = Option(self.tenancy)

  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def ephemeralStorageAsScala: Option[Boolean] = Option(self.ephemeralStorage)

  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  final def endDateTypeAsScala: Option[EndDateType] = Option(self.endDateType)

  final def instanceMatchCriteriaAsScala: Option[InstanceMatchCriteria] = Option(self.instanceMatchCriteria)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCapacityReservationRequestOps {

  implicit def toCreateCapacityReservationRequestBuilderOps(
      v: CreateCapacityReservationRequest.Builder
  ): CreateCapacityReservationRequestBuilderOps = new CreateCapacityReservationRequestBuilderOps(v)

  implicit def toCreateCapacityReservationRequestOps(
      v: CreateCapacityReservationRequest
  ): CreateCapacityReservationRequestOps = new CreateCapacityReservationRequestOps(v)

}
