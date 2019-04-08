// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetKeyRotationStatusRequestBuilderOps(val self: GetKeyRotationStatusRequest.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): GetKeyRotationStatusRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

}

final class GetKeyRotationStatusRequestOps(val self: GetKeyRotationStatusRequest) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetKeyRotationStatusRequestOps {

  implicit def toGetKeyRotationStatusRequestBuilderOps(
      v: GetKeyRotationStatusRequest.Builder
  ): GetKeyRotationStatusRequestBuilderOps = new GetKeyRotationStatusRequestBuilderOps(v)

  implicit def toGetKeyRotationStatusRequestOps(v: GetKeyRotationStatusRequest): GetKeyRotationStatusRequestOps =
    new GetKeyRotationStatusRequestOps(v)

}
