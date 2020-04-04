// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class PackageSourceBuilderOps(val self: PackageSource.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketNameAsScala(value: Option[String]): PackageSource.Builder = {
    value.fold(self) { v =>
      self.s3BucketName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala(value: Option[String]): PackageSource.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  }

}

final class PackageSourceOps(val self: PackageSource) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3BucketNameAsScala: Option[String] = Option(self.s3BucketName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPackageSourceOps {

  implicit def toPackageSourceBuilderOps(v: PackageSource.Builder): PackageSourceBuilderOps =
    new PackageSourceBuilderOps(v)

  implicit def toPackageSourceOps(v: PackageSource): PackageSourceOps = new PackageSourceOps(v)

}
