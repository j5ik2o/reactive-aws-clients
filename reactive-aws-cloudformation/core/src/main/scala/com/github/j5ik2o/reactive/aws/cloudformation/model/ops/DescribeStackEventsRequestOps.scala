// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackEventsRequestBuilderOps(val self: DescribeStackEventsRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DescribeStackEventsRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStackEventsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeStackEventsRequestOps(val self: DescribeStackEventsRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackEventsRequestOps {

  implicit def toDescribeStackEventsRequestBuilderOps(
      v: DescribeStackEventsRequest.Builder
  ): DescribeStackEventsRequestBuilderOps = new DescribeStackEventsRequestBuilderOps(v)

  implicit def toDescribeStackEventsRequestOps(v: DescribeStackEventsRequest): DescribeStackEventsRequestOps =
    new DescribeStackEventsRequestOps(v)

}
