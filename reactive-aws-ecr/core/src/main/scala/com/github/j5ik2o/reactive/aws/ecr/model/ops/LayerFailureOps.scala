// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LayerFailureBuilderOps(val self: LayerFailure.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala(value: Option[String]): LayerFailure.Builder = {
    value.fold(self) { v => self.layerDigest(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala(value: Option[LayerFailureCode]): LayerFailure.Builder = {
    value.fold(self) { v => self.failureCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureReasonAsScala(value: Option[String]): LayerFailure.Builder = {
    value.fold(self) { v => self.failureReason(v) }
  }

}

final class LayerFailureOps(val self: LayerFailure) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala: Option[LayerFailureCode] = Option(self.failureCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureReasonAsScala: Option[String] = Option(self.failureReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerFailureOps {

  implicit def toLayerFailureBuilderOps(v: LayerFailure.Builder): LayerFailureBuilderOps = new LayerFailureBuilderOps(v)

  implicit def toLayerFailureOps(v: LayerFailure): LayerFailureOps = new LayerFailureOps(v)

}
