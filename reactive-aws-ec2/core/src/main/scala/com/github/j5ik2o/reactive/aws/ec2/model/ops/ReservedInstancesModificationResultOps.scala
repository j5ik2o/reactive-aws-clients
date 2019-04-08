// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesModificationResultBuilderOps(val self: ReservedInstancesModificationResult.Builder)
    extends AnyVal {

  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstancesModificationResult.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

  final def targetConfigurationAsScala(
      value: Option[ReservedInstancesConfiguration]
  ): ReservedInstancesModificationResult.Builder = {
    value.fold(self) { v =>
      self.targetConfiguration(v)
    }
  }

}

final class ReservedInstancesModificationResultOps(val self: ReservedInstancesModificationResult) extends AnyVal {

  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

  final def targetConfigurationAsScala: Option[ReservedInstancesConfiguration] = Option(self.targetConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesModificationResultOps {

  implicit def toReservedInstancesModificationResultBuilderOps(
      v: ReservedInstancesModificationResult.Builder
  ): ReservedInstancesModificationResultBuilderOps = new ReservedInstancesModificationResultBuilderOps(v)

  implicit def toReservedInstancesModificationResultOps(
      v: ReservedInstancesModificationResult
  ): ReservedInstancesModificationResultOps = new ReservedInstancesModificationResultOps(v)

}
