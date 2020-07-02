// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class KinesisDataStreamBuilderOps(val self: KinesisDataStream.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): KinesisDataStream.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

}

final class KinesisDataStreamOps(val self: KinesisDataStream) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKinesisDataStreamOps {

  implicit def toKinesisDataStreamBuilderOps(v: KinesisDataStream.Builder): KinesisDataStreamBuilderOps =
    new KinesisDataStreamBuilderOps(v)

  implicit def toKinesisDataStreamOps(v: KinesisDataStream): KinesisDataStreamOps = new KinesisDataStreamOps(v)

}
