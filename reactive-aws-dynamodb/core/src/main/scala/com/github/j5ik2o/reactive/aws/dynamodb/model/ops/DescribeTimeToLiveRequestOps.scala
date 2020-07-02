// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTimeToLiveRequestBuilderOps(val self: DescribeTimeToLiveRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): DescribeTimeToLiveRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

}

final class DescribeTimeToLiveRequestOps(val self: DescribeTimeToLiveRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTimeToLiveRequestOps {

  implicit def toDescribeTimeToLiveRequestBuilderOps(
      v: DescribeTimeToLiveRequest.Builder
  ): DescribeTimeToLiveRequestBuilderOps = new DescribeTimeToLiveRequestBuilderOps(v)

  implicit def toDescribeTimeToLiveRequestOps(v: DescribeTimeToLiveRequest): DescribeTimeToLiveRequestOps =
    new DescribeTimeToLiveRequestOps(v)

}
