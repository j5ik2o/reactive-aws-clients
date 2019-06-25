// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class ListTagsForResourceRequestBuilderOps(val self: ListTagsForResourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceARNAsScala(value: Option[String]): ListTagsForResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceARN(v)
    }
  }

}

final class ListTagsForResourceRequestOps(val self: ListTagsForResourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceARNAsScala: Option[String] = Option(self.resourceARN)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsForResourceRequestOps {

  implicit def toListTagsForResourceRequestBuilderOps(
      v: ListTagsForResourceRequest.Builder
  ): ListTagsForResourceRequestBuilderOps = new ListTagsForResourceRequestBuilderOps(v)

  implicit def toListTagsForResourceRequestOps(v: ListTagsForResourceRequest): ListTagsForResourceRequestOps =
    new ListTagsForResourceRequestOps(v)

}
