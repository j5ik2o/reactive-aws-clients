// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamConsumerResponseBuilderOps(val self: DescribeStreamConsumerResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerDescriptionAsScala(value: Option[ConsumerDescription]): DescribeStreamConsumerResponse.Builder = {
    value.fold(self) { v => self.consumerDescription(v) }
  }

}

final class DescribeStreamConsumerResponseOps(val self: DescribeStreamConsumerResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consumerDescriptionAsScala: Option[ConsumerDescription] = Option(self.consumerDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamConsumerResponseOps {

  implicit def toDescribeStreamConsumerResponseBuilderOps(
      v: DescribeStreamConsumerResponse.Builder
  ): DescribeStreamConsumerResponseBuilderOps = new DescribeStreamConsumerResponseBuilderOps(v)

  implicit def toDescribeStreamConsumerResponseOps(
      v: DescribeStreamConsumerResponse
  ): DescribeStreamConsumerResponseOps = new DescribeStreamConsumerResponseOps(v)

}
