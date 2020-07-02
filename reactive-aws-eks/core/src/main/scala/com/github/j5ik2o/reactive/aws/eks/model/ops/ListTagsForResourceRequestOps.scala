// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListTagsForResourceRequestBuilderOps(val self: ListTagsForResourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceArnAsScala(value: Option[String]): ListTagsForResourceRequest.Builder = {
    value.fold(self) { v => self.resourceArn(v) }
  }

}

final class ListTagsForResourceRequestOps(val self: ListTagsForResourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceArnAsScala: Option[String] = Option(self.resourceArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceRequestOps {

  implicit def toListTagsForResourceRequestBuilderOps(
      v: ListTagsForResourceRequest.Builder
  ): ListTagsForResourceRequestBuilderOps = new ListTagsForResourceRequestBuilderOps(v)

  implicit def toListTagsForResourceRequestOps(v: ListTagsForResourceRequest): ListTagsForResourceRequestOps =
    new ListTagsForResourceRequestOps(v)

}
