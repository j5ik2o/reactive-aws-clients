// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateClusterVersionRequestBuilderOps(val self: UpdateClusterVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): UpdateClusterVersionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): UpdateClusterVersionRequest.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): UpdateClusterVersionRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class UpdateClusterVersionRequestOps(val self: UpdateClusterVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterVersionRequestOps {

  implicit def toUpdateClusterVersionRequestBuilderOps(
      v: UpdateClusterVersionRequest.Builder
  ): UpdateClusterVersionRequestBuilderOps = new UpdateClusterVersionRequestBuilderOps(v)

  implicit def toUpdateClusterVersionRequestOps(v: UpdateClusterVersionRequest): UpdateClusterVersionRequestOps =
    new UpdateClusterVersionRequestOps(v)

}
