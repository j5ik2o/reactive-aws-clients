// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTableResponseBuilderOps(val self: DescribeTableResponse.Builder) extends AnyVal {

  final def tableAsScala(value: Option[TableDescription]): DescribeTableResponse.Builder = {
    value.fold(self) { v =>
      self.table(v)
    }
  } // TableDescription

}

final class DescribeTableResponseOps(val self: DescribeTableResponse) extends AnyVal {

  final def tableAsScala: Option[TableDescription] = Option(self.table) // TableDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTableResponseOps {

  implicit def toDescribeTableResponseBuilderOps(v: DescribeTableResponse.Builder): DescribeTableResponseBuilderOps =
    new DescribeTableResponseBuilderOps(v)

  implicit def toDescribeTableResponseOps(v: DescribeTableResponse): DescribeTableResponseOps =
    new DescribeTableResponseOps(v)

}
