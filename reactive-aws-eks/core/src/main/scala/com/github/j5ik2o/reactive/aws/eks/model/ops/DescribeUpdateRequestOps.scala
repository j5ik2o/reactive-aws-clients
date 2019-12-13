// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeUpdateRequestBuilderOps(val self: DescribeUpdateRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DescribeUpdateRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateIdAsScala(value: Option[String]): DescribeUpdateRequest.Builder = {
    value.fold(self) { v =>
      self.updateId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): DescribeUpdateRequest.Builder = {
    value.fold(self) { v =>
      self.nodegroupName(v)
    }
  }

}

final class DescribeUpdateRequestOps(val self: DescribeUpdateRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateIdAsScala: Option[String] = Option(self.updateId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeUpdateRequestOps {

  implicit def toDescribeUpdateRequestBuilderOps(v: DescribeUpdateRequest.Builder): DescribeUpdateRequestBuilderOps =
    new DescribeUpdateRequestBuilderOps(v)

  implicit def toDescribeUpdateRequestOps(v: DescribeUpdateRequest): DescribeUpdateRequestOps =
    new DescribeUpdateRequestOps(v)

}
