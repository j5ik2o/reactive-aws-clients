// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeGlobalTableRequestBuilderOps(val self: DescribeGlobalTableRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala(value: Option[String]): DescribeGlobalTableRequest.Builder = {
    value.fold(self) { v => self.globalTableName(v) }
  }

}

final class DescribeGlobalTableRequestOps(val self: DescribeGlobalTableRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeGlobalTableRequestOps {

  implicit def toDescribeGlobalTableRequestBuilderOps(
      v: DescribeGlobalTableRequest.Builder
  ): DescribeGlobalTableRequestBuilderOps = new DescribeGlobalTableRequestBuilderOps(v)

  implicit def toDescribeGlobalTableRequestOps(v: DescribeGlobalTableRequest): DescribeGlobalTableRequestOps =
    new DescribeGlobalTableRequestOps(v)

}
