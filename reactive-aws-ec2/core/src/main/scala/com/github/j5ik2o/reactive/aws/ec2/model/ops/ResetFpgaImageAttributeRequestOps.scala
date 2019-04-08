// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetFpgaImageAttributeRequestBuilderOps(val self: ResetFpgaImageAttributeRequest.Builder) extends AnyVal {

  final def fpgaImageIdAsScala(value: Option[String]): ResetFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.fpgaImageId(v)
    }
  }

  final def attributeAsScala(value: Option[ResetFpgaImageAttributeName]): ResetFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

}

final class ResetFpgaImageAttributeRequestOps(val self: ResetFpgaImageAttributeRequest) extends AnyVal {

  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  final def attributeAsScala: Option[ResetFpgaImageAttributeName] = Option(self.attribute)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetFpgaImageAttributeRequestOps {

  implicit def toResetFpgaImageAttributeRequestBuilderOps(
      v: ResetFpgaImageAttributeRequest.Builder
  ): ResetFpgaImageAttributeRequestBuilderOps = new ResetFpgaImageAttributeRequestBuilderOps(v)

  implicit def toResetFpgaImageAttributeRequestOps(
      v: ResetFpgaImageAttributeRequest
  ): ResetFpgaImageAttributeRequestOps = new ResetFpgaImageAttributeRequestOps(v)

}
