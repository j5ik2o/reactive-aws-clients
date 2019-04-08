// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteFleetSuccessItemBuilderOps(val self: DeleteFleetSuccessItem.Builder) extends AnyVal {

  final def currentFleetStateAsScala(value: Option[FleetStateCode]): DeleteFleetSuccessItem.Builder = {
    value.fold(self) { v =>
      self.currentFleetState(v)
    }
  }

  final def previousFleetStateAsScala(value: Option[FleetStateCode]): DeleteFleetSuccessItem.Builder = {
    value.fold(self) { v =>
      self.previousFleetState(v)
    }
  }

  final def fleetIdAsScala(value: Option[String]): DeleteFleetSuccessItem.Builder = {
    value.fold(self) { v =>
      self.fleetId(v)
    }
  }

}

final class DeleteFleetSuccessItemOps(val self: DeleteFleetSuccessItem) extends AnyVal {

  final def currentFleetStateAsScala: Option[FleetStateCode] = Option(self.currentFleetState)

  final def previousFleetStateAsScala: Option[FleetStateCode] = Option(self.previousFleetState)

  final def fleetIdAsScala: Option[String] = Option(self.fleetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFleetSuccessItemOps {

  implicit def toDeleteFleetSuccessItemBuilderOps(v: DeleteFleetSuccessItem.Builder): DeleteFleetSuccessItemBuilderOps =
    new DeleteFleetSuccessItemBuilderOps(v)

  implicit def toDeleteFleetSuccessItemOps(v: DeleteFleetSuccessItem): DeleteFleetSuccessItemOps =
    new DeleteFleetSuccessItemOps(v)

}
