// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListFacesResponseBuilderOps(val self: ListFacesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def facesAsScala(value: Option[Seq[Face]]): ListFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListFacesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala(value: Option[String]): ListFacesResponse.Builder = {
    value.fold(self) { v => self.faceModelVersion(v) }
  }

}

final class ListFacesResponseOps(val self: ListFacesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def facesAsScala: Option[Seq[Face]] =
    Option(self.faces).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFacesResponseOps {

  implicit def toListFacesResponseBuilderOps(v: ListFacesResponse.Builder): ListFacesResponseBuilderOps =
    new ListFacesResponseBuilderOps(v)

  implicit def toListFacesResponseOps(v: ListFacesResponse): ListFacesResponseOps = new ListFacesResponseOps(v)

}
