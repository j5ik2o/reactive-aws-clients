// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TargetCapacitySpecificationBuilderOps(val self: TargetCapacitySpecification.Builder) extends AnyVal {

  final def totalTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecification.Builder = {
    value.fold(self) { v =>
      self.totalTargetCapacity(v)
    }
  }

  final def onDemandTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecification.Builder = {
    value.fold(self) { v =>
      self.onDemandTargetCapacity(v)
    }
  }

  final def spotTargetCapacityAsScala(value: Option[Int]): TargetCapacitySpecification.Builder = {
    value.fold(self) { v =>
      self.spotTargetCapacity(v)
    }
  }

  final def defaultTargetCapacityTypeAsScala(
      value: Option[DefaultTargetCapacityType]
  ): TargetCapacitySpecification.Builder = {
    value.fold(self) { v =>
      self.defaultTargetCapacityType(v)
    }
  }

}

final class TargetCapacitySpecificationOps(val self: TargetCapacitySpecification) extends AnyVal {

  final def totalTargetCapacityAsScala: Option[Int] = Option(self.totalTargetCapacity)

  final def onDemandTargetCapacityAsScala: Option[Int] = Option(self.onDemandTargetCapacity)

  final def spotTargetCapacityAsScala: Option[Int] = Option(self.spotTargetCapacity)

  final def defaultTargetCapacityTypeAsScala: Option[DefaultTargetCapacityType] = Option(self.defaultTargetCapacityType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTargetCapacitySpecificationOps {

  implicit def toTargetCapacitySpecificationBuilderOps(
      v: TargetCapacitySpecification.Builder
  ): TargetCapacitySpecificationBuilderOps = new TargetCapacitySpecificationBuilderOps(v)

  implicit def toTargetCapacitySpecificationOps(v: TargetCapacitySpecification): TargetCapacitySpecificationOps =
    new TargetCapacitySpecificationOps(v)

}
