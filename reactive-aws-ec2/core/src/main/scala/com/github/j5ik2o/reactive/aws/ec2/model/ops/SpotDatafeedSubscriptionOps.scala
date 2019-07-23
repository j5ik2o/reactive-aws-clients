// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotDatafeedSubscriptionBuilderOps(val self: SpotDatafeedSubscription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): SpotDatafeedSubscription.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faultAsScala(value: Option[SpotInstanceStateFault]): SpotDatafeedSubscription.Builder = {
    value.fold(self) { v =>
      self.fault(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): SpotDatafeedSubscription.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): SpotDatafeedSubscription.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[DatafeedSubscriptionState]): SpotDatafeedSubscription.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class SpotDatafeedSubscriptionOps(val self: SpotDatafeedSubscription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faultAsScala: Option[SpotInstanceStateFault] = Option(self.fault)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[DatafeedSubscriptionState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotDatafeedSubscriptionOps {

  implicit def toSpotDatafeedSubscriptionBuilderOps(
      v: SpotDatafeedSubscription.Builder
  ): SpotDatafeedSubscriptionBuilderOps = new SpotDatafeedSubscriptionBuilderOps(v)

  implicit def toSpotDatafeedSubscriptionOps(v: SpotDatafeedSubscription): SpotDatafeedSubscriptionOps =
    new SpotDatafeedSubscriptionOps(v)

}
