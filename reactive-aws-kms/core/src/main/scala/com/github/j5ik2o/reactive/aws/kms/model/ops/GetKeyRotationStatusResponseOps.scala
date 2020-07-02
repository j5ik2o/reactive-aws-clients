// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GetKeyRotationStatusResponseBuilderOps(val self: GetKeyRotationStatusResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyRotationEnabledAsScala(value: Option[Boolean]): GetKeyRotationStatusResponse.Builder = {
    value.fold(self) { v => self.keyRotationEnabled(v) }
  }

}

final class GetKeyRotationStatusResponseOps(val self: GetKeyRotationStatusResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyRotationEnabledAsScala: Option[Boolean] = Option(self.keyRotationEnabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetKeyRotationStatusResponseOps {

  implicit def toGetKeyRotationStatusResponseBuilderOps(
      v: GetKeyRotationStatusResponse.Builder
  ): GetKeyRotationStatusResponseBuilderOps = new GetKeyRotationStatusResponseBuilderOps(v)

  implicit def toGetKeyRotationStatusResponseOps(v: GetKeyRotationStatusResponse): GetKeyRotationStatusResponseOps =
    new GetKeyRotationStatusResponseOps(v)

}
