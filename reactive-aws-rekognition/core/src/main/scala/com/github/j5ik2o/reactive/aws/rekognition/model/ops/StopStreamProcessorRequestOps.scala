// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StopStreamProcessorRequestBuilderOps(val self: StopStreamProcessorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): StopStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class StopStreamProcessorRequestOps(val self: StopStreamProcessorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStopStreamProcessorRequestOps {

  implicit def toStopStreamProcessorRequestBuilderOps(
      v: StopStreamProcessorRequest.Builder
  ): StopStreamProcessorRequestBuilderOps = new StopStreamProcessorRequestBuilderOps(v)

  implicit def toStopStreamProcessorRequestOps(v: StopStreamProcessorRequest): StopStreamProcessorRequestOps =
    new StopStreamProcessorRequestOps(v)

}
