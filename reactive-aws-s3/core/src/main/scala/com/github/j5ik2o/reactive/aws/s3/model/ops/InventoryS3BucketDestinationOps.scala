// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryS3BucketDestinationBuilderOps(val self: InventoryS3BucketDestination.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountIdAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.accountId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala(value: Option[InventoryFormat]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAsScala(value: Option[InventoryEncryption]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.encryption(v)
    }
  }

}

final class InventoryS3BucketDestinationOps(val self: InventoryS3BucketDestination) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountIdAsScala: Option[String] = Option(self.accountId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bucketAsScala: Option[String] = Option(self.bucket)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def formatAsScala: Option[InventoryFormat] = Option(self.format)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionAsScala: Option[InventoryEncryption] = Option(self.encryption)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryS3BucketDestinationOps {

  implicit def toInventoryS3BucketDestinationBuilderOps(
      v: InventoryS3BucketDestination.Builder
  ): InventoryS3BucketDestinationBuilderOps = new InventoryS3BucketDestinationBuilderOps(v)

  implicit def toInventoryS3BucketDestinationOps(v: InventoryS3BucketDestination): InventoryS3BucketDestinationOps =
    new InventoryS3BucketDestinationOps(v)

}
