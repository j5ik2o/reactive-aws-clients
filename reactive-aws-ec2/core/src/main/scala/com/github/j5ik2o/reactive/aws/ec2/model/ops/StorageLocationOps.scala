// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StorageLocationBuilderOps(val self: StorageLocation.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): StorageLocation.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def keyAsScala(value: Option[String]): StorageLocation.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

}

final class StorageLocationOps(val self: StorageLocation) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def keyAsScala: Option[String] = Option(self.key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageLocationOps {

  implicit def toStorageLocationBuilderOps(v: StorageLocation.Builder): StorageLocationBuilderOps =
    new StorageLocationBuilderOps(v)

  implicit def toStorageLocationOps(v: StorageLocation): StorageLocationOps = new StorageLocationOps(v)

}
