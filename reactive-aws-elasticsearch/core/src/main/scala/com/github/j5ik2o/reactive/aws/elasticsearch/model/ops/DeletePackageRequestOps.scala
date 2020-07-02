// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DeletePackageRequestBuilderOps(val self: DeletePackageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala(value: Option[String]): DeletePackageRequest.Builder = {
    value.fold(self) { v => self.packageID(v) }
  }

}

final class DeletePackageRequestOps(val self: DeletePackageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def packageIDAsScala: Option[String] = Option(self.packageID)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeletePackageRequestOps {

  implicit def toDeletePackageRequestBuilderOps(v: DeletePackageRequest.Builder): DeletePackageRequestBuilderOps =
    new DeletePackageRequestBuilderOps(v)

  implicit def toDeletePackageRequestOps(v: DeletePackageRequest): DeletePackageRequestOps =
    new DeletePackageRequestOps(v)

}
