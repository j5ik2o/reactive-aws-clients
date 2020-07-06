// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class GetSegmentDetectionResponseBuilderOps(val self: GetSegmentDetectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala(value: Option[VideoJobStatus]): GetSegmentDetectionResponse.Builder = {
    value.fold(self) { v => self.jobStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): GetSegmentDetectionResponse.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala(value: Option[Seq[VideoMetadata]]): GetSegmentDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.videoMetadata(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def audioMetadataAsScala(value: Option[Seq[AudioMetadata]]): GetSegmentDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.audioMetadata(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetSegmentDetectionResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentsAsScala(value: Option[Seq[SegmentDetection]]): GetSegmentDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.segments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectedSegmentTypesAsScala(value: Option[Seq[SegmentTypeInfo]]): GetSegmentDetectionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.selectedSegmentTypes(v.asJava)
    }
  }

}

final class GetSegmentDetectionResponseOps(val self: GetSegmentDetectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobStatusAsScala: Option[VideoJobStatus] = Option(self.jobStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def videoMetadataAsScala: Option[Seq[VideoMetadata]] =
    Option(self.videoMetadata).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def audioMetadataAsScala: Option[Seq[AudioMetadata]] =
    Option(self.audioMetadata).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def segmentsAsScala: Option[Seq[SegmentDetection]] =
    Option(self.segments).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectedSegmentTypesAsScala: Option[Seq[SegmentTypeInfo]] =
    Option(self.selectedSegmentTypes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetSegmentDetectionResponseOps {

  implicit def toGetSegmentDetectionResponseBuilderOps(
      v: GetSegmentDetectionResponse.Builder
  ): GetSegmentDetectionResponseBuilderOps = new GetSegmentDetectionResponseBuilderOps(v)

  implicit def toGetSegmentDetectionResponseOps(v: GetSegmentDetectionResponse): GetSegmentDetectionResponseOps =
    new GetSegmentDetectionResponseOps(v)

}
