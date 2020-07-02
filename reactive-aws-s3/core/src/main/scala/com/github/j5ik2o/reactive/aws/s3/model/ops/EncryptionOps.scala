// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class EncryptionBuilderOps(val self: Encryption.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala(value: Option[ServerSideEncryption]): Encryption.Builder = {
    value.fold(self) { v => self.encryptionType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): Encryption.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsContextAsScala(value: Option[String]): Encryption.Builder = {
    value.fold(self) { v => self.kmsContext(v) }
  }

}

final class EncryptionOps(val self: Encryption) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionTypeAsScala: Option[ServerSideEncryption] = Option(self.encryptionType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsContextAsScala: Option[String] = Option(self.kmsContext)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptionOps {

  implicit def toEncryptionBuilderOps(v: Encryption.Builder): EncryptionBuilderOps = new EncryptionBuilderOps(v)

  implicit def toEncryptionOps(v: Encryption): EncryptionOps = new EncryptionOps(v)

}
