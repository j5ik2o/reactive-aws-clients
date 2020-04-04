// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class AssociatePackageResponseBuilderOps(val self: AssociatePackageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsAsScala(value: Option[DomainPackageDetails]): AssociatePackageResponse.Builder = {
    value.fold(self) { v =>
      self.domainPackageDetails(v)
    }
  }

}

final class AssociatePackageResponseOps(val self: AssociatePackageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsAsScala: Option[DomainPackageDetails] = Option(self.domainPackageDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociatePackageResponseOps {

  implicit def toAssociatePackageResponseBuilderOps(
      v: AssociatePackageResponse.Builder
  ): AssociatePackageResponseBuilderOps = new AssociatePackageResponseBuilderOps(v)

  implicit def toAssociatePackageResponseOps(v: AssociatePackageResponse): AssociatePackageResponseOps =
    new AssociatePackageResponseOps(v)

}
