// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EncryptionAtRestOptionsBuilderOps(val self: EncryptionAtRestOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): EncryptionAtRestOptions.Builder = {
    value.fold(self) { v => self.enabled(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala(value: Option[String]): EncryptionAtRestOptions.Builder = {
    value.fold(self) { v => self.kmsKeyId(v) }
  }

}

final class EncryptionAtRestOptionsOps(val self: EncryptionAtRestOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyIdAsScala: Option[String] = Option(self.kmsKeyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptionAtRestOptionsOps {

  implicit def toEncryptionAtRestOptionsBuilderOps(
      v: EncryptionAtRestOptions.Builder
  ): EncryptionAtRestOptionsBuilderOps = new EncryptionAtRestOptionsBuilderOps(v)

  implicit def toEncryptionAtRestOptionsOps(v: EncryptionAtRestOptions): EncryptionAtRestOptionsOps =
    new EncryptionAtRestOptionsOps(v)

}
