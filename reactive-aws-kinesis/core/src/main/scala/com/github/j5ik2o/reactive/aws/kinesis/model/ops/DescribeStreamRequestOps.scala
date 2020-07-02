// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class DescribeStreamRequestBuilderOps(val self: DescribeStreamRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala(value: Option[String]): DescribeStreamRequest.Builder = {
    value.fold(self) { v => self.streamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeStreamRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartShardIdAsScala(value: Option[String]): DescribeStreamRequest.Builder = {
    value.fold(self) { v => self.exclusiveStartShardId(v) }
  }

}

final class DescribeStreamRequestOps(val self: DescribeStreamRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamNameAsScala: Option[String] = Option(self.streamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exclusiveStartShardIdAsScala: Option[String] = Option(self.exclusiveStartShardId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamRequestOps {

  implicit def toDescribeStreamRequestBuilderOps(v: DescribeStreamRequest.Builder): DescribeStreamRequestBuilderOps =
    new DescribeStreamRequestBuilderOps(v)

  implicit def toDescribeStreamRequestOps(v: DescribeStreamRequest): DescribeStreamRequestOps =
    new DescribeStreamRequestOps(v)

}
