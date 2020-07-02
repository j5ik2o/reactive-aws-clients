// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesByImageRequestBuilderOps(val self: SearchFacesByImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v => self.collectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala(value: Option[Int]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v => self.maxFaces(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala(value: Option[Float]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v => self.faceMatchThreshold(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala(value: Option[QualityFilter]): SearchFacesByImageRequest.Builder = {
    value.fold(self) { v => self.qualityFilter(v) }
  }

}

final class SearchFacesByImageRequestOps(val self: SearchFacesByImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala: Option[Int] = Option(self.maxFaces)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala: Option[QualityFilter] = Option(self.qualityFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesByImageRequestOps {

  implicit def toSearchFacesByImageRequestBuilderOps(
      v: SearchFacesByImageRequest.Builder
  ): SearchFacesByImageRequestBuilderOps = new SearchFacesByImageRequestBuilderOps(v)

  implicit def toSearchFacesByImageRequestOps(v: SearchFacesByImageRequest): SearchFacesByImageRequestOps =
    new SearchFacesByImageRequestOps(v)

}
