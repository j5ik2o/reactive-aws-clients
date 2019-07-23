// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class UnindexedFaceBuilderOps(val self: UnindexedFace.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonsAsScala(value: Option[Seq[Reason]]): UnindexedFace.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.reasons(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceDetailAsScala(value: Option[FaceDetail]): UnindexedFace.Builder = {
    value.fold(self) { v =>
      self.faceDetail(v)
    }
  }

}

final class UnindexedFaceOps(val self: UnindexedFace) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonsAsScala: Option[Seq[Reason]] = Option(self.reasons).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceDetailAsScala: Option[FaceDetail] = Option(self.faceDetail)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnindexedFaceOps {

  implicit def toUnindexedFaceBuilderOps(v: UnindexedFace.Builder): UnindexedFaceBuilderOps =
    new UnindexedFaceBuilderOps(v)

  implicit def toUnindexedFaceOps(v: UnindexedFace): UnindexedFaceOps = new UnindexedFaceOps(v)

}
