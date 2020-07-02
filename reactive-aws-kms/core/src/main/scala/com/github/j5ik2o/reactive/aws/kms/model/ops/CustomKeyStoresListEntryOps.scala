// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CustomKeyStoresListEntryBuilderOps(val self: CustomKeyStoresListEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.customKeyStoreId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala(value: Option[String]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.customKeyStoreName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala(value: Option[String]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.cloudHsmClusterId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trustAnchorCertificateAsScala(value: Option[String]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.trustAnchorCertificate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStateAsScala(value: Option[ConnectionStateType]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.connectionState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionErrorCodeAsScala(value: Option[ConnectionErrorCodeType]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.connectionErrorCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala(value: Option[java.time.Instant]): CustomKeyStoresListEntry.Builder = {
    value.fold(self) { v => self.creationDate(v) }
  }

}

final class CustomKeyStoresListEntryOps(val self: CustomKeyStoresListEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala: Option[String] = Option(self.customKeyStoreName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala: Option[String] = Option(self.cloudHsmClusterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trustAnchorCertificateAsScala: Option[String] = Option(self.trustAnchorCertificate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionStateAsScala: Option[ConnectionStateType] = Option(self.connectionState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionErrorCodeAsScala: Option[ConnectionErrorCodeType] = Option(self.connectionErrorCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCustomKeyStoresListEntryOps {

  implicit def toCustomKeyStoresListEntryBuilderOps(
      v: CustomKeyStoresListEntry.Builder
  ): CustomKeyStoresListEntryBuilderOps = new CustomKeyStoresListEntryBuilderOps(v)

  implicit def toCustomKeyStoresListEntryOps(v: CustomKeyStoresListEntry): CustomKeyStoresListEntryOps =
    new CustomKeyStoresListEntryOps(v)

}
