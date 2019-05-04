// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteCollectionRequestBuilderOps(val self: DeleteCollectionRequest.Builder) extends AnyVal {

  final def collectionIdAsScala(value: Option[String]): DeleteCollectionRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

}

final class DeleteCollectionRequestOps(val self: DeleteCollectionRequest) extends AnyVal {

  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCollectionRequestOps {

  implicit def toDeleteCollectionRequestBuilderOps(
      v: DeleteCollectionRequest.Builder
  ): DeleteCollectionRequestBuilderOps = new DeleteCollectionRequestBuilderOps(v)

  implicit def toDeleteCollectionRequestOps(v: DeleteCollectionRequest): DeleteCollectionRequestOps =
    new DeleteCollectionRequestOps(v)

}
