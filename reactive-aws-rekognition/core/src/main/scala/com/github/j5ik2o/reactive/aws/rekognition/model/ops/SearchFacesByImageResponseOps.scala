// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class SearchFacesByImageResponseBuilderOps(val self: SearchFacesByImageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceBoundingBoxAsScala(value: Option[BoundingBox]): SearchFacesByImageResponse.Builder = {
    value.fold(self) { v =>
      self.searchedFaceBoundingBox(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceConfidenceAsScala(value: Option[Float]): SearchFacesByImageResponse.Builder = {
    value.fold(self) { v =>
      self.searchedFaceConfidence(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala(value: Option[Seq[FaceMatch]]): SearchFacesByImageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faceMatches(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala(value: Option[String]): SearchFacesByImageResponse.Builder = {
    value.fold(self) { v =>
      self.faceModelVersion(v)
    }
  }

}

final class SearchFacesByImageResponseOps(val self: SearchFacesByImageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceBoundingBoxAsScala: Option[BoundingBox] = Option(self.searchedFaceBoundingBox)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def searchedFaceConfidenceAsScala: Option[Float] = Option(self.searchedFaceConfidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala: Option[Seq[FaceMatch]] = Option(self.faceMatches).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFacesByImageResponseOps {

  implicit def toSearchFacesByImageResponseBuilderOps(
      v: SearchFacesByImageResponse.Builder
  ): SearchFacesByImageResponseBuilderOps = new SearchFacesByImageResponseBuilderOps(v)

  implicit def toSearchFacesByImageResponseOps(v: SearchFacesByImageResponse): SearchFacesByImageResponseOps =
    new SearchFacesByImageResponseOps(v)

}
