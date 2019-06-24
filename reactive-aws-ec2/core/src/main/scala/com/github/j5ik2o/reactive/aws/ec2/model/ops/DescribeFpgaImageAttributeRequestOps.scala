// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeFpgaImageAttributeRequestBuilderOps(val self: DescribeFpgaImageAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala(value: Option[String]): DescribeFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.fpgaImageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[FpgaImageAttributeName]): DescribeFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

}

final class DescribeFpgaImageAttributeRequestOps(val self: DescribeFpgaImageAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[FpgaImageAttributeName] = Option(self.attribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeFpgaImageAttributeRequestOps {

  implicit def toDescribeFpgaImageAttributeRequestBuilderOps(
      v: DescribeFpgaImageAttributeRequest.Builder
  ): DescribeFpgaImageAttributeRequestBuilderOps = new DescribeFpgaImageAttributeRequestBuilderOps(v)

  implicit def toDescribeFpgaImageAttributeRequestOps(
      v: DescribeFpgaImageAttributeRequest
  ): DescribeFpgaImageAttributeRequestOps = new DescribeFpgaImageAttributeRequestOps(v)

}
