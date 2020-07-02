// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesRequestBuilderOps(val self: SearchFacesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): SearchFacesRequest.Builder = {
    value.fold(self) { v => self.collectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceIdAsScala(value: Option[String]): SearchFacesRequest.Builder = {
    value.fold(self) { v => self.faceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala(value: Option[Int]): SearchFacesRequest.Builder = {
    value.fold(self) { v => self.maxFaces(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala(value: Option[Float]): SearchFacesRequest.Builder = {
    value.fold(self) { v => self.faceMatchThreshold(v) }
  }

}

final class SearchFacesRequestOps(val self: SearchFacesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceIdAsScala: Option[String] = Option(self.faceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala: Option[Int] = Option(self.maxFaces)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchThresholdAsScala: Option[Float] = Option(self.faceMatchThreshold)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesRequestOps {

  implicit def toSearchFacesRequestBuilderOps(v: SearchFacesRequest.Builder): SearchFacesRequestBuilderOps =
    new SearchFacesRequestBuilderOps(v)

  implicit def toSearchFacesRequestOps(v: SearchFacesRequest): SearchFacesRequestOps = new SearchFacesRequestOps(v)

}
