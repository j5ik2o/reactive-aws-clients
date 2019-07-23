// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResetInstanceAttributeRequestBuilderOps(val self: ResetInstanceAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[InstanceAttributeName]): ResetInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ResetInstanceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class ResetInstanceAttributeRequestOps(val self: ResetInstanceAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[InstanceAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResetInstanceAttributeRequestOps {

  implicit def toResetInstanceAttributeRequestBuilderOps(
      v: ResetInstanceAttributeRequest.Builder
  ): ResetInstanceAttributeRequestBuilderOps = new ResetInstanceAttributeRequestBuilderOps(v)

  implicit def toResetInstanceAttributeRequestOps(v: ResetInstanceAttributeRequest): ResetInstanceAttributeRequestOps =
    new ResetInstanceAttributeRequestOps(v)

}
