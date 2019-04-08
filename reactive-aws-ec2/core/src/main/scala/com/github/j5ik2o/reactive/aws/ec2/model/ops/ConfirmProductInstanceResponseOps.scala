// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ConfirmProductInstanceResponseBuilderOps(val self: ConfirmProductInstanceResponse.Builder) extends AnyVal {

  final def ownerIdAsScala(value: Option[String]): ConfirmProductInstanceResponse.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def returnValueAsScala(value: Option[Boolean]): ConfirmProductInstanceResponse.Builder = {
    value.fold(self) { v =>
      self.returnValue(v)
    }
  }

}

final class ConfirmProductInstanceResponseOps(val self: ConfirmProductInstanceResponse) extends AnyVal {

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def returnValueAsScala: Option[Boolean] = Option(self.returnValue)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConfirmProductInstanceResponseOps {

  implicit def toConfirmProductInstanceResponseBuilderOps(
      v: ConfirmProductInstanceResponse.Builder
  ): ConfirmProductInstanceResponseBuilderOps = new ConfirmProductInstanceResponseBuilderOps(v)

  implicit def toConfirmProductInstanceResponseOps(
      v: ConfirmProductInstanceResponse
  ): ConfirmProductInstanceResponseOps = new ConfirmProductInstanceResponseOps(v)

}
