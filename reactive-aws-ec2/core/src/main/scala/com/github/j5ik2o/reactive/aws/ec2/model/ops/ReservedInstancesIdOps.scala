// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReservedInstancesIdBuilderOps(val self: ReservedInstancesId.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala(value: Option[String]): ReservedInstancesId.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesId(v)
    }
  }

}

final class ReservedInstancesIdOps(val self: ReservedInstancesId) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reservedInstancesIdAsScala: Option[String] = Option(self.reservedInstancesId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReservedInstancesIdOps {

  implicit def toReservedInstancesIdBuilderOps(v: ReservedInstancesId.Builder): ReservedInstancesIdBuilderOps =
    new ReservedInstancesIdBuilderOps(v)

  implicit def toReservedInstancesIdOps(v: ReservedInstancesId): ReservedInstancesIdOps = new ReservedInstancesIdOps(v)

}
