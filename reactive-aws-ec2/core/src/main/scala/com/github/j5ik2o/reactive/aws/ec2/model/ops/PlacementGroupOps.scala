// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PlacementGroupBuilderOps(val self: PlacementGroup.Builder) extends AnyVal {

  final def groupNameAsScala(value: Option[String]): PlacementGroup.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def stateAsScala(value: Option[PlacementGroupState]): PlacementGroup.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def strategyAsScala(value: Option[PlacementStrategy]): PlacementGroup.Builder = {
    value.fold(self) { v =>
      self.strategy(v)
    }
  }

  final def partitionCountAsScala(value: Option[Int]): PlacementGroup.Builder = {
    value.fold(self) { v =>
      self.partitionCount(v)
    }
  }

}

final class PlacementGroupOps(val self: PlacementGroup) extends AnyVal {

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def stateAsScala: Option[PlacementGroupState] = Option(self.state)

  final def strategyAsScala: Option[PlacementStrategy] = Option(self.strategy)

  final def partitionCountAsScala: Option[Int] = Option(self.partitionCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlacementGroupOps {

  implicit def toPlacementGroupBuilderOps(v: PlacementGroup.Builder): PlacementGroupBuilderOps =
    new PlacementGroupBuilderOps(v)

  implicit def toPlacementGroupOps(v: PlacementGroup): PlacementGroupOps = new PlacementGroupOps(v)

}
