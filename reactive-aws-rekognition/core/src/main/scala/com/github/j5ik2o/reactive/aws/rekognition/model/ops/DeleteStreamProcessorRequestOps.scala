// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteStreamProcessorRequestBuilderOps(val self: DeleteStreamProcessorRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): DeleteStreamProcessorRequest.Builder = {
    value.fold(self) { v => self.name(v) }
  }

}

final class DeleteStreamProcessorRequestOps(val self: DeleteStreamProcessorRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStreamProcessorRequestOps {

  implicit def toDeleteStreamProcessorRequestBuilderOps(
      v: DeleteStreamProcessorRequest.Builder
  ): DeleteStreamProcessorRequestBuilderOps = new DeleteStreamProcessorRequestBuilderOps(v)

  implicit def toDeleteStreamProcessorRequestOps(v: DeleteStreamProcessorRequest): DeleteStreamProcessorRequestOps =
    new DeleteStreamProcessorRequestOps(v)

}
