// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryS3BucketDestinationBuilderOps(val self: InventoryS3BucketDestination.Builder) extends AnyVal {

  final def accountIdAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.accountId(v)
    }
  }

  final def bucketAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def formatAsScala(value: Option[InventoryFormat]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.format(v)
    }
  }

  final def prefixAsScala(value: Option[String]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def encryptionAsScala(value: Option[InventoryEncryption]): InventoryS3BucketDestination.Builder = {
    value.fold(self) { v =>
      self.encryption(v)
    }
  }

}

final class InventoryS3BucketDestinationOps(val self: InventoryS3BucketDestination) extends AnyVal {

  final def accountIdAsScala: Option[String] = Option(self.accountId)

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def formatAsScala: Option[InventoryFormat] = Option(self.format)

  final def prefixAsScala: Option[String] = Option(self.prefix)

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
