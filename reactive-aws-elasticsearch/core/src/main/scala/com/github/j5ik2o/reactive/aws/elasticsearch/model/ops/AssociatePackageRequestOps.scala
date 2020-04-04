// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AssociatePackageRequestBuilderOps(val self: AssociatePackageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): AssociatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.packageID(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): AssociatePackageRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

}

final class AssociatePackageRequestOps(val self: AssociatePackageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociatePackageRequestOps {

  implicit def toAssociatePackageRequestBuilderOps(
      v: AssociatePackageRequest.Builder
  ): AssociatePackageRequestBuilderOps = new AssociatePackageRequestBuilderOps(v)

  implicit def toAssociatePackageRequestOps(v: AssociatePackageRequest): AssociatePackageRequestOps =
    new AssociatePackageRequestOps(v)

}
