// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class KinesisVideoStreamBuilderOps(val self: KinesisVideoStream.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): KinesisVideoStream.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

}

final class KinesisVideoStreamOps(val self: KinesisVideoStream) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKinesisVideoStreamOps {

  implicit def toKinesisVideoStreamBuilderOps(v: KinesisVideoStream.Builder): KinesisVideoStreamBuilderOps =
    new KinesisVideoStreamBuilderOps(v)

  implicit def toKinesisVideoStreamOps(v: KinesisVideoStream): KinesisVideoStreamOps = new KinesisVideoStreamOps(v)

}
