// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class EncryptionAtRestOptionsStatusBuilderOps(val self: EncryptionAtRestOptionsStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[EncryptionAtRestOptions]): EncryptionAtRestOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // EncryptionAtRestOptions

  final def statusAsScala(value: Option[OptionStatus]): EncryptionAtRestOptionsStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class EncryptionAtRestOptionsStatusOps(val self: EncryptionAtRestOptionsStatus) extends AnyVal {

  final def optionsAsScala: Option[EncryptionAtRestOptions] = Option(self.options) // EncryptionAtRestOptions

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEncryptionAtRestOptionsStatusOps {

  implicit def toEncryptionAtRestOptionsStatusBuilderOps(
      v: EncryptionAtRestOptionsStatus.Builder
  ): EncryptionAtRestOptionsStatusBuilderOps = new EncryptionAtRestOptionsStatusBuilderOps(v)

  implicit def toEncryptionAtRestOptionsStatusOps(v: EncryptionAtRestOptionsStatus): EncryptionAtRestOptionsStatusOps =
    new EncryptionAtRestOptionsStatusOps(v)

}
