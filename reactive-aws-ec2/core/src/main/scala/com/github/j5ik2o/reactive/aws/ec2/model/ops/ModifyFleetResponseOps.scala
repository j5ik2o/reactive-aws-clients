// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyFleetResponseBuilderOps(val self: ModifyFleetResponse.Builder) extends AnyVal {

  final def returnValueAsScala(value: Option[Boolean]): ModifyFleetResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ModifyFleetResponseOps(val self: ModifyFleetResponse) extends AnyVal {

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyFleetResponseOps {

  implicit def toModifyFleetResponseBuilderOps(v: ModifyFleetResponse.Builder): ModifyFleetResponseBuilderOps =
    new ModifyFleetResponseBuilderOps(v)

  implicit def toModifyFleetResponseOps(v: ModifyFleetResponse): ModifyFleetResponseOps = new ModifyFleetResponseOps(v)

}
