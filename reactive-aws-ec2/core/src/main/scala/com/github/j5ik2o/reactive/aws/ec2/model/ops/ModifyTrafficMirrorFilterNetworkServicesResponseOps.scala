// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyTrafficMirrorFilterNetworkServicesResponseBuilderOps(
    val self: ModifyTrafficMirrorFilterNetworkServicesResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterAsScala(
      value: Option[TrafficMirrorFilter]
  ): ModifyTrafficMirrorFilterNetworkServicesResponse.Builder = {
    value.fold(self) { v =>
      self.trafficMirrorFilter(v)
    }
  }

}

final class ModifyTrafficMirrorFilterNetworkServicesResponseOps(
    val self: ModifyTrafficMirrorFilterNetworkServicesResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterAsScala: Option[TrafficMirrorFilter] = Option(self.trafficMirrorFilter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyTrafficMirrorFilterNetworkServicesResponseOps {

  implicit def toModifyTrafficMirrorFilterNetworkServicesResponseBuilderOps(
      v: ModifyTrafficMirrorFilterNetworkServicesResponse.Builder
  ): ModifyTrafficMirrorFilterNetworkServicesResponseBuilderOps =
    new ModifyTrafficMirrorFilterNetworkServicesResponseBuilderOps(v)

  implicit def toModifyTrafficMirrorFilterNetworkServicesResponseOps(
      v: ModifyTrafficMirrorFilterNetworkServicesResponse
  ): ModifyTrafficMirrorFilterNetworkServicesResponseOps = new ModifyTrafficMirrorFilterNetworkServicesResponseOps(v)

}
