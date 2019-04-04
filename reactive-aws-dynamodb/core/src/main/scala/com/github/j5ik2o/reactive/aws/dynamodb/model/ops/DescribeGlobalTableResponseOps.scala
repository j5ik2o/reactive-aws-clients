// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeGlobalTableResponseBuilderOps(val self: DescribeGlobalTableResponse.Builder) extends AnyVal {

  final def withGlobalTableDescriptionAsScala(
      value: Option[GlobalTableDescription]
  ): DescribeGlobalTableResponse.Builder = {
    value.fold(self) { v =>
      self.globalTableDescription(v)
    }
  } // GlobalTableDescription

}

final class DescribeGlobalTableResponseOps(val self: DescribeGlobalTableResponse) extends AnyVal {

  final def globalTableDescriptionAsScala: Option[GlobalTableDescription] =
    Option(self.globalTableDescription) // GlobalTableDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeGlobalTableResponseOps {

  implicit def toDescribeGlobalTableResponseBuilderOps(
      v: DescribeGlobalTableResponse.Builder
  ): DescribeGlobalTableResponseBuilderOps = new DescribeGlobalTableResponseBuilderOps(v)

  implicit def toDescribeGlobalTableResponseOps(v: DescribeGlobalTableResponse): DescribeGlobalTableResponseOps =
    new DescribeGlobalTableResponseOps(v)

}
