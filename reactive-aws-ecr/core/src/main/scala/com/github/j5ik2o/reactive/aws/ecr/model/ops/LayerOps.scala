// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class LayerBuilderOps(val self: Layer.Builder) extends AnyVal {

  final def layerDigestAsScala(value: Option[String]): Layer.Builder = {
    value.fold(self) { v =>
      self.layerDigest(v)
    }
  }

  final def layerAvailabilityAsScala(value: Option[LayerAvailability]): Layer.Builder = {
    value.fold(self) { v =>
      self.layerAvailability(v)
    }
  }

  final def layerSizeAsScala(value: Option[Long]): Layer.Builder = {
    value.fold(self) { v =>
      self.layerSize(v)
    }
  }

  final def mediaTypeAsScala(value: Option[String]): Layer.Builder = {
    value.fold(self) { v =>
      self.mediaType(v)
    }
  }

}

final class LayerOps(val self: Layer) extends AnyVal {

  final def layerDigestAsScala: Option[String] = Option(self.layerDigest)

  final def layerAvailabilityAsScala: Option[LayerAvailability] = Option(self.layerAvailability)

  final def layerSizeAsScala: Option[Long] = Option(self.layerSize)

  final def mediaTypeAsScala: Option[String] = Option(self.mediaType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLayerOps {

  implicit def toLayerBuilderOps(v: Layer.Builder): LayerBuilderOps = new LayerBuilderOps(v)

  implicit def toLayerOps(v: Layer): LayerOps = new LayerOps(v)

}
