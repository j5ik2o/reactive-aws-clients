// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DomainPackageDetailsBuilderOps(val self: DomainPackageDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.packageID(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala(value: Option[String]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.packageName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala(value: Option[PackageType]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.packageType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala(value: Option[java.time.Instant]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.lastUpdated(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageStatusAsScala(value: Option[DomainPackageStatus]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.domainPackageStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referencePathAsScala(value: Option[String]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.referencePath(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDetailsAsScala(value: Option[ErrorDetails]): DomainPackageDetails.Builder = {
    value.fold(self) { v =>
      self.errorDetails(v)
    }
  }

}

final class DomainPackageDetailsOps(val self: DomainPackageDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageNameAsScala: Option[String] = Option(self.packageName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageTypeAsScala: Option[PackageType] = Option(self.packageType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedAsScala: Option[java.time.Instant] = Option(self.lastUpdated)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageStatusAsScala: Option[DomainPackageStatus] = Option(self.domainPackageStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def referencePathAsScala: Option[String] = Option(self.referencePath)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorDetailsAsScala: Option[ErrorDetails] = Option(self.errorDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDomainPackageDetailsOps {

  implicit def toDomainPackageDetailsBuilderOps(v: DomainPackageDetails.Builder): DomainPackageDetailsBuilderOps =
    new DomainPackageDetailsBuilderOps(v)

  implicit def toDomainPackageDetailsOps(v: DomainPackageDetails): DomainPackageDetailsOps =
    new DomainPackageDetailsOps(v)

}
