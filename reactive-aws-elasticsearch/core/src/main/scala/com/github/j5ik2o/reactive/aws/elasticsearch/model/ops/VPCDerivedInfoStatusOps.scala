// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class VPCDerivedInfoStatusBuilderOps(val self: VPCDerivedInfoStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala(value: Option[VPCDerivedInfo]): VPCDerivedInfoStatus.Builder = {
    value.fold(self) { v => self.options(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[OptionStatus]): VPCDerivedInfoStatus.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class VPCDerivedInfoStatusOps(val self: VPCDerivedInfoStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def optionsAsScala: Option[VPCDerivedInfo] = Option(self.options)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[OptionStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVPCDerivedInfoStatusOps {

  implicit def toVPCDerivedInfoStatusBuilderOps(v: VPCDerivedInfoStatus.Builder): VPCDerivedInfoStatusBuilderOps =
    new VPCDerivedInfoStatusBuilderOps(v)

  implicit def toVPCDerivedInfoStatusOps(v: VPCDerivedInfoStatus): VPCDerivedInfoStatusOps =
    new VPCDerivedInfoStatusOps(v)

}
