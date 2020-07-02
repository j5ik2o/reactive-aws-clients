// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSpotDatafeedSubscriptionRequestBuilderOps(val self: CreateSpotDatafeedSubscriptionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): CreateSpotDatafeedSubscriptionRequest.Builder = {
    value.fold(self) { v => self.bucket(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): CreateSpotDatafeedSubscriptionRequest.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

}

final class CreateSpotDatafeedSubscriptionRequestOps(val self: CreateSpotDatafeedSubscriptionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSpotDatafeedSubscriptionRequestOps {

  implicit def toCreateSpotDatafeedSubscriptionRequestBuilderOps(
      v: CreateSpotDatafeedSubscriptionRequest.Builder
  ): CreateSpotDatafeedSubscriptionRequestBuilderOps = new CreateSpotDatafeedSubscriptionRequestBuilderOps(v)

  implicit def toCreateSpotDatafeedSubscriptionRequestOps(
      v: CreateSpotDatafeedSubscriptionRequest
  ): CreateSpotDatafeedSubscriptionRequestOps = new CreateSpotDatafeedSubscriptionRequestOps(v)

}
