// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class EFSVolumeConfigurationBuilderOps(val self: EFSVolumeConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fileSystemIdAsScala(value: Option[String]): EFSVolumeConfiguration.Builder = {
    value.fold(self) { v => self.fileSystemId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDirectoryAsScala(value: Option[String]): EFSVolumeConfiguration.Builder = {
    value.fold(self) { v => self.rootDirectory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionAsScala(value: Option[EFSTransitEncryption]): EFSVolumeConfiguration.Builder = {
    value.fold(self) { v => self.transitEncryption(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionPortAsScala(value: Option[Int]): EFSVolumeConfiguration.Builder = {
    value.fold(self) { v => self.transitEncryptionPort(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationConfigAsScala(value: Option[EFSAuthorizationConfig]): EFSVolumeConfiguration.Builder = {
    value.fold(self) { v => self.authorizationConfig(v) }
  }

}

final class EFSVolumeConfigurationOps(val self: EFSVolumeConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fileSystemIdAsScala: Option[String] = Option(self.fileSystemId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootDirectoryAsScala: Option[String] = Option(self.rootDirectory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionAsScala: Option[EFSTransitEncryption] = Option(self.transitEncryption)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitEncryptionPortAsScala: Option[Int] = Option(self.transitEncryptionPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizationConfigAsScala: Option[EFSAuthorizationConfig] = Option(self.authorizationConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEFSVolumeConfigurationOps {

  implicit def toEFSVolumeConfigurationBuilderOps(v: EFSVolumeConfiguration.Builder): EFSVolumeConfigurationBuilderOps =
    new EFSVolumeConfigurationBuilderOps(v)

  implicit def toEFSVolumeConfigurationOps(v: EFSVolumeConfiguration): EFSVolumeConfigurationOps =
    new EFSVolumeConfigurationOps(v)

}
