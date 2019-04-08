// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstancePlacementResponseBuilderOps(val self: ModifyInstancePlacementResponse.Builder)
    extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): ModifyInstancePlacementResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyInstancePlacementResponseOps(val self: ModifyInstancePlacementResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstancePlacementResponseOps {

  implicit def toModifyInstancePlacementResponseBuilderOps(
      v: ModifyInstancePlacementResponse.Builder
  ): ModifyInstancePlacementResponseBuilderOps = new ModifyInstancePlacementResponseBuilderOps(v)

  implicit def toModifyInstancePlacementResponseOps(
      v: ModifyInstancePlacementResponse
  ): ModifyInstancePlacementResponseOps = new ModifyInstancePlacementResponseOps(v)

}
