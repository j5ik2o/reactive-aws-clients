// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DissociatePackageResponseBuilderOps(val self: DissociatePackageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsAsScala(value: Option[DomainPackageDetails]): DissociatePackageResponse.Builder = {
    value.fold(self) { v =>
      self.domainPackageDetails(v)
    }
  }

}

final class DissociatePackageResponseOps(val self: DissociatePackageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsAsScala: Option[DomainPackageDetails] = Option(self.domainPackageDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDissociatePackageResponseOps {

  implicit def toDissociatePackageResponseBuilderOps(
      v: DissociatePackageResponse.Builder
  ): DissociatePackageResponseBuilderOps = new DissociatePackageResponseBuilderOps(v)

  implicit def toDissociatePackageResponseOps(v: DissociatePackageResponse): DissociatePackageResponseOps =
    new DissociatePackageResponseOps(v)

}
