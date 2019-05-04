// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesResponseBuilderOps(val self: SearchFacesResponse.Builder) extends AnyVal {

  final def searchedFaceIdAsScala(value: Option[String]): SearchFacesResponse.Builder = {
    value.fold(self) { v =>
      self.searchedFaceId(v)
    }
  }

  final def faceMatchesAsScala(value: Option[Seq[FaceMatch]]): SearchFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceMatches(v.asJava)
    }
  }

  final def faceModelVersionAsScala(value: Option[String]): SearchFacesResponse.Builder = {
    value.fold(self) { v =>
      self.faceModelVersion(v)
    }
  }

}

final class SearchFacesResponseOps(val self: SearchFacesResponse) extends AnyVal {

  final def searchedFaceIdAsScala: Option[String] = Option(self.searchedFaceId)

  final def faceMatchesAsScala: Option[Seq[FaceMatch]] = Option(self.faceMatches).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesResponseOps {

  implicit def toSearchFacesResponseBuilderOps(v: SearchFacesResponse.Builder): SearchFacesResponseBuilderOps =
    new SearchFacesResponseBuilderOps(v)

  implicit def toSearchFacesResponseOps(v: SearchFacesResponse): SearchFacesResponseOps = new SearchFacesResponseOps(v)

}
