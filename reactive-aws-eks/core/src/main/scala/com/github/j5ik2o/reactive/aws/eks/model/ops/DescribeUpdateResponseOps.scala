// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class DescribeUpdateResponseBuilderOps(val self: DescribeUpdateResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala(value: Option[Update]): DescribeUpdateResponse.Builder = {
    value.fold(self) { v => self.update(v) }
  }

}

final class DescribeUpdateResponseOps(val self: DescribeUpdateResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def updateAsScala: Option[Update] = Option(self.update)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeUpdateResponseOps {

  implicit def toDescribeUpdateResponseBuilderOps(v: DescribeUpdateResponse.Builder): DescribeUpdateResponseBuilderOps =
    new DescribeUpdateResponseBuilderOps(v)

  implicit def toDescribeUpdateResponseOps(v: DescribeUpdateResponse): DescribeUpdateResponseOps =
    new DescribeUpdateResponseOps(v)

}
