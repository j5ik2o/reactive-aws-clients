// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateCollectionResponseBuilderOps(val self: CreateCollectionResponse.Builder) extends AnyVal {

  final def statusCodeAsScala(value: Option[Int]): CreateCollectionResponse.Builder = {
    value.fold(self) { v =>
      self.statusCode(v)
    }
  }

  final def collectionArnAsScala(value: Option[String]): CreateCollectionResponse.Builder = {
    value.fold(self) { v =>
      self.collectionArn(v)
    }
  }

  final def faceModelVersionAsScala(value: Option[String]): CreateCollectionResponse.Builder = {
    value.fold(self) { v =>
      self.faceModelVersion(v)
    }
  }

}

final class CreateCollectionResponseOps(val self: CreateCollectionResponse) extends AnyVal {

  final def statusCodeAsScala: Option[Int] = Option(self.statusCode)

  final def collectionArnAsScala: Option[String] = Option(self.collectionArn)

  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCollectionResponseOps {

  implicit def toCreateCollectionResponseBuilderOps(
      v: CreateCollectionResponse.Builder
  ): CreateCollectionResponseBuilderOps = new CreateCollectionResponseBuilderOps(v)

  implicit def toCreateCollectionResponseOps(v: CreateCollectionResponse): CreateCollectionResponseOps =
    new CreateCollectionResponseOps(v)

}
