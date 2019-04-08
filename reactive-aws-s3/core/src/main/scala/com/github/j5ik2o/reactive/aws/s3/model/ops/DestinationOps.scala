// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def accountAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  }

  final def storageClassAsScala(value: Option[StorageClass]): Destination.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  final def accessControlTranslationAsScala(value: Option[AccessControlTranslation]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessControlTranslation(v)
    }
  }

  final def encryptionConfigurationAsScala(value: Option[EncryptionConfiguration]): Destination.Builder = {
    value.fold(self) { v =>
      self.encryptionConfiguration(v)
    }
  }

}

final class DestinationOps(val self: Destination) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def accountAsScala: Option[String] = Option(self.account)

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  final def accessControlTranslationAsScala: Option[AccessControlTranslation] = Option(self.accessControlTranslation)

  final def encryptionConfigurationAsScala: Option[EncryptionConfiguration] = Option(self.encryptionConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
