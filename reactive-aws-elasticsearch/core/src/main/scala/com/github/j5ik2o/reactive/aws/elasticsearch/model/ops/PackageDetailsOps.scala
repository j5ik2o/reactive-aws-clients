// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class PackageDetailsBuilderOps(val self: PackageDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): PackageDetails.Builder = {
    value.fold(self) { v => self.packageID(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala(value: Option[String]): PackageDetails.Builder = {
    value.fold(self) { v => self.packageName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala(value: Option[PackageType]): PackageDetails.Builder = {
    value.fold(self) { v => self.packageType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDescriptionAsScala(value: Option[String]): PackageDetails.Builder = {
    value.fold(self) { v => self.packageDescription(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageStatusAsScala(value: Option[PackageStatus]): PackageDetails.Builder = {
    value.fold(self) { v => self.packageStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): PackageDetails.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDetailsAsScala(value: Option[ErrorDetails]): PackageDetails.Builder = {
    value.fold(self) { v => self.errorDetails(v) }
  }

}

final class PackageDetailsOps(val self: PackageDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala: Option[String] = Option(self.packageName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala: Option[PackageType] = Option(self.packageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDescriptionAsScala: Option[String] = Option(self.packageDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageStatusAsScala: Option[PackageStatus] = Option(self.packageStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDetailsAsScala: Option[ErrorDetails] = Option(self.errorDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPackageDetailsOps {

  implicit def toPackageDetailsBuilderOps(v: PackageDetails.Builder): PackageDetailsBuilderOps =
    new PackageDetailsBuilderOps(v)

  implicit def toPackageDetailsOps(v: PackageDetails): PackageDetailsOps = new PackageDetailsOps(v)

}
