// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class KeyMetadataBuilderOps(val self: KeyMetadata.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsAccountIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.awsAccountId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala(value: Option[KeyUsageType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyUsage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStateAsScala(value: Option[KeyState]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyState(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionDateAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.deletionDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validToAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.validTo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala(value: Option[OriginType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.cloudHsmClusterId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationModelAsScala(value: Option[ExpirationModelType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.expirationModel(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyManagerAsScala(value: Option[KeyManagerType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyManager(v)
    }
  }

}

final class KeyMetadataOps(val self: KeyMetadata) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsAccountIdAsScala: Option[String] = Option(self.awsAccountId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyUsageAsScala: Option[KeyUsageType] = Option(self.keyUsage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyStateAsScala: Option[KeyState] = Option(self.keyState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionDateAsScala: Option[java.time.Instant] = Option(self.deletionDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def validToAsScala: Option[java.time.Instant] = Option(self.validTo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def originAsScala: Option[OriginType] = Option(self.origin)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cloudHsmClusterIdAsScala: Option[String] = Option(self.cloudHsmClusterId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationModelAsScala: Option[ExpirationModelType] = Option(self.expirationModel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyManagerAsScala: Option[KeyManagerType] = Option(self.keyManager)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyMetadataOps {

  implicit def toKeyMetadataBuilderOps(v: KeyMetadata.Builder): KeyMetadataBuilderOps = new KeyMetadataBuilderOps(v)

  implicit def toKeyMetadataOps(v: KeyMetadata): KeyMetadataOps = new KeyMetadataOps(v)

}
