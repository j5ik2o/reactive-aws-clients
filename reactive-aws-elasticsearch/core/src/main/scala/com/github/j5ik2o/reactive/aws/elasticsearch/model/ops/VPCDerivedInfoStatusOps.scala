// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class VPCDerivedInfoStatusBuilderOps(val self: VPCDerivedInfoStatus.Builder) extends AnyVal {

  final def optionsAsScala(value: Option[VPCDerivedInfo]): VPCDerivedInfoStatus.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  } // VPCDerivedInfo

  final def statusAsScala(value: Option[OptionStatus]): VPCDerivedInfoStatus.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // OptionStatus

}

final class VPCDerivedInfoStatusOps(val self: VPCDerivedInfoStatus) extends AnyVal {

  final def optionsAsScala: Option[VPCDerivedInfo] = Option(self.options) // VPCDerivedInfo

  final def statusAsScala: Option[OptionStatus] = Option(self.status) // OptionStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVPCDerivedInfoStatusOps {

  implicit def toVPCDerivedInfoStatusBuilderOps(v: VPCDerivedInfoStatus.Builder): VPCDerivedInfoStatusBuilderOps =
    new VPCDerivedInfoStatusBuilderOps(v)

  implicit def toVPCDerivedInfoStatusOps(v: VPCDerivedInfoStatus): VPCDerivedInfoStatusOps =
    new VPCDerivedInfoStatusOps(v)

}
