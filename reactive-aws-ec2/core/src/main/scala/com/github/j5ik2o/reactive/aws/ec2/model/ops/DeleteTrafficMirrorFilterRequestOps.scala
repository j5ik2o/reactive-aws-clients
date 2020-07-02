// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorFilterRequestBuilderOps(val self: DeleteTrafficMirrorFilterRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): DeleteTrafficMirrorFilterRequest.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterId(v) }
  }

}

final class DeleteTrafficMirrorFilterRequestOps(val self: DeleteTrafficMirrorFilterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorFilterRequestOps {

  implicit def toDeleteTrafficMirrorFilterRequestBuilderOps(
      v: DeleteTrafficMirrorFilterRequest.Builder
  ): DeleteTrafficMirrorFilterRequestBuilderOps = new DeleteTrafficMirrorFilterRequestBuilderOps(v)

  implicit def toDeleteTrafficMirrorFilterRequestOps(
      v: DeleteTrafficMirrorFilterRequest
  ): DeleteTrafficMirrorFilterRequestOps = new DeleteTrafficMirrorFilterRequestOps(v)

}
