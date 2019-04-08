// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeGlobalTableSettingsRequestBuilderOps(val self: DescribeGlobalTableSettingsRequest.Builder)
    extends AnyVal {

  final def globalTableNameAsScala(value: Option[String]): DescribeGlobalTableSettingsRequest.Builder = {
    value.fold(self) { v =>
      self.globalTableName(v)
    }
  } // String

}

final class DescribeGlobalTableSettingsRequestOps(val self: DescribeGlobalTableSettingsRequest) extends AnyVal {

  final def globalTableNameAsScala: Option[String] = Option(self.globalTableName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeGlobalTableSettingsRequestOps {

  implicit def toDescribeGlobalTableSettingsRequestBuilderOps(
      v: DescribeGlobalTableSettingsRequest.Builder
  ): DescribeGlobalTableSettingsRequestBuilderOps = new DescribeGlobalTableSettingsRequestBuilderOps(v)

  implicit def toDescribeGlobalTableSettingsRequestOps(
      v: DescribeGlobalTableSettingsRequest
  ): DescribeGlobalTableSettingsRequestOps = new DescribeGlobalTableSettingsRequestOps(v)

}
