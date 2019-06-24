// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ComparedFaceBuilderOps(val self: ComparedFace.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala(value: Option[BoundingBox]): ComparedFace.Builder = {
    value.fold(self) { v =>
      self.boundingBox(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala(value: Option[Float]): ComparedFace.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def landmarksAsScala(value: Option[Seq[Landmark]]): ComparedFace.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.landmarks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poseAsScala(value: Option[Pose]): ComparedFace.Builder = {
    value.fold(self) { v =>
      self.pose(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityAsScala(value: Option[ImageQuality]): ComparedFace.Builder = {
    value.fold(self) { v =>
      self.quality(v)
    }
  }

}

final class ComparedFaceOps(val self: ComparedFace) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def boundingBoxAsScala: Option[BoundingBox] = Option(self.boundingBox)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def landmarksAsScala: Option[Seq[Landmark]] = Option(self.landmarks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def poseAsScala: Option[Pose] = Option(self.pose)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def qualityAsScala: Option[ImageQuality] = Option(self.quality)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComparedFaceOps {

  implicit def toComparedFaceBuilderOps(v: ComparedFace.Builder): ComparedFaceBuilderOps = new ComparedFaceBuilderOps(v)

  implicit def toComparedFaceOps(v: ComparedFace): ComparedFaceOps = new ComparedFaceOps(v)

}
