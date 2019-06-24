// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListTagsRequestBuilderOps(val self: ListTagsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala(value: Option[String]): ListTagsRequest.Builder = {
    value.fold(self) { v =>
      self.resource(v)
    }
  }

}

final class ListTagsRequestOps(val self: ListTagsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceAsScala: Option[String] = Option(self.resource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsRequestOps {

  implicit def toListTagsRequestBuilderOps(v: ListTagsRequest.Builder): ListTagsRequestBuilderOps =
    new ListTagsRequestBuilderOps(v)

  implicit def toListTagsRequestOps(v: ListTagsRequest): ListTagsRequestOps = new ListTagsRequestOps(v)

}
