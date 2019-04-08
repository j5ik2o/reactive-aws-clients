// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListTagsOfResourceRequestBuilderOps(val self: ListTagsOfResourceRequest.Builder) extends AnyVal {

  final def resourceArnAsScala(value: Option[String]): ListTagsOfResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceArn(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTagsOfResourceRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTagsOfResourceRequestOps(val self: ListTagsOfResourceRequest) extends AnyVal {

  final def resourceArnAsScala: Option[String] = Option(self.resourceArn)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsOfResourceRequestOps {

  implicit def toListTagsOfResourceRequestBuilderOps(
      v: ListTagsOfResourceRequest.Builder
  ): ListTagsOfResourceRequestBuilderOps = new ListTagsOfResourceRequestBuilderOps(v)

  implicit def toListTagsOfResourceRequestOps(v: ListTagsOfResourceRequest): ListTagsOfResourceRequestOps =
    new ListTagsOfResourceRequestOps(v)

}
