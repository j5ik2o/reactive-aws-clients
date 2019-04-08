// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class VersioningConfigurationBuilderOps(val self: VersioningConfiguration.Builder) extends AnyVal {

  final def mfaDeleteAsScala(value: Option[MFADelete]): VersioningConfiguration.Builder = {
    value.fold(self) { v =>
      self.mfaDelete(v)
    }
  } // MFADelete

  final def statusAsScala(value: Option[BucketVersioningStatus]): VersioningConfiguration.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // BucketVersioningStatus

}

final class VersioningConfigurationOps(val self: VersioningConfiguration) extends AnyVal {

  final def mfaDeleteAsScala: Option[MFADelete] = Option(self.mfaDelete) // MFADelete

  final def statusAsScala: Option[BucketVersioningStatus] = Option(self.status) // BucketVersioningStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVersioningConfigurationOps {

  implicit def toVersioningConfigurationBuilderOps(
      v: VersioningConfiguration.Builder
  ): VersioningConfigurationBuilderOps = new VersioningConfigurationBuilderOps(v)

  implicit def toVersioningConfigurationOps(v: VersioningConfiguration): VersioningConfigurationOps =
    new VersioningConfigurationOps(v)

}
