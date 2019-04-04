// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class EncryptionConfigurationBuilderOps(val self: EncryptionConfiguration.Builder) extends AnyVal {

  final def withReplicaKmsKeyIDAsScala(value: Option[String]): EncryptionConfiguration.Builder = {
    value.fold(self) { v =>
      self.replicaKmsKeyID(v)
    }
  } // String

}

final class EncryptionConfigurationOps(val self: EncryptionConfiguration) extends AnyVal {

  final def replicaKmsKeyIDAsScala: Option[String] = Option(self.replicaKmsKeyID) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptionConfigurationOps {

  implicit def toEncryptionConfigurationBuilderOps(
      v: EncryptionConfiguration.Builder
  ): EncryptionConfigurationBuilderOps = new EncryptionConfigurationBuilderOps(v)

  implicit def toEncryptionConfigurationOps(v: EncryptionConfiguration): EncryptionConfigurationOps =
    new EncryptionConfigurationOps(v)

}
