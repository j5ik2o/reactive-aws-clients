// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeReservedInstancesOfferingsResponseBuilderOps(
    val self: DescribeReservedInstancesOfferingsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingsAsScala(
      value: Option[Seq[ReservedInstancesOffering]]
  ): DescribeReservedInstancesOfferingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reservedInstancesOfferings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeReservedInstancesOfferingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeReservedInstancesOfferingsResponseOps(val self: DescribeReservedInstancesOfferingsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesOfferingsAsScala: Option[Seq[ReservedInstancesOffering]] =
    Option(self.reservedInstancesOfferings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeReservedInstancesOfferingsResponseOps {

  implicit def toDescribeReservedInstancesOfferingsResponseBuilderOps(
      v: DescribeReservedInstancesOfferingsResponse.Builder
  ): DescribeReservedInstancesOfferingsResponseBuilderOps = new DescribeReservedInstancesOfferingsResponseBuilderOps(v)

  implicit def toDescribeReservedInstancesOfferingsResponseOps(
      v: DescribeReservedInstancesOfferingsResponse
  ): DescribeReservedInstancesOfferingsResponseOps = new DescribeReservedInstancesOfferingsResponseOps(v)

}
