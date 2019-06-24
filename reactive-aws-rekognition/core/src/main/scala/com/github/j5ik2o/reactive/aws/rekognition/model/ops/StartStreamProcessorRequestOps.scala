// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StartStreamProcessorRequestBuilderOps(val self: StartStreamProcessorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): StartStreamProcessorRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class StartStreamProcessorRequestOps(val self: StartStreamProcessorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartStreamProcessorRequestOps {

  implicit def toStartStreamProcessorRequestBuilderOps(
      v: StartStreamProcessorRequest.Builder
  ): StartStreamProcessorRequestBuilderOps = new StartStreamProcessorRequestBuilderOps(v)

  implicit def toStartStreamProcessorRequestOps(v: StartStreamProcessorRequest): StartStreamProcessorRequestOps =
    new StartStreamProcessorRequestOps(v)

}
