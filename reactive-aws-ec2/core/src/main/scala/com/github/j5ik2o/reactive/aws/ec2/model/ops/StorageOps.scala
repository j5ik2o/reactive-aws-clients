// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StorageBuilderOps(val self: Storage.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3AsScala(value: Option[S3Storage]): Storage.Builder = {
    value.fold(self) { v => self.s3(v) }
  }

}

final class StorageOps(val self: Storage) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3AsScala: Option[S3Storage] = Option(self.s3)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageOps {

  implicit def toStorageBuilderOps(v: Storage.Builder): StorageBuilderOps = new StorageBuilderOps(v)

  implicit def toStorageOps(v: Storage): StorageOps = new StorageOps(v)

}
