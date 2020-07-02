// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCapacityReservationRequestBuilderOps(val self: CreateCapacityReservationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePlatformAsScala(
      value: Option[CapacityReservationInstancePlatform]
  ): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.instancePlatform(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.availabilityZone(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala(value: Option[String]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.availabilityZoneId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala(value: Option[CapacityReservationTenancy]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.tenancy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.instanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[Boolean]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.ebsOptimized(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ephemeralStorageAsScala(value: Option[Boolean]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.ephemeralStorage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala(value: Option[java.time.Instant]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.endDate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateTypeAsScala(value: Option[EndDateType]): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.endDateType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMatchCriteriaAsScala(
      value: Option[InstanceMatchCriteria]
  ): CreateCapacityReservationRequest.Builder = {
    value.fold(self) { v => self.instanceMatchCriteria(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateCapacityReservationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateCapacityReservationRequestOps(val self: CreateCapacityReservationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instancePlatformAsScala: Option[CapacityReservationInstancePlatform] = Option(self.instancePlatform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tenancyAsScala: Option[CapacityReservationTenancy] = Option(self.tenancy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ephemeralStorageAsScala: Option[Boolean] = Option(self.ephemeralStorage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateAsScala: Option[java.time.Instant] = Option(self.endDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endDateTypeAsScala: Option[EndDateType] = Option(self.endDateType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMatchCriteriaAsScala: Option[InstanceMatchCriteria] = Option(self.instanceMatchCriteria)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
