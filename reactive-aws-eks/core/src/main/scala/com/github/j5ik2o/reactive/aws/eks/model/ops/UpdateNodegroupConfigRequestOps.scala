// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateNodegroupConfigRequestBuilderOps(val self: UpdateNodegroupConfigRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): UpdateNodegroupConfigRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): UpdateNodegroupConfigRequest.Builder = {
    value.fold(self) { v =>
      self.nodegroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[UpdateLabelsPayload]): UpdateNodegroupConfigRequest.Builder = {
    value.fold(self) { v =>
      self.labels(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala(value: Option[NodegroupScalingConfig]): UpdateNodegroupConfigRequest.Builder = {
    value.fold(self) { v =>
      self.scalingConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): UpdateNodegroupConfigRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class UpdateNodegroupConfigRequestOps(val self: UpdateNodegroupConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[UpdateLabelsPayload] = Option(self.labels)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala: Option[NodegroupScalingConfig] = Option(self.scalingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateNodegroupConfigRequestOps {

  implicit def toUpdateNodegroupConfigRequestBuilderOps(
      v: UpdateNodegroupConfigRequest.Builder
  ): UpdateNodegroupConfigRequestBuilderOps = new UpdateNodegroupConfigRequestBuilderOps(v)

  implicit def toUpdateNodegroupConfigRequestOps(v: UpdateNodegroupConfigRequest): UpdateNodegroupConfigRequestOps =
    new UpdateNodegroupConfigRequestOps(v)

}
