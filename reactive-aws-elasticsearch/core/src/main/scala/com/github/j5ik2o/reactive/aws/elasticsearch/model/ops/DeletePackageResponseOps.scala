// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeletePackageResponseBuilderOps(val self: DeletePackageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsAsScala(value: Option[PackageDetails]): DeletePackageResponse.Builder = {
    value.fold(self) { v =>
      self.packageDetails(v)
    }
  }

}

final class DeletePackageResponseOps(val self: DeletePackageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageDetailsAsScala: Option[PackageDetails] = Option(self.packageDetails)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePackageResponseOps {

  implicit def toDeletePackageResponseBuilderOps(v: DeletePackageResponse.Builder): DeletePackageResponseBuilderOps =
    new DeletePackageResponseBuilderOps(v)

  implicit def toDeletePackageResponseOps(v: DeletePackageResponse): DeletePackageResponseOps =
    new DeletePackageResponseOps(v)

}
