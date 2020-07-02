// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetCapacityReservationUsageResponseBuilderOps(val self: GetCapacityReservationUsageResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala(value: Option[String]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.capacityReservationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalInstanceCountAsScala(value: Option[Int]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.totalInstanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableInstanceCountAsScala(value: Option[Int]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.availableInstanceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[CapacityReservationState]): GetCapacityReservationUsageResponse.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceUsagesAsScala(value: Option[Seq[InstanceUsage]]): GetCapacityReservationUsageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceUsages(v.asJava)
    }
  }

}

final class GetCapacityReservationUsageResponseOps(val self: GetCapacityReservationUsageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalInstanceCountAsScala: Option[Int] = Option(self.totalInstanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableInstanceCountAsScala: Option[Int] = Option(self.availableInstanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[CapacityReservationState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceUsagesAsScala: Option[Seq[InstanceUsage]] =
    Option(self.instanceUsages).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetCapacityReservationUsageResponseOps {

  implicit def toGetCapacityReservationUsageResponseBuilderOps(
      v: GetCapacityReservationUsageResponse.Builder
  ): GetCapacityReservationUsageResponseBuilderOps = new GetCapacityReservationUsageResponseBuilderOps(v)

  implicit def toGetCapacityReservationUsageResponseOps(
      v: GetCapacityReservationUsageResponse
  ): GetCapacityReservationUsageResponseOps = new GetCapacityReservationUsageResponseOps(v)

}
