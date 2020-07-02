// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreatePlacementGroupRequestBuilderOps(val self: CreatePlacementGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def strategyAsScala(value: Option[PlacementStrategy]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v => self.strategy(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionCountAsScala(value: Option[Int]): CreatePlacementGroupRequest.Builder = {
    value.fold(self) { v => self.partitionCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreatePlacementGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreatePlacementGroupRequestOps(val self: CreatePlacementGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def strategyAsScala: Option[PlacementStrategy] = Option(self.strategy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def partitionCountAsScala: Option[Int] = Option(self.partitionCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreatePlacementGroupRequestOps {

  implicit def toCreatePlacementGroupRequestBuilderOps(
      v: CreatePlacementGroupRequest.Builder
  ): CreatePlacementGroupRequestBuilderOps = new CreatePlacementGroupRequestBuilderOps(v)

  implicit def toCreatePlacementGroupRequestOps(v: CreatePlacementGroupRequest): CreatePlacementGroupRequestOps =
    new CreatePlacementGroupRequestOps(v)

}
