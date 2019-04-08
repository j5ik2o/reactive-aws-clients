// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetErrorItemBuilderOps(val self: DeleteFleetErrorItem.Builder) extends AnyVal {

  final def errorAsScala(value: Option[DeleteFleetError]): DeleteFleetErrorItem.Builder = {
    value.fold(self) { v =>
      self.error(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): DeleteFleetErrorItem.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

}

final class DeleteFleetErrorItemOps(val self: DeleteFleetErrorItem) extends AnyVal {

  final def errorAsScala: Option[DeleteFleetError] = Option(self.error)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetErrorItemOps {

  implicit def toDeleteFleetErrorItemBuilderOps(v: DeleteFleetErrorItem.Builder): DeleteFleetErrorItemBuilderOps =
    new DeleteFleetErrorItemBuilderOps(v)

  implicit def toDeleteFleetErrorItemOps(v: DeleteFleetErrorItem): DeleteFleetErrorItemOps =
    new DeleteFleetErrorItemOps(v)

}
