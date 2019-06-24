// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchCheckLayerAvailabilityResponseBuilderOps(val self: BatchCheckLayerAvailabilityResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[Layer]]): BatchCheckLayerAvailabilityResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[LayerFailure]]): BatchCheckLayerAvailabilityResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class BatchCheckLayerAvailabilityResponseOps(val self: BatchCheckLayerAvailabilityResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala: Option[Seq[Layer]] = Option(self.layers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[LayerFailure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
