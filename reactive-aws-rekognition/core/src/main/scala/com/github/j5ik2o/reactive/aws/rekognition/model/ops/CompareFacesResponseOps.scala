// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CompareFacesResponseBuilderOps(val self: CompareFacesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageFaceAsScala(value: Option[ComparedSourceImageFace]): CompareFacesResponse.Builder = {
    value.fold(self) { v => self.sourceImageFace(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala(value: Option[Seq[CompareFacesMatch]]): CompareFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.faceMatches(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unmatchedFacesAsScala(value: Option[Seq[ComparedFace]]): CompareFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unmatchedFaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageOrientationCorrectionAsScala(
      value: Option[OrientationCorrection]
  ): CompareFacesResponse.Builder = {
    value.fold(self) { v => self.sourceImageOrientationCorrection(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetImageOrientationCorrectionAsScala(
      value: Option[OrientationCorrection]
  ): CompareFacesResponse.Builder = {
    value.fold(self) { v => self.targetImageOrientationCorrection(v) }
  }

}

final class CompareFacesResponseOps(val self: CompareFacesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageFaceAsScala: Option[ComparedSourceImageFace] = Option(self.sourceImageFace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceMatchesAsScala: Option[Seq[CompareFacesMatch]] =
    Option(self.faceMatches).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unmatchedFacesAsScala: Option[Seq[ComparedFace]] =
    Option(self.unmatchedFaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceImageOrientationCorrectionAsScala: Option[OrientationCorrection] =
    Option(self.sourceImageOrientationCorrection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetImageOrientationCorrectionAsScala: Option[OrientationCorrection] =
    Option(self.targetImageOrientationCorrection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompareFacesResponseOps {

  implicit def toCompareFacesResponseBuilderOps(v: CompareFacesResponse.Builder): CompareFacesResponseBuilderOps =
    new CompareFacesResponseBuilderOps(v)

  implicit def toCompareFacesResponseOps(v: CompareFacesResponse): CompareFacesResponseOps =
    new CompareFacesResponseOps(v)

}
