// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class PersonDetailBuilderOps(val self: PersonDetail.Builder) extends AnyVal {

  final def indexAsScala(value: Option[Long]): PersonDetail.Builder = {
    value.fold(self) { v =>
      self.index(v)
    }
  }

  final def boundingBoxAsScala(value: Option[BoundingBox]): PersonDetail.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def faceAsScala(value: Option[FaceDetail]): PersonDetail.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

}

final class PersonDetailOps(val self: PersonDetail) extends AnyVal {

  final def indexAsScala: Option[Long] = Option(self.index)

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def faceAsScala: Option[FaceDetail] = Option(self.face)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPersonDetailOps {

  implicit def toPersonDetailBuilderOps(v: PersonDetail.Builder): PersonDetailBuilderOps = new PersonDetailBuilderOps(v)

  implicit def toPersonDetailOps(v: PersonDetail): PersonDetailOps = new PersonDetailOps(v)

}
