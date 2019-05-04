// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class IndexFacesRequestBuilderOps(val self: IndexFacesRequest.Builder) extends AnyVal {

  final def collectionIdAsScala(value: Option[String]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  final def imageAsScala(value: Option[Image]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def externalImageIdAsScala(value: Option[String]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.externalImageId(v)
    }
  }

  final def detectionAttributesAsScala(value: Option[Seq[Attribute]]): IndexFacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.detectionAttributes(v.asJava)
    }
  }

  final def maxFacesAsScala(value: Option[Int]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.maxFaces(v)
    }
  }

  final def qualityFilterAsScala(value: Option[QualityFilter]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.qualityFilter(v)
    }
  }

}

final class IndexFacesRequestOps(val self: IndexFacesRequest) extends AnyVal {

  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  final def imageAsScala: Option[Image] = Option(self.image)

  final def externalImageIdAsScala: Option[String] = Option(self.externalImageId)

  final def detectionAttributesAsScala: Option[Seq[Attribute]] = Option(self.detectionAttributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxFacesAsScala: Option[Int] = Option(self.maxFaces)

  final def qualityFilterAsScala: Option[QualityFilter] = Option(self.qualityFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIndexFacesRequestOps {

  implicit def toIndexFacesRequestBuilderOps(v: IndexFacesRequest.Builder): IndexFacesRequestBuilderOps =
    new IndexFacesRequestBuilderOps(v)

  implicit def toIndexFacesRequestOps(v: IndexFacesRequest): IndexFacesRequestOps = new IndexFacesRequestOps(v)

}
