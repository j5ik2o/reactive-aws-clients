// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFpgaImageAttributeResponseBuilderOps(val self: DescribeFpgaImageAttributeResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageAttributeAsScala(value: Option[FpgaImageAttribute]): DescribeFpgaImageAttributeResponse.Builder = {
    value.fold(self) { v => self.fpgaImageAttribute(v) }
  }

}

final class DescribeFpgaImageAttributeResponseOps(val self: DescribeFpgaImageAttributeResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageAttributeAsScala: Option[FpgaImageAttribute] = Option(self.fpgaImageAttribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFpgaImageAttributeResponseOps {

  implicit def toDescribeFpgaImageAttributeResponseBuilderOps(
      v: DescribeFpgaImageAttributeResponse.Builder
  ): DescribeFpgaImageAttributeResponseBuilderOps = new DescribeFpgaImageAttributeResponseBuilderOps(v)

  implicit def toDescribeFpgaImageAttributeResponseOps(
      v: DescribeFpgaImageAttributeResponse
  ): DescribeFpgaImageAttributeResponseOps = new DescribeFpgaImageAttributeResponseOps(v)

}
