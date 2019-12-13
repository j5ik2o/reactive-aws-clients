// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ManagedScalingBuilderOps(val self: ManagedScaling.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ManagedScalingStatus]): ManagedScaling.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala(value: Option[Int]): ManagedScaling.Builder = {
    value.fold(self) { v =>
      self.targetCapacity(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumScalingStepSizeAsScala(value: Option[Int]): ManagedScaling.Builder = {
    value.fold(self) { v =>
      self.minimumScalingStepSize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumScalingStepSizeAsScala(value: Option[Int]): ManagedScaling.Builder = {
    value.fold(self) { v =>
      self.maximumScalingStepSize(v)
    }
  }

}

final class ManagedScalingOps(val self: ManagedScaling) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ManagedScalingStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetCapacityAsScala: Option[Int] = Option(self.targetCapacity)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minimumScalingStepSizeAsScala: Option[Int] = Option(self.minimumScalingStepSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumScalingStepSizeAsScala: Option[Int] = Option(self.maximumScalingStepSize)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToManagedScalingOps {

  implicit def toManagedScalingBuilderOps(v: ManagedScaling.Builder): ManagedScalingBuilderOps =
    new ManagedScalingBuilderOps(v)

  implicit def toManagedScalingOps(v: ManagedScaling): ManagedScalingOps = new ManagedScalingOps(v)

}
