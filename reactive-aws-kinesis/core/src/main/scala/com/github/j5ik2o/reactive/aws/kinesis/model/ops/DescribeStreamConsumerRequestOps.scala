// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamConsumerRequestBuilderOps(val self: DescribeStreamConsumerRequest.Builder) extends AnyVal {

  final def streamARNAsScala(value: Option[String]): DescribeStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.streamARN(v)
    }
  }

  final def consumerNameAsScala(value: Option[String]): DescribeStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  }

  final def consumerARNAsScala(value: Option[String]): DescribeStreamConsumerRequest.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  }

}

final class DescribeStreamConsumerRequestOps(val self: DescribeStreamConsumerRequest) extends AnyVal {

  final def streamARNAsScala: Option[String] = Option(self.streamARN)

  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamConsumerRequestOps {

  implicit def toDescribeStreamConsumerRequestBuilderOps(
      v: DescribeStreamConsumerRequest.Builder
  ): DescribeStreamConsumerRequestBuilderOps = new DescribeStreamConsumerRequestBuilderOps(v)

  implicit def toDescribeStreamConsumerRequestOps(v: DescribeStreamConsumerRequest): DescribeStreamConsumerRequestOps =
    new DescribeStreamConsumerRequestOps(v)

}
