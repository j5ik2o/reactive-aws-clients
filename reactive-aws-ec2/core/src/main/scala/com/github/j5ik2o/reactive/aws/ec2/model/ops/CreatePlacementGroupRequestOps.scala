// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreatePlacementGroupRequestBuilderOps(val self: CreatePlacementGroupRequest.Builder) extends AnyVal {

  final def groupNameAsScala(value: Option[String]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def strategyAsScala(value: Option[PlacementStrategy]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v =>
      self.strategy(v)
    }
  }

  final def partitionCountAsScala(value: Option[Int]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v =>
      self.partitionCount(v)
    }
  }

}

final class CreatePlacementGroupRequestOps(val self: CreatePlacementGroupRequest) extends AnyVal {

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def strategyAsScala: Option[PlacementStrategy] = Option(self.strategy)

  final def partitionCountAsScala: Option[Int] = Option(self.partitionCount)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlacementGroupRequestOps {

  implicit def toCreatePlacementGroupRequestBuilderOps(
      v: CreatePlacementGroupRequest.Builder
  ): CreatePlacementGroupRequestBuilderOps = new CreatePlacementGroupRequestBuilderOps(v)

  implicit def toCreatePlacementGroupRequestOps(v: CreatePlacementGroupRequest): CreatePlacementGroupRequestOps =
    new CreatePlacementGroupRequestOps(v)

}
