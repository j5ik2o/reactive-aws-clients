// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceDetailBuilderOps(val self: FaceDetail.Builder) extends AnyVal {

  final def boundingBoxAsScala(value: Option[BoundingBox]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  final def ageRangeAsScala(value: Option[AgeRange]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.ageRange(v)
    }
  }

  final def smileAsScala(value: Option[Smile]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.smile(v)
    }
  }

  final def eyeglassesAsScala(value: Option[Eyeglasses]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.eyeglasses(v)
    }
  }

  final def sunglassesAsScala(value: Option[Sunglasses]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.sunglasses(v)
    }
  }

  final def genderAsScala(value: Option[Gender]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.gender(v)
    }
  }

  final def beardAsScala(value: Option[Beard]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.beard(v)
    }
  }

  final def mustacheAsScala(value: Option[Mustache]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.mustache(v)
    }
  }

  final def eyesOpenAsScala(value: Option[EyeOpen]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.eyesOpen(v)
    }
  }

  final def mouthOpenAsScala(value: Option[MouthOpen]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.mouthOpen(v)
    }
  }

  final def emotionsAsScala(value: Option[Seq[Emotion]]): FaceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.emotions(v.asJava)
    }
  }

  final def landmarksAsScala(value: Option[Seq[Landmark]]): FaceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.landmarks(v.asJava)
    }
  }

  final def poseAsScala(value: Option[Pose]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.pose(v)
    }
  }

  final def qualityAsScala(value: Option[ImageQuality]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.quality(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class FaceDetailOps(val self: FaceDetail) extends AnyVal {

  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  final def ageRangeAsScala: Option[AgeRange] = Option(self.ageRange)

  final def smileAsScala: Option[Smile] = Option(self.smile)

  final def eyeglassesAsScala: Option[Eyeglasses] = Option(self.eyeglasses)

  final def sunglassesAsScala: Option[Sunglasses] = Option(self.sunglasses)

  final def genderAsScala: Option[Gender] = Option(self.gender)

  final def beardAsScala: Option[Beard] = Option(self.beard)

  final def mustacheAsScala: Option[Mustache] = Option(self.mustache)

  final def eyesOpenAsScala: Option[EyeOpen] = Option(self.eyesOpen)

  final def mouthOpenAsScala: Option[MouthOpen] = Option(self.mouthOpen)

  final def emotionsAsScala: Option[Seq[Emotion]] = Option(self.emotions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def landmarksAsScala: Option[Seq[Landmark]] = Option(self.landmarks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def poseAsScala: Option[Pose] = Option(self.pose)

  final def qualityAsScala: Option[ImageQuality] = Option(self.quality)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceDetailOps {

  implicit def toFaceDetailBuilderOps(v: FaceDetail.Builder): FaceDetailBuilderOps = new FaceDetailBuilderOps(v)

  implicit def toFaceDetailOps(v: FaceDetail): FaceDetailOps = new FaceDetailOps(v)

}
