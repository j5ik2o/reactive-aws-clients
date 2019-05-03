// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeUpdateRequestBuilderOps(val self: DescribeUpdateRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): DescribeUpdateRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def updateIdAsScala(value: Option[String]): DescribeUpdateRequest.Builder = {
    value.fold(self) { v =>
      self.updateId(v)
    }
  }

}

final class DescribeUpdateRequestOps(val self: DescribeUpdateRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def updateIdAsScala: Option[String] = Option(self.updateId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeUpdateRequestOps {

  implicit def toDescribeUpdateRequestBuilderOps(v: DescribeUpdateRequest.Builder): DescribeUpdateRequestBuilderOps =
    new DescribeUpdateRequestBuilderOps(v)

  implicit def toDescribeUpdateRequestOps(v: DescribeUpdateRequest): DescribeUpdateRequestOps =
    new DescribeUpdateRequestOps(v)

}
