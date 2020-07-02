// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeChangeSetRequestBuilderOps(val self: DescribeChangeSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetNameAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v => self.changeSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeChangeSetRequestOps(val self: DescribeChangeSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeChangeSetRequestOps {

  implicit def toDescribeChangeSetRequestBuilderOps(
      v: DescribeChangeSetRequest.Builder
  ): DescribeChangeSetRequestBuilderOps = new DescribeChangeSetRequestBuilderOps(v)

  implicit def toDescribeChangeSetRequestOps(v: DescribeChangeSetRequest): DescribeChangeSetRequestOps =
    new DescribeChangeSetRequestOps(v)

}
