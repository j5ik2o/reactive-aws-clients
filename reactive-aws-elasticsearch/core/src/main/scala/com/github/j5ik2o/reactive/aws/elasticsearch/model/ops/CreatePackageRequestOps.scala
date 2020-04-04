// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreatePackageRequestBuilderOps(val self: CreatePackageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala(value: Option[String]): CreatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.packageName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala(value: Option[PackageType]): CreatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.packageType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDescriptionAsScala(value: Option[String]): CreatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.packageDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageSourceAsScala(value: Option[PackageSource]): CreatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.packageSource(v)
    }
  }

}

final class CreatePackageRequestOps(val self: CreatePackageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala: Option[String] = Option(self.packageName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala: Option[PackageType] = Option(self.packageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDescriptionAsScala: Option[String] = Option(self.packageDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageSourceAsScala: Option[PackageSource] = Option(self.packageSource)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePackageRequestOps {

  implicit def toCreatePackageRequestBuilderOps(v: CreatePackageRequest.Builder): CreatePackageRequestBuilderOps =
    new CreatePackageRequestBuilderOps(v)

  implicit def toCreatePackageRequestOps(v: CreatePackageRequest): CreatePackageRequestOps =
    new CreatePackageRequestOps(v)

}
