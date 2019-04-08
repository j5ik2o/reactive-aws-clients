// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListTagsRequestBuilderOps(val self: ListTagsRequest.Builder) extends AnyVal {

  final def arnAsScala(value: Option[String]): ListTagsRequest.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

}

final class ListTagsRequestOps(val self: ListTagsRequest) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsRequestOps {

  implicit def toListTagsRequestBuilderOps(v: ListTagsRequest.Builder): ListTagsRequestBuilderOps =
    new ListTagsRequestBuilderOps(v)

  implicit def toListTagsRequestOps(v: ListTagsRequest): ListTagsRequestOps = new ListTagsRequestOps(v)

}
