// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesByImageRequestBuilderOps(val self: SearchFacesByImageRequest.Builder) extends AnyVal {

  final def collectionIdAsScala(value: Option[String]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  final def imageAsScala(value: Option[Image]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def maxFacesAsScala(value: Option[Int]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v =>
      self.maxFaces(v)
    }
  }

  final def faceMatchThresholdAsScala(value: Option[Float]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v =>
      self.faceMatchThreshold(v)
    }
  }

}

final class SearchFacesByImageRequestOps(val self: SearchFacesByImageRequest) extends AnyVal {

  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  final def imageAsScala: Option[Image] = Option(self.image)

  final def maxFacesAsScala: Option[Int] = Option(self.maxFaces)

  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesByImageRequestOps {

  implicit def toSearchFacesByImageRequestBuilderOps(
      v: SearchFacesByImageRequest.Builder
  ): SearchFacesByImageRequestBuilderOps = new SearchFacesByImageRequestBuilderOps(v)

  implicit def toSearchFacesByImageRequestOps(v: SearchFacesByImageRequest): SearchFacesByImageRequestOps =
    new SearchFacesByImageRequestOps(v)

}
