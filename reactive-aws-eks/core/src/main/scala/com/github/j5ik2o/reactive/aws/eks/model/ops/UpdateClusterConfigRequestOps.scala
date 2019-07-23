// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateClusterConfigRequestBuilderOps(val self: UpdateClusterConfigRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): UpdateClusterConfigRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesVpcConfigAsScala(value: Option[VpcConfigRequest]): UpdateClusterConfigRequest.Builder = {
    value.fold(self) { v =>
      self.resourcesVpcConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingAsScala(value: Option[Logging]): UpdateClusterConfigRequest.Builder = {
    value.fold(self) { v =>
      self.logging(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): UpdateClusterConfigRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class UpdateClusterConfigRequestOps(val self: UpdateClusterConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesVpcConfigAsScala: Option[VpcConfigRequest] = Option(self.resourcesVpcConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingAsScala: Option[Logging] = Option(self.logging)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterConfigRequestOps {

  implicit def toUpdateClusterConfigRequestBuilderOps(
      v: UpdateClusterConfigRequest.Builder
  ): UpdateClusterConfigRequestBuilderOps = new UpdateClusterConfigRequestBuilderOps(v)

  implicit def toUpdateClusterConfigRequestOps(v: UpdateClusterConfigRequest): UpdateClusterConfigRequestOps =
    new UpdateClusterConfigRequestOps(v)

}
