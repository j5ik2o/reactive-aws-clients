// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CelebrityDetailBuilderOps(val self: CelebrityDetail.Builder) extends AnyVal {

  final def urlsAsScala(value: Option[Seq[String]]): CelebrityDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.urls(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): CelebrityDetail.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def idAsScala(value: Option[String]): CelebrityDetail.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): CelebrityDetail.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

  final def boundingBoxAsScala(value: Option[BoundingBox]): CelebrityDetail.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def faceAsScala(value: Option[FaceDetail]): CelebrityDetail.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

}

final class CelebrityDetailOps(val self: CelebrityDetail) extends AnyVal {

  final def urlsAsScala: Option[Seq[String]] = Option(self.urls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nameAsScala: Option[String] = Option(self.name)

  final def idAsScala: Option[String] = Option(self.id)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def faceAsScala: Option[FaceDetail] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCelebrityDetailOps {

  implicit def toCelebrityDetailBuilderOps(v: CelebrityDetail.Builder): CelebrityDetailBuilderOps =
    new CelebrityDetailBuilderOps(v)

  implicit def toCelebrityDetailOps(v: CelebrityDetail): CelebrityDetailOps = new CelebrityDetailOps(v)

}
