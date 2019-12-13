// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DestinationBuilderOps(val self: Destination.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala(value: Option[String]): Destination.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala(value: Option[StorageClass]): Destination.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessControlTranslationAsScala(value: Option[AccessControlTranslation]): Destination.Builder = {
    value.fold(self) { v =>
      self.accessControlTranslation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionConfigurationAsScala(value: Option[EncryptionConfiguration]): Destination.Builder = {
    value.fold(self) { v =>
      self.encryptionConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationTimeAsScala(value: Option[ReplicationTime]): Destination.Builder = {
    value.fold(self) { v =>
      self.replicationTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala(value: Option[Metrics]): Destination.Builder = {
    value.fold(self) { v =>
      self.metrics(v)
    }
  }

}

final class DestinationOps(val self: Destination) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala: Option[String] = Option(self.account)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessControlTranslationAsScala: Option[AccessControlTranslation] = Option(self.accessControlTranslation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionConfigurationAsScala: Option[EncryptionConfiguration] = Option(self.encryptionConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationTimeAsScala: Option[ReplicationTime] = Option(self.replicationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala: Option[Metrics] = Option(self.metrics)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDestinationOps {

  implicit def toDestinationBuilderOps(v: Destination.Builder): DestinationBuilderOps = new DestinationBuilderOps(v)

  implicit def toDestinationOps(v: Destination): DestinationOps = new DestinationOps(v)

}
