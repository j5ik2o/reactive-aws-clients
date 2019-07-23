// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateCollectionRequestBuilderOps(val self: CreateCollectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): CreateCollectionRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

}

final class CreateCollectionRequestOps(val self: CreateCollectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCollectionRequestOps {

  implicit def toCreateCollectionRequestBuilderOps(
      v: CreateCollectionRequest.Builder
  ): CreateCollectionRequestBuilderOps = new CreateCollectionRequestBuilderOps(v)

  implicit def toCreateCollectionRequestOps(v: CreateCollectionRequest): CreateCollectionRequestOps =
    new CreateCollectionRequestOps(v)

}
