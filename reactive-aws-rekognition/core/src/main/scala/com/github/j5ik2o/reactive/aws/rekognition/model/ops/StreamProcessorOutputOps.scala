// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StreamProcessorOutputBuilderOps(val self: StreamProcessorOutput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kinesisDataStreamAsScala(value: Option[KinesisDataStream]): StreamProcessorOutput.Builder = {
    value.fold(self) { v => self.kinesisDataStream(v) }
  }

}

final class StreamProcessorOutputOps(val self: StreamProcessorOutput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kinesisDataStreamAsScala: Option[KinesisDataStream] = Option(self.kinesisDataStream)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamProcessorOutputOps {

  implicit def toStreamProcessorOutputBuilderOps(v: StreamProcessorOutput.Builder): StreamProcessorOutputBuilderOps =
    new StreamProcessorOutputBuilderOps(v)

  implicit def toStreamProcessorOutputOps(v: StreamProcessorOutput): StreamProcessorOutputOps =
    new StreamProcessorOutputOps(v)

}
