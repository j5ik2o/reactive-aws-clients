// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesResponseBuilderOps(val self: SearchFacesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceIdAsScala(value: Option[String]): SearchFacesResponse.Builder = {
    value.fold(self) { v => self.searchedFaceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala(value: Option[Seq[FaceMatch]]): SearchFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faceMatches(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala(value: Option[String]): SearchFacesResponse.Builder = {
    value.fold(self) { v => self.faceModelVersion(v) }
  }

}

final class SearchFacesResponseOps(val self: SearchFacesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceIdAsScala: Option[String] = Option(self.searchedFaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala: Option[Seq[FaceMatch]] =
    Option(self.faceMatches).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesResponseOps {

  implicit def toSearchFacesResponseBuilderOps(v: SearchFacesResponse.Builder): SearchFacesResponseBuilderOps =
    new SearchFacesResponseBuilderOps(v)

  implicit def toSearchFacesResponseOps(v: SearchFacesResponse): SearchFacesResponseOps = new SearchFacesResponseOps(v)

}
