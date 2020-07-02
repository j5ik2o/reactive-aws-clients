// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceMetadataOptionsResponseBuilderOps(val self: ModifyInstanceMetadataOptionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ModifyInstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMetadataOptionsAsScala(
      value: Option[InstanceMetadataOptionsResponse]
  ): ModifyInstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.instanceMetadataOptions(v) }
  }

}

final class ModifyInstanceMetadataOptionsResponseOps(val self: ModifyInstanceMetadataOptionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMetadataOptionsAsScala: Option[InstanceMetadataOptionsResponse] =
    Option(self.instanceMetadataOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceMetadataOptionsResponseOps {

  implicit def toModifyInstanceMetadataOptionsResponseBuilderOps(
      v: ModifyInstanceMetadataOptionsResponse.Builder
  ): ModifyInstanceMetadataOptionsResponseBuilderOps = new ModifyInstanceMetadataOptionsResponseBuilderOps(v)

  implicit def toModifyInstanceMetadataOptionsResponseOps(
      v: ModifyInstanceMetadataOptionsResponse
  ): ModifyInstanceMetadataOptionsResponseOps = new ModifyInstanceMetadataOptionsResponseOps(v)

}
