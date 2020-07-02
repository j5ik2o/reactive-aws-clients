// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetFpgaImageAttributeResponseBuilderOps(val self: ResetFpgaImageAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala(value: Option[Boolean]): ResetFpgaImageAttributeResponse.Builder = {
    value.fold(self) { v => self.returnValue(v) }
  }

}

final class ResetFpgaImageAttributeResponseOps(val self: ResetFpgaImageAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetFpgaImageAttributeResponseOps {

  implicit def toResetFpgaImageAttributeResponseBuilderOps(
      v: ResetFpgaImageAttributeResponse.Builder
  ): ResetFpgaImageAttributeResponseBuilderOps = new ResetFpgaImageAttributeResponseBuilderOps(v)

  implicit def toResetFpgaImageAttributeResponseOps(
      v: ResetFpgaImageAttributeResponse
  ): ResetFpgaImageAttributeResponseOps = new ResetFpgaImageAttributeResponseOps(v)

}
