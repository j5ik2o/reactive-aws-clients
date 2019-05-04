// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class StreamProcessorBuilderOps(val self: StreamProcessor.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): StreamProcessor.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def statusAsScala(value: Option[StreamProcessorStatus]): StreamProcessor.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class StreamProcessorOps(val self: StreamProcessor) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def statusAsScala: Option[StreamProcessorStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamProcessorOps {

  implicit def toStreamProcessorBuilderOps(v: StreamProcessor.Builder): StreamProcessorBuilderOps =
    new StreamProcessorBuilderOps(v)

  implicit def toStreamProcessorOps(v: StreamProcessor): StreamProcessorOps = new StreamProcessorOps(v)

}
