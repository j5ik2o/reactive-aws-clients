// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class FaceDetailBuilderOps(val self: FaceDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala(value: Option[BoundingBox]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ageRangeAsScala(value: Option[AgeRange]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.ageRange(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def smileAsScala(value: Option[Smile]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.smile(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eyeglassesAsScala(value: Option[Eyeglasses]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.eyeglasses(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sunglassesAsScala(value: Option[Sunglasses]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.sunglasses(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def genderAsScala(value: Option[Gender]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.gender(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def beardAsScala(value: Option[Beard]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.beard(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mustacheAsScala(value: Option[Mustache]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.mustache(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eyesOpenAsScala(value: Option[EyeOpen]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.eyesOpen(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mouthOpenAsScala(value: Option[MouthOpen]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.mouthOpen(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def emotionsAsScala(value: Option[Seq[Emotion]]): FaceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.emotions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def landmarksAsScala(value: Option[Seq[Landmark]]): FaceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.landmarks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poseAsScala(value: Option[Pose]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.pose(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityAsScala(value: Option[ImageQuality]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.quality(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): FaceDetail.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

}

final class FaceDetailOps(val self: FaceDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ageRangeAsScala: Option[AgeRange] = Option(self.ageRange)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def smileAsScala: Option[Smile] = Option(self.smile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eyeglassesAsScala: Option[Eyeglasses] = Option(self.eyeglasses)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sunglassesAsScala: Option[Sunglasses] = Option(self.sunglasses)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def genderAsScala: Option[Gender] = Option(self.gender)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def beardAsScala: Option[Beard] = Option(self.beard)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mustacheAsScala: Option[Mustache] = Option(self.mustache)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def eyesOpenAsScala: Option[EyeOpen] = Option(self.eyesOpen)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mouthOpenAsScala: Option[MouthOpen] = Option(self.mouthOpen)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def emotionsAsScala: Option[Seq[Emotion]] = Option(self.emotions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def landmarksAsScala: Option[Seq[Landmark]] = Option(self.landmarks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poseAsScala: Option[Pose] = Option(self.pose)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityAsScala: Option[ImageQuality] = Option(self.quality)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFaceDetailOps {

  implicit def toFaceDetailBuilderOps(v: FaceDetail.Builder): FaceDetailBuilderOps = new FaceDetailBuilderOps(v)

  implicit def toFaceDetailOps(v: FaceDetail): FaceDetailOps = new FaceDetailOps(v)

}
