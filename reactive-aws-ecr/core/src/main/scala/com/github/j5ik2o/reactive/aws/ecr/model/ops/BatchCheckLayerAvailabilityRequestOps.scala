// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchCheckLayerAvailabilityRequestBuilderOps(val self: BatchCheckLayerAvailabilityRequest.Builder)
    extends AnyVal {

  final def registryIdAsScala(value: Option[String]): BatchCheckLayerAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): BatchCheckLayerAvailabilityRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def layerDigestsAsScala(value: Option[Seq[String]]): BatchCheckLayerAvailabilityRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layerDigests(v.asJava)
    }
  }

}

final class BatchCheckLayerAvailabilityRequestOps(val self: BatchCheckLayerAvailabilityRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def layerDigestsAsScala: Option[Seq[String]] = Option(self.layerDigests).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchCheckLayerAvailabilityRequestOps {

  implicit def toBatchCheckLayerAvailabilityRequestBuilderOps(
      v: BatchCheckLayerAvailabilityRequest.Builder
  ): BatchCheckLayerAvailabilityRequestBuilderOps = new BatchCheckLayerAvailabilityRequestBuilderOps(v)

  implicit def toBatchCheckLayerAvailabilityRequestOps(
      v: BatchCheckLayerAvailabilityRequest
  ): BatchCheckLayerAvailabilityRequestOps = new BatchCheckLayerAvailabilityRequestOps(v)

}
