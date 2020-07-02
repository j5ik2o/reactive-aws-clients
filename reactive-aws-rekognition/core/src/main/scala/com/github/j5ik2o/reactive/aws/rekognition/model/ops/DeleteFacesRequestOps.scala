// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteFacesRequestBuilderOps(val self: DeleteFacesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): DeleteFacesRequest.Builder = {
    value.fold(self) { v => self.collectionId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceIdsAsScala(value: Option[Seq[String]]): DeleteFacesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faceIds(v.asJava)
    }
  }

}

final class DeleteFacesRequestOps(val self: DeleteFacesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceIdsAsScala: Option[Seq[String]] =
    Option(self.faceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFacesRequestOps {

  implicit def toDeleteFacesRequestBuilderOps(v: DeleteFacesRequest.Builder): DeleteFacesRequestBuilderOps =
    new DeleteFacesRequestBuilderOps(v)

  implicit def toDeleteFacesRequestOps(v: DeleteFacesRequest): DeleteFacesRequestOps = new DeleteFacesRequestOps(v)

}
