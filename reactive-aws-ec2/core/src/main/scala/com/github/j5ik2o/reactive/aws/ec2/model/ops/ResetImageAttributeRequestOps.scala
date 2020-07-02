// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetImageAttributeRequestBuilderOps(val self: ResetImageAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[ResetImageAttributeName]): ResetImageAttributeRequest.Builder = {
    value.fold(self) { v => self.attribute(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ResetImageAttributeRequest.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

}

final class ResetImageAttributeRequestOps(val self: ResetImageAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[ResetImageAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetImageAttributeRequestOps {

  implicit def toResetImageAttributeRequestBuilderOps(
      v: ResetImageAttributeRequest.Builder
  ): ResetImageAttributeRequestBuilderOps = new ResetImageAttributeRequestBuilderOps(v)

  implicit def toResetImageAttributeRequestOps(v: ResetImageAttributeRequest): ResetImageAttributeRequestOps =
    new ResetImageAttributeRequestOps(v)

}
