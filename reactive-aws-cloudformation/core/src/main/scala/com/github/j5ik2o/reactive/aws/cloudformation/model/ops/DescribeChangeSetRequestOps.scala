// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeChangeSetRequestBuilderOps(val self: DescribeChangeSetRequest.Builder) extends AnyVal {

  final def changeSetNameAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def nextTokenAsScala(value: Option[String]): DescribeChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeChangeSetRequestOps(val self: DescribeChangeSetRequest) extends AnyVal {

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeChangeSetRequestOps {

  implicit def toDescribeChangeSetRequestBuilderOps(
      v: DescribeChangeSetRequest.Builder
  ): DescribeChangeSetRequestBuilderOps = new DescribeChangeSetRequestBuilderOps(v)

  implicit def toDescribeChangeSetRequestOps(v: DescribeChangeSetRequest): DescribeChangeSetRequestOps =
    new DescribeChangeSetRequestOps(v)

}
