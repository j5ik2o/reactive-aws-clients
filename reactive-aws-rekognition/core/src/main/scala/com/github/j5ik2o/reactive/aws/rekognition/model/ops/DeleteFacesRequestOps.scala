// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteFacesRequestBuilderOps(val self: DeleteFacesRequest.Builder) extends AnyVal {

  final def collectionIdAsScala(value: Option[String]): DeleteFacesRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

  final def faceIdsAsScala(value: Option[Seq[String]]): DeleteFacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.faceIds(v.asJava)
    }
  }

}

final class DeleteFacesRequestOps(val self: DeleteFacesRequest) extends AnyVal {

  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  final def faceIdsAsScala: Option[Seq[String]] = Option(self.faceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFacesRequestOps {

  implicit def toDeleteFacesRequestBuilderOps(v: DeleteFacesRequest.Builder): DeleteFacesRequestBuilderOps =
    new DeleteFacesRequestBuilderOps(v)

  implicit def toDeleteFacesRequestOps(v: DeleteFacesRequest): DeleteFacesRequestOps = new DeleteFacesRequestOps(v)

}
