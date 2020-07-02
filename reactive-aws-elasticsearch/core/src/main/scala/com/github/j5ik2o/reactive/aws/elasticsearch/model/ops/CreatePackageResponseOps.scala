// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class CreatePackageResponseBuilderOps(val self: CreatePackageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsAsScala(value: Option[PackageDetails]): CreatePackageResponse.Builder = {
    value.fold(self) { v => self.packageDetails(v) }
  }

}

final class CreatePackageResponseOps(val self: CreatePackageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsAsScala: Option[PackageDetails] = Option(self.packageDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePackageResponseOps {

  implicit def toCreatePackageResponseBuilderOps(v: CreatePackageResponse.Builder): CreatePackageResponseBuilderOps =
    new CreatePackageResponseBuilderOps(v)

  implicit def toCreatePackageResponseOps(v: CreatePackageResponse): CreatePackageResponseOps =
    new CreatePackageResponseOps(v)

}
