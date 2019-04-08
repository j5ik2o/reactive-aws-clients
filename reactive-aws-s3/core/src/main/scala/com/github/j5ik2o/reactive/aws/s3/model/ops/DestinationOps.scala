// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def accountAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  } // String

  final def storageClassAsScala(value: Option[StorageClass]): Destination.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // StorageClass

  final def accessControlTranslationAsScala(value: Option[AccessControlTranslation]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessControlTranslation(v)
    }
  } // AccessControlTranslation

  final def encryptionConfigurationAsScala(value: Option[EncryptionConfiguration]): Destination.Builder = {
    value.fold(self) { v =>
      self.encryptionConfiguration(v)
    }
  } // EncryptionConfiguration

}

final class DestinationOps(val self: Destination) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def accountAsScala: Option[String] = Option(self.account) // String

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // StorageClass

  final def accessControlTranslationAsScala: Option[AccessControlTranslation] =
    Option(self.accessControlTranslation) // AccessControlTranslation

  final def encryptionConfigurationAsScala: Option[EncryptionConfiguration] =
    Option(self.encryptionConfiguration) // EncryptionConfiguration

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
