// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCapacityReservationsResponseBuilderOps(val self: DescribeCapacityReservationsResponse.Builder)
    extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeCapacityReservationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def capacityReservationsAsScala(
      value: Option[Seq[CapacityReservation]]
  ): DescribeCapacityReservationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capacityReservations(v.asJava)
    }
  }

}

final class DescribeCapacityReservationsResponseOps(val self: DescribeCapacityReservationsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def capacityReservationsAsScala: Option[Seq[CapacityReservation]] = Option(self.capacityReservations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
