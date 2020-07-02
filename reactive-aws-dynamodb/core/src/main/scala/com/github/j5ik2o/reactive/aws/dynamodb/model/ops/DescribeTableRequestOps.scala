// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTableRequestBuilderOps(val self: DescribeTableRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala(value: Option[String]): DescribeTableRequest.Builder = {
    value.fold(self) { v => self.tableName(v) }
  }

}

final class DescribeTableRequestOps(val self: DescribeTableRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableNameAsScala: Option[String] = Option(self.tableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTableRequestOps {

  implicit def toDescribeTableRequestBuilderOps(v: DescribeTableRequest.Builder): DescribeTableRequestBuilderOps =
    new DescribeTableRequestBuilderOps(v)

  implicit def toDescribeTableRequestOps(v: DescribeTableRequest): DescribeTableRequestOps =
    new DescribeTableRequestOps(v)

}
