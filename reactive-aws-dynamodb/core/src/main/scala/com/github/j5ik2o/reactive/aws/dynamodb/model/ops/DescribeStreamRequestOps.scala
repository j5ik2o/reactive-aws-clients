// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeStreamRequestBuilderOps(val self: DescribeStreamRequest.Builder) extends AnyVal {

  final def withStreamArnAsScala(value: Option[String]): DescribeStreamRequest.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  } // String

  final def withLimitAsScala(value: Option[Int]): DescribeStreamRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  } // Int

  final def withExclusiveStartShardIdAsScala(value: Option[String]): DescribeStreamRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartShardId(v)
    }
  } // String

}

final class DescribeStreamRequestOps(val self: DescribeStreamRequest) extends AnyVal {

  final def streamArnAsScala: Option[String] = Option(self.streamArn) // String

  final def limitAsScala: Option[Int] = Option(self.limit) // Int

  final def exclusiveStartShardIdAsScala: Option[String] = Option(self.exclusiveStartShardId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStreamRequestOps {

  implicit def toDescribeStreamRequestBuilderOps(v: DescribeStreamRequest.Builder): DescribeStreamRequestBuilderOps =
    new DescribeStreamRequestBuilderOps(v)

  implicit def toDescribeStreamRequestOps(v: DescribeStreamRequest): DescribeStreamRequestOps =
    new DescribeStreamRequestOps(v)

}
