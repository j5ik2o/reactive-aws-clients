// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteTrafficMirrorFilterResponseBuilderOps(val self: DeleteTrafficMirrorFilterResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala(value: Option[String]): DeleteTrafficMirrorFilterResponse.Builder = {
    value.fold(self) { v => self.trafficMirrorFilterId(v) }
  }

}

final class DeleteTrafficMirrorFilterResponseOps(val self: DeleteTrafficMirrorFilterResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trafficMirrorFilterIdAsScala: Option[String] = Option(self.trafficMirrorFilterId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteTrafficMirrorFilterResponseOps {

  implicit def toDeleteTrafficMirrorFilterResponseBuilderOps(
      v: DeleteTrafficMirrorFilterResponse.Builder
  ): DeleteTrafficMirrorFilterResponseBuilderOps = new DeleteTrafficMirrorFilterResponseBuilderOps(v)

  implicit def toDeleteTrafficMirrorFilterResponseOps(
      v: DeleteTrafficMirrorFilterResponse
  ): DeleteTrafficMirrorFilterResponseOps = new DeleteTrafficMirrorFilterResponseOps(v)

}
