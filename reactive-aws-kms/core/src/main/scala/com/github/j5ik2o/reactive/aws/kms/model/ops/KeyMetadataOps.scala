// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class KeyMetadataBuilderOps(val self: KeyMetadata.Builder) extends AnyVal {

  final def awsAccountIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.awsAccountId(v)
    }
  }

  final def keyIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def arnAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def creationDateAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  final def enabledAsScala(value: Option[Boolean]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def keyUsageAsScala(value: Option[KeyUsageType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyUsage(v)
    }
  }

  final def keyStateAsScala(value: Option[KeyState]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyState(v)
    }
  }

  final def deletionDateAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.deletionDate(v)
    }
  }

  final def validToAsScala(value: Option[java.time.Instant]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.validTo(v)
    }
  }

  final def originAsScala(value: Option[OriginType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.origin(v)
    }
  }

  final def customKeyStoreIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  final def cloudHsmClusterIdAsScala(value: Option[String]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.cloudHsmClusterId(v)
    }
  }

  final def expirationModelAsScala(value: Option[ExpirationModelType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.expirationModel(v)
    }
  }

  final def keyManagerAsScala(value: Option[KeyManagerType]): KeyMetadata.Builder = {
    value.fold(self) { v =>
      self.keyManager(v)
    }
  }

}

final class KeyMetadataOps(val self: KeyMetadata) extends AnyVal {

  final def awsAccountIdAsScala: Option[String] = Option(self.awsAccountId)

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def keyUsageAsScala: Option[KeyUsageType] = Option(self.keyUsage)

  final def keyStateAsScala: Option[KeyState] = Option(self.keyState)

  final def deletionDateAsScala: Option[java.time.Instant] = Option(self.deletionDate)

  final def validToAsScala: Option[java.time.Instant] = Option(self.validTo)

  final def originAsScala: Option[OriginType] = Option(self.origin)

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  final def cloudHsmClusterIdAsScala: Option[String] = Option(self.cloudHsmClusterId)

  final def expirationModelAsScala: Option[ExpirationModelType] = Option(self.expirationModel)

  final def keyManagerAsScala: Option[KeyManagerType] = Option(self.keyManager)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyMetadataOps {

  implicit def toKeyMetadataBuilderOps(v: KeyMetadata.Builder): KeyMetadataBuilderOps = new KeyMetadataBuilderOps(v)

  implicit def toKeyMetadataOps(v: KeyMetadata): KeyMetadataOps = new KeyMetadataOps(v)

}
