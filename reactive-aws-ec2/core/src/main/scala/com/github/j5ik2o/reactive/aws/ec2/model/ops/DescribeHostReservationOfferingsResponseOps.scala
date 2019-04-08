// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeHostReservationOfferingsResponseBuilderOps(
    val self: DescribeHostReservationOfferingsResponse.Builder
) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeHostReservationOfferingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def offeringSetAsScala(value: Option[Seq[HostOffering]]): DescribeHostReservationOfferingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.offeringSet(v.asJava)
    }
  }

}

final class DescribeHostReservationOfferingsResponseOps(val self: DescribeHostReservationOfferingsResponse)
    extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def offeringSetAsScala: Option[Seq[HostOffering]] = Option(self.offeringSet).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeHostReservationOfferingsResponseOps {

  implicit def toDescribeHostReservationOfferingsResponseBuilderOps(
      v: DescribeHostReservationOfferingsResponse.Builder
  ): DescribeHostReservationOfferingsResponseBuilderOps = new DescribeHostReservationOfferingsResponseBuilderOps(v)

  implicit def toDescribeHostReservationOfferingsResponseOps(
      v: DescribeHostReservationOfferingsResponse
  ): DescribeHostReservationOfferingsResponseOps = new DescribeHostReservationOfferingsResponseOps(v)

}
