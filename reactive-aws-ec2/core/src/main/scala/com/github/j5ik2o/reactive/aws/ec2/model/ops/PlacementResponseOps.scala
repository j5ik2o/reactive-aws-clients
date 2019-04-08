// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PlacementResponseBuilderOps(val self: PlacementResponse.Builder) extends AnyVal {

  final def groupNameAsScala(value: Option[String]): PlacementResponse.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

}

final class PlacementResponseOps(val self: PlacementResponse) extends AnyVal {

  final def groupNameAsScala: Option[String] = Option(self.groupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementResponseOps {

  implicit def toPlacementResponseBuilderOps(v: PlacementResponse.Builder): PlacementResponseBuilderOps =
    new PlacementResponseBuilderOps(v)

  implicit def toPlacementResponseOps(v: PlacementResponse): PlacementResponseOps = new PlacementResponseOps(v)

}
