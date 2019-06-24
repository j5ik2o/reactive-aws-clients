// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyFpgaImageAttributeResponseBuilderOps(val self: ModifyFpgaImageAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageAttributeAsScala(value: Option[FpgaImageAttribute]): ModifyFpgaImageAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.fpgaImageAttribute(v)
    }
  }

}

final class ModifyFpgaImageAttributeResponseOps(val self: ModifyFpgaImageAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageAttributeAsScala: Option[FpgaImageAttribute] = Option(self.fpgaImageAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyFpgaImageAttributeResponseOps {

  implicit def toModifyFpgaImageAttributeResponseBuilderOps(
      v: ModifyFpgaImageAttributeResponse.Builder
  ): ModifyFpgaImageAttributeResponseBuilderOps = new ModifyFpgaImageAttributeResponseBuilderOps(v)

  implicit def toModifyFpgaImageAttributeResponseOps(
      v: ModifyFpgaImageAttributeResponse
  ): ModifyFpgaImageAttributeResponseOps = new ModifyFpgaImageAttributeResponseOps(v)

}
