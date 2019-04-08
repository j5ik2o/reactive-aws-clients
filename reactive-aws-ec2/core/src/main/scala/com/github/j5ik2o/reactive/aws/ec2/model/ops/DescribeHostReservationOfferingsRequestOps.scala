// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostReservationOfferingsRequestBuilderOps(val self: DescribeHostReservationOfferingsRequest.Builder)
    extends AnyVal {

  final def filterAsScala(value: Option[Seq[Filter]]): DescribeHostReservationOfferingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filter(v.asJava)
    }
  }

  final def maxDurationAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxDuration(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def minDurationAsScala(value: Option[Int]): DescribeHostReservationOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.minDuration(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeHostReservationOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def offeringIdAsScala(value: Option[String]): DescribeHostReservationOfferingsRequest.Builder = {
    value.fold(self) { v =>
      self.offeringId(v)
    }
  }

}

final class DescribeHostReservationOfferingsRequestOps(val self: DescribeHostReservationOfferingsRequest)
    extends AnyVal {

  final def filterAsScala: Option[Seq[Filter]] = Option(self.filter).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxDurationAsScala: Option[Int] = Option(self.maxDuration)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def minDurationAsScala: Option[Int] = Option(self.minDuration)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def offeringIdAsScala: Option[String] = Option(self.offeringId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostReservationOfferingsRequestOps {

  implicit def toDescribeHostReservationOfferingsRequestBuilderOps(
      v: DescribeHostReservationOfferingsRequest.Builder
  ): DescribeHostReservationOfferingsRequestBuilderOps = new DescribeHostReservationOfferingsRequestBuilderOps(v)

  implicit def toDescribeHostReservationOfferingsRequestOps(
      v: DescribeHostReservationOfferingsRequest
  ): DescribeHostReservationOfferingsRequestOps = new DescribeHostReservationOfferingsRequestOps(v)

}
