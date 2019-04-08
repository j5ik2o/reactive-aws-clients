// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTimeToLiveResponseBuilderOps(val self: DescribeTimeToLiveResponse.Builder) extends AnyVal {

  final def timeToLiveDescriptionAsScala(value: Option[TimeToLiveDescription]): DescribeTimeToLiveResponse.Builder = {
    value.fold(self) { v =>
      self.timeToLiveDescription(v)
    }
  }

}

final class DescribeTimeToLiveResponseOps(val self: DescribeTimeToLiveResponse) extends AnyVal {

  final def timeToLiveDescriptionAsScala: Option[TimeToLiveDescription] = Option(self.timeToLiveDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTimeToLiveResponseOps {

  implicit def toDescribeTimeToLiveResponseBuilderOps(
      v: DescribeTimeToLiveResponse.Builder
  ): DescribeTimeToLiveResponseBuilderOps = new DescribeTimeToLiveResponseBuilderOps(v)

  implicit def toDescribeTimeToLiveResponseOps(v: DescribeTimeToLiveResponse): DescribeTimeToLiveResponseOps =
    new DescribeTimeToLiveResponseOps(v)

}
