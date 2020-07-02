// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateNodegroupVersionRequestBuilderOps(val self: UpdateNodegroupVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.nodegroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala(value: Option[String]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.releaseVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala(value: Option[Boolean]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.force(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): UpdateNodegroupVersionRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

}

final class UpdateNodegroupVersionRequestOps(val self: UpdateNodegroupVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala: Option[String] = Option(self.releaseVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala: Option[Boolean] = Option(self.force)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateNodegroupVersionRequestOps {

  implicit def toUpdateNodegroupVersionRequestBuilderOps(
      v: UpdateNodegroupVersionRequest.Builder
  ): UpdateNodegroupVersionRequestBuilderOps = new UpdateNodegroupVersionRequestBuilderOps(v)

  implicit def toUpdateNodegroupVersionRequestOps(v: UpdateNodegroupVersionRequest): UpdateNodegroupVersionRequestOps =
    new UpdateNodegroupVersionRequestOps(v)

}
