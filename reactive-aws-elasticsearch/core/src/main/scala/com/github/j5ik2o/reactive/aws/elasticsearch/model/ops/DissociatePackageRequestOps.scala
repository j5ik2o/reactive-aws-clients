// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DissociatePackageRequestBuilderOps(val self: DissociatePackageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): DissociatePackageRequest.Builder = {
    value.fold(self) { v => self.packageID(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DissociatePackageRequest.Builder = {
    value.fold(self) { v => self.domainName(v) }
  }

}

final class DissociatePackageRequestOps(val self: DissociatePackageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDissociatePackageRequestOps {

  implicit def toDissociatePackageRequestBuilderOps(
      v: DissociatePackageRequest.Builder
  ): DissociatePackageRequestBuilderOps = new DissociatePackageRequestBuilderOps(v)

  implicit def toDissociatePackageRequestOps(v: DissociatePackageRequest): DissociatePackageRequestOps =
    new DissociatePackageRequestOps(v)

}
