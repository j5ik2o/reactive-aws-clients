// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListTagsOfResourceRequestBuilderOps(val self: ListTagsOfResourceRequest.Builder) extends AnyVal {

  final def withResourceArnAsScala(value: Option[String]): ListTagsOfResourceRequest.Builder = {
    value.fold(self) { v =>
      self.resourceArn(v)
    }
  } // String

  final def withNextTokenAsScala(value: Option[String]): ListTagsOfResourceRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListTagsOfResourceRequestOps(val self: ListTagsOfResourceRequest) extends AnyVal {

  final def resourceArnAsScala: Option[String] = Option(self.resourceArn) // String

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsOfResourceRequestOps {

  implicit def toListTagsOfResourceRequestBuilderOps(
      v: ListTagsOfResourceRequest.Builder
  ): ListTagsOfResourceRequestBuilderOps = new ListTagsOfResourceRequestBuilderOps(v)

  implicit def toListTagsOfResourceRequestOps(v: ListTagsOfResourceRequest): ListTagsOfResourceRequestOps =
    new ListTagsOfResourceRequestOps(v)

}
