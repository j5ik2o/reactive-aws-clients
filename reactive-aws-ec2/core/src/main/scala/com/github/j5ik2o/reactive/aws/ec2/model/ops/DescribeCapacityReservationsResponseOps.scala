// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCapacityReservationsResponseBuilderOps(val self: DescribeCapacityReservationsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeCapacityReservationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationsAsScala(
      value: Option[Seq[CapacityReservation]]
  ): DescribeCapacityReservationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityReservations(v.asJava)
    }
  }

}

final class DescribeCapacityReservationsResponseOps(val self: DescribeCapacityReservationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationsAsScala: Option[Seq[CapacityReservation]] = Option(self.capacityReservations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCapacityReservationsResponseOps {

  implicit def toDescribeCapacityReservationsResponseBuilderOps(
      v: DescribeCapacityReservationsResponse.Builder
  ): DescribeCapacityReservationsResponseBuilderOps = new DescribeCapacityReservationsResponseBuilderOps(v)

  implicit def toDescribeCapacityReservationsResponseOps(
      v: DescribeCapacityReservationsResponse
  ): DescribeCapacityReservationsResponseOps = new DescribeCapacityReservationsResponseOps(v)

}
