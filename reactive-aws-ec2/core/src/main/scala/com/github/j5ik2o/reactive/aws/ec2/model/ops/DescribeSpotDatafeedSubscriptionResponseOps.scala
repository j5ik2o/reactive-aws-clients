// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSpotDatafeedSubscriptionResponseBuilderOps(
    val self: DescribeSpotDatafeedSubscriptionResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotDatafeedSubscriptionAsScala(
      value: Option[SpotDatafeedSubscription]
  ): DescribeSpotDatafeedSubscriptionResponse.Builder = {
    value.fold(self) { v => self.spotDatafeedSubscription(v) }
  }

}

final class DescribeSpotDatafeedSubscriptionResponseOps(val self: DescribeSpotDatafeedSubscriptionResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotDatafeedSubscriptionAsScala: Option[SpotDatafeedSubscription] = Option(self.spotDatafeedSubscription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSpotDatafeedSubscriptionResponseOps {

  implicit def toDescribeSpotDatafeedSubscriptionResponseBuilderOps(
      v: DescribeSpotDatafeedSubscriptionResponse.Builder
  ): DescribeSpotDatafeedSubscriptionResponseBuilderOps = new DescribeSpotDatafeedSubscriptionResponseBuilderOps(v)

  implicit def toDescribeSpotDatafeedSubscriptionResponseOps(
      v: DescribeSpotDatafeedSubscriptionResponse
  ): DescribeSpotDatafeedSubscriptionResponseOps = new DescribeSpotDatafeedSubscriptionResponseOps(v)

}
