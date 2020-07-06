// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class AudioMetadataBuilderOps(val self: AudioMetadata.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codecAsScala(value: Option[String]): AudioMetadata.Builder = {
    value.fold(self) { v => self.codec(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala(value: Option[Long]): AudioMetadata.Builder = {
    value.fold(self) { v => self.durationMillis(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleRateAsScala(value: Option[Long]): AudioMetadata.Builder = {
    value.fold(self) { v => self.sampleRate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfChannelsAsScala(value: Option[Long]): AudioMetadata.Builder = {
    value.fold(self) { v => self.numberOfChannels(v) }
  }

}

final class AudioMetadataOps(val self: AudioMetadata) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codecAsScala: Option[String] = Option(self.codec)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def durationMillisAsScala: Option[Long] = Option(self.durationMillis)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sampleRateAsScala: Option[Long] = Option(self.sampleRate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def numberOfChannelsAsScala: Option[Long] = Option(self.numberOfChannels)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAudioMetadataOps {

  implicit def toAudioMetadataBuilderOps(v: AudioMetadata.Builder): AudioMetadataBuilderOps =
    new AudioMetadataBuilderOps(v)

  implicit def toAudioMetadataOps(v: AudioMetadata): AudioMetadataOps = new AudioMetadataOps(v)

}
