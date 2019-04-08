// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class LayerBuilderOps(val self: Layer.Builder) extends AnyVal {

  final def arnAsScala(value: Option[String]): Layer.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  } // String

  final def codeSizeAsScala(value: Option[Long]): Layer.Builder = {
    value.fold(self) { v =>
      self.codeSize(v)
    }
  } // Long

}

final class LayerOps(val self: Layer) extends AnyVal {

  final def arnAsScala: Option[String] = Option(self.arn) // String

  final def codeSizeAsScala: Option[Long] = Option(self.codeSize) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerOps {

  implicit def toLayerBuilderOps(v: Layer.Builder): LayerBuilderOps = new LayerBuilderOps(v)

  implicit def toLayerOps(v: Layer): LayerOps = new LayerOps(v)

}
