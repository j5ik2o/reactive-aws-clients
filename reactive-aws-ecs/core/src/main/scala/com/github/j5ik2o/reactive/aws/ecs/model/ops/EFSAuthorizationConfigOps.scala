// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class EFSAuthorizationConfigBuilderOps(val self: EFSAuthorizationConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPointIdAsScala(value: Option[String]): EFSAuthorizationConfig.Builder = {
    value.fold(self) { v =>
      self.accessPointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamAsScala(value: Option[EFSAuthorizationConfigIAM]): EFSAuthorizationConfig.Builder = {
    value.fold(self) { v =>
      self.iam(v)
    }
  }

}

final class EFSAuthorizationConfigOps(val self: EFSAuthorizationConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPointIdAsScala: Option[String] = Option(self.accessPointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamAsScala: Option[EFSAuthorizationConfigIAM] = Option(self.iam)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEFSAuthorizationConfigOps {

  implicit def toEFSAuthorizationConfigBuilderOps(v: EFSAuthorizationConfig.Builder): EFSAuthorizationConfigBuilderOps =
    new EFSAuthorizationConfigBuilderOps(v)

  implicit def toEFSAuthorizationConfigOps(v: EFSAuthorizationConfig): EFSAuthorizationConfigOps =
    new EFSAuthorizationConfigOps(v)

}
