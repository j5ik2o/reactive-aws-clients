// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceTypeOfferingsResponseBuilderOps(val self: DescribeInstanceTypeOfferingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeOfferingsAsScala(
      value: Option[Seq[InstanceTypeOffering]]
  ): DescribeInstanceTypeOfferingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTypeOfferings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInstanceTypeOfferingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeInstanceTypeOfferingsResponseOps(val self: DescribeInstanceTypeOfferingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeOfferingsAsScala: Option[Seq[InstanceTypeOffering]] = Option(self.instanceTypeOfferings).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceTypeOfferingsResponseOps {

  implicit def toDescribeInstanceTypeOfferingsResponseBuilderOps(
      v: DescribeInstanceTypeOfferingsResponse.Builder
  ): DescribeInstanceTypeOfferingsResponseBuilderOps = new DescribeInstanceTypeOfferingsResponseBuilderOps(v)

  implicit def toDescribeInstanceTypeOfferingsResponseOps(
      v: DescribeInstanceTypeOfferingsResponse
  ): DescribeInstanceTypeOfferingsResponseOps = new DescribeInstanceTypeOfferingsResponseOps(v)

}
