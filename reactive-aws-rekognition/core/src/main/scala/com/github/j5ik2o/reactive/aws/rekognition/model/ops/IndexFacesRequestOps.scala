// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class IndexFacesRequestBuilderOps(val self: IndexFacesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[Image]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalImageIdAsScala(value: Option[String]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.externalImageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionAttributesAsScala(value: Option[Seq[Attribute]]): IndexFacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.detectionAttributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala(value: Option[Int]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.maxFaces(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala(value: Option[QualityFilter]): IndexFacesRequest.Builder = {
    value.fold(self) { v =>
      self.qualityFilter(v)
    }
  }

}

final class IndexFacesRequestOps(val self: IndexFacesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[Image] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def externalImageIdAsScala: Option[String] = Option(self.externalImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detectionAttributesAsScala: Option[Seq[Attribute]] = Option(self.detectionAttributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxFacesAsScala: Option[Int] = Option(self.maxFaces)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityFilterAsScala: Option[QualityFilter] = Option(self.qualityFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIndexFacesRequestOps {

  implicit def toIndexFacesRequestBuilderOps(v: IndexFacesRequest.Builder): IndexFacesRequestBuilderOps =
    new IndexFacesRequestBuilderOps(v)

  implicit def toIndexFacesRequestOps(v: IndexFacesRequest): IndexFacesRequestOps = new IndexFacesRequestOps(v)

}
