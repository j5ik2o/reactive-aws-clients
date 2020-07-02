// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CelebrityDetailBuilderOps(val self: CelebrityDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlsAsScala(value: Option[Seq[String]]): CelebrityDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.urls(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CelebrityDetail.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): CelebrityDetail.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): CelebrityDetail.Builder = {
    value.fold(self) { v => self.confidence(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala(value: Option[BoundingBox]): CelebrityDetail.Builder = {
    value.fold(self) { v => self.boundingBox(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala(value: Option[FaceDetail]): CelebrityDetail.Builder = {
    value.fold(self) { v => self.face(v) }
  }

}

final class CelebrityDetailOps(val self: CelebrityDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def urlsAsScala: Option[Seq[String]] =
    Option(self.urls).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceAsScala: Option[FaceDetail] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCelebrityDetailOps {

  implicit def toCelebrityDetailBuilderOps(v: CelebrityDetail.Builder): CelebrityDetailBuilderOps =
    new CelebrityDetailBuilderOps(v)

  implicit def toCelebrityDetailOps(v: CelebrityDetail): CelebrityDetailOps = new CelebrityDetailOps(v)

}
