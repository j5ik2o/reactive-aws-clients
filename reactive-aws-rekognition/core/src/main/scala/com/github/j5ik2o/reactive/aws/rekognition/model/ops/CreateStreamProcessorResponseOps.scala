// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateStreamProcessorResponseBuilderOps(val self: CreateStreamProcessorResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorArnAsScala(value: Option[String]): CreateStreamProcessorResponse.Builder = {
    value.fold(self) { v =>
      self.streamProcessorArn(v)
    }
  }

}

final class CreateStreamProcessorResponseOps(val self: CreateStreamProcessorResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorArnAsScala: Option[String] = Option(self.streamProcessorArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStreamProcessorResponseOps {

  implicit def toCreateStreamProcessorResponseBuilderOps(
      v: CreateStreamProcessorResponse.Builder
  ): CreateStreamProcessorResponseBuilderOps = new CreateStreamProcessorResponseBuilderOps(v)

  implicit def toCreateStreamProcessorResponseOps(v: CreateStreamProcessorResponse): CreateStreamProcessorResponseOps =
    new CreateStreamProcessorResponseOps(v)

}
