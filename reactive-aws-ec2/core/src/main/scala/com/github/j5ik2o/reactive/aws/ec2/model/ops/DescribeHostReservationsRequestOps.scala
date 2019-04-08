// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostReservationsRequestBuilderOps(val self: DescribeHostReservationsRequest.Builder)
    extends AnyVal {

  final def filterAsScala(value: Option[Seq[Filter]]): DescribeHostReservationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filter(v.asJava)
    }
  }

  final def hostReservationIdSetAsScala(value: Option[Seq[String]]): DescribeHostReservationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.hostReservationIdSet(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeHostReservationsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeHostReservationsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeHostReservationsRequestOps(val self: DescribeHostReservationsRequest) extends AnyVal {

  final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hostReservationIdSetAsScala: Option[Seq[String]] = Option(self.hostReservationIdSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostReservationsRequestOps {

  implicit def toDescribeHostReservationsRequestBuilderOps(
      v: DescribeHostReservationsRequest.Builder
  ): DescribeHostReservationsRequestBuilderOps = new DescribeHostReservationsRequestBuilderOps(v)

  implicit def toDescribeHostReservationsRequestOps(
      v: DescribeHostReservationsRequest
  ): DescribeHostReservationsRequestOps = new DescribeHostReservationsRequestOps(v)

}
