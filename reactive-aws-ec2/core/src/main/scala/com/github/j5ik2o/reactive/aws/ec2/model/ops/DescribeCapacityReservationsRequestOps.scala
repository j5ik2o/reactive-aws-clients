// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeCapacityReservationsRequestBuilderOps(val self: DescribeCapacityReservationsRequest.Builder)
    extends AnyVal {

  final def capacityReservationIdsAsScala(value: Option[Seq[String]]): DescribeCapacityReservationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capacityReservationIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeCapacityReservationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeCapacityReservationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeCapacityReservationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeCapacityReservationsRequestOps(val self: DescribeCapacityReservationsRequest) extends AnyVal {

  final def capacityReservationIdsAsScala: Option[Seq[String]] = Option(self.capacityReservationIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCapacityReservationsRequestOps {

  implicit def toDescribeCapacityReservationsRequestBuilderOps(
      v: DescribeCapacityReservationsRequest.Builder
  ): DescribeCapacityReservationsRequestBuilderOps = new DescribeCapacityReservationsRequestBuilderOps(v)

  implicit def toDescribeCapacityReservationsRequestOps(
      v: DescribeCapacityReservationsRequest
  ): DescribeCapacityReservationsRequestOps = new DescribeCapacityReservationsRequestOps(v)

}
