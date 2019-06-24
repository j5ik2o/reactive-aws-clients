// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class VideoMetadataBuilderOps(val self: VideoMetadata.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codecAsScala(value: Option[String]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.codec(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala(value: Option[Long]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.durationMillis(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[String]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameRateAsScala(value: Option[Float]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.frameRate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameHeightAsScala(value: Option[Long]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.frameHeight(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameWidthAsScala(value: Option[Long]): VideoMetadata.Builder = {
    value.fold(self) { v =>
      self.frameWidth(v)
    }
  }

}

final class VideoMetadataOps(val self: VideoMetadata) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codecAsScala: Option[String] = Option(self.codec)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala: Option[Long] = Option(self.durationMillis)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[String] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameRateAsScala: Option[Float] = Option(self.frameRate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameHeightAsScala: Option[Long] = Option(self.frameHeight)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frameWidthAsScala: Option[Long] = Option(self.frameWidth)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVideoMetadataOps {

  implicit def toVideoMetadataBuilderOps(v: VideoMetadata.Builder): VideoMetadataBuilderOps =
    new VideoMetadataBuilderOps(v)

  implicit def toVideoMetadataOps(v: VideoMetadata): VideoMetadataOps = new VideoMetadataOps(v)

}
