// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeImagesFilterBuilderOps(val self: DescribeImagesFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagStatusAsScala(value: Option[TagStatus]): DescribeImagesFilter.Builder = {
    value.fold(self) { v =>
      self.tagStatus(v)
    }
  }

}

final class DescribeImagesFilterOps(val self: DescribeImagesFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagStatusAsScala: Option[TagStatus] = Option(self.tagStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImagesFilterOps {

  implicit def toDescribeImagesFilterBuilderOps(v: DescribeImagesFilter.Builder): DescribeImagesFilterBuilderOps =
    new DescribeImagesFilterBuilderOps(v)

  implicit def toDescribeImagesFilterOps(v: DescribeImagesFilter): DescribeImagesFilterOps =
    new DescribeImagesFilterOps(v)

}
