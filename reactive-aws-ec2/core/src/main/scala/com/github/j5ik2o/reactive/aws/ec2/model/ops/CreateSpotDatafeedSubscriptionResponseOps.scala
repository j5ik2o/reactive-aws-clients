// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSpotDatafeedSubscriptionResponseBuilderOps(val self: CreateSpotDatafeedSubscriptionResponse.Builder)
    extends AnyVal {

  final def spotDatafeedSubscriptionAsScala(
      value: Option[SpotDatafeedSubscription]
  ): CreateSpotDatafeedSubscriptionResponse.Builder = {
    value.fold(self) { v =>
      self.spotDatafeedSubscription(v)
    }
  }

}

final class CreateSpotDatafeedSubscriptionResponseOps(val self: CreateSpotDatafeedSubscriptionResponse) extends AnyVal {

  final def spotDatafeedSubscriptionAsScala: Option[SpotDatafeedSubscription] = Option(self.spotDatafeedSubscription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSpotDatafeedSubscriptionResponseOps {

  implicit def toCreateSpotDatafeedSubscriptionResponseBuilderOps(
      v: CreateSpotDatafeedSubscriptionResponse.Builder
  ): CreateSpotDatafeedSubscriptionResponseBuilderOps = new CreateSpotDatafeedSubscriptionResponseBuilderOps(v)

  implicit def toCreateSpotDatafeedSubscriptionResponseOps(
      v: CreateSpotDatafeedSubscriptionResponse
  ): CreateSpotDatafeedSubscriptionResponseOps = new CreateSpotDatafeedSubscriptionResponseOps(v)

}
