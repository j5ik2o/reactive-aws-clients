// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StreamProcessorInputBuilderOps(val self: StreamProcessorInput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kinesisVideoStreamAsScala(value: Option[KinesisVideoStream]): StreamProcessorInput.Builder = {
    value.fold(self) { v =>
      self.kinesisVideoStream(v)
    }
  }

}

final class StreamProcessorInputOps(val self: StreamProcessorInput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kinesisVideoStreamAsScala: Option[KinesisVideoStream] = Option(self.kinesisVideoStream)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamProcessorInputOps {

  implicit def toStreamProcessorInputBuilderOps(v: StreamProcessorInput.Builder): StreamProcessorInputBuilderOps =
    new StreamProcessorInputBuilderOps(v)

  implicit def toStreamProcessorInputOps(v: StreamProcessorInput): StreamProcessorInputOps =
    new StreamProcessorInputOps(v)

}
