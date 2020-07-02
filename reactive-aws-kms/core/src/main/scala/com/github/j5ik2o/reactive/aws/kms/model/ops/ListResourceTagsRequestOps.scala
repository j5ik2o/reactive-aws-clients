// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListResourceTagsRequestBuilderOps(val self: ListResourceTagsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): ListResourceTagsRequest.Builder = {
    value.fold(self) { v => self.keyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): ListResourceTagsRequest.Builder = {
    value.fold(self) { v => self.limit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): ListResourceTagsRequest.Builder = {
    value.fold(self) { v => self.marker(v) }
  }

}

final class ListResourceTagsRequestOps(val self: ListResourceTagsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListResourceTagsRequestOps {

  implicit def toListResourceTagsRequestBuilderOps(
      v: ListResourceTagsRequest.Builder
  ): ListResourceTagsRequestBuilderOps = new ListResourceTagsRequestBuilderOps(v)

  implicit def toListResourceTagsRequestOps(v: ListResourceTagsRequest): ListResourceTagsRequestOps =
    new ListResourceTagsRequestOps(v)

}
