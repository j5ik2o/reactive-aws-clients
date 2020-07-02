// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DescribeTableResponseBuilderOps(val self: DescribeTableResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAsScala(value: Option[TableDescription]): DescribeTableResponse.Builder = {
    value.fold(self) { v => self.table(v) }
  }

}

final class DescribeTableResponseOps(val self: DescribeTableResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tableAsScala: Option[TableDescription] = Option(self.table)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTableResponseOps {

  implicit def toDescribeTableResponseBuilderOps(v: DescribeTableResponse.Builder): DescribeTableResponseBuilderOps =
    new DescribeTableResponseBuilderOps(v)

  implicit def toDescribeTableResponseOps(v: DescribeTableResponse): DescribeTableResponseOps =
    new DescribeTableResponseOps(v)

}
