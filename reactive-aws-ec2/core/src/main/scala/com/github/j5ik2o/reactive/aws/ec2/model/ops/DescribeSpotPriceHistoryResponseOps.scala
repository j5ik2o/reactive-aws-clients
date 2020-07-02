// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotPriceHistoryResponseBuilderOps(val self: DescribeSpotPriceHistoryResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSpotPriceHistoryResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceHistoryAsScala(value: Option[Seq[SpotPrice]]): DescribeSpotPriceHistoryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.spotPriceHistory(v.asJava)
    }
  }

}

final class DescribeSpotPriceHistoryResponseOps(val self: DescribeSpotPriceHistoryResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotPriceHistoryAsScala: Option[Seq[SpotPrice]] =
    Option(self.spotPriceHistory).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotPriceHistoryResponseOps {

  implicit def toDescribeSpotPriceHistoryResponseBuilderOps(
      v: DescribeSpotPriceHistoryResponse.Builder
  ): DescribeSpotPriceHistoryResponseBuilderOps = new DescribeSpotPriceHistoryResponseBuilderOps(v)

  implicit def toDescribeSpotPriceHistoryResponseOps(
      v: DescribeSpotPriceHistoryResponse
  ): DescribeSpotPriceHistoryResponseOps = new DescribeSpotPriceHistoryResponseOps(v)

}
