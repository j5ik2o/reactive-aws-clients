// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LayerFailureBuilderOps(val self: LayerFailure.Builder) extends AnyVal {

  final def layerDigestAsScala(value: Option[String]): LayerFailure.Builder = {
    value.fold(self) { v =>
      self.layerDigest(v)
    }
  }

  final def failureCodeAsScala(value: Option[LayerFailureCode]): LayerFailure.Builder = {
    value.fold(self) { v =>
      self.failureCode(v)
    }
  }

  final def failureReasonAsScala(value: Option[String]): LayerFailure.Builder = {
    value.fold(self) { v =>
      self.failureReason(v)
    }
  }

}

final class LayerFailureOps(val self: LayerFailure) extends AnyVal {

  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

  final def failureCodeAsScala: Option[LayerFailureCode] = Option(self.failureCode)

  final def failureReasonAsScala: Option[String] = Option(self.failureReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerFailureOps {

  implicit def toLayerFailureBuilderOps(v: LayerFailure.Builder): LayerFailureBuilderOps = new LayerFailureBuilderOps(v)

  implicit def toLayerFailureOps(v: LayerFailure): LayerFailureOps = new LayerFailureOps(v)

}
