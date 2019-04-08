// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchCheckLayerAvailabilityResponseBuilderOps(val self: BatchCheckLayerAvailabilityResponse.Builder)
    extends AnyVal {

  final def layersAsScala(value: Option[Seq[Layer]]): BatchCheckLayerAvailabilityResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    }
  }

  final def failuresAsScala(value: Option[Seq[LayerFailure]]): BatchCheckLayerAvailabilityResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failures(v.asJava)
    }
  }

}

final class BatchCheckLayerAvailabilityResponseOps(val self: BatchCheckLayerAvailabilityResponse) extends AnyVal {

  final def layersAsScala: Option[Seq[Layer]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def failuresAsScala: Option[Seq[LayerFailure]] = Option(self.failures).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchCheckLayerAvailabilityResponseOps {

  implicit def toBatchCheckLayerAvailabilityResponseBuilderOps(
      v: BatchCheckLayerAvailabilityResponse.Builder
  ): BatchCheckLayerAvailabilityResponseBuilderOps = new BatchCheckLayerAvailabilityResponseBuilderOps(v)

  implicit def toBatchCheckLayerAvailabilityResponseOps(
      v: BatchCheckLayerAvailabilityResponse
  ): BatchCheckLayerAvailabilityResponseOps = new BatchCheckLayerAvailabilityResponseOps(v)

}
