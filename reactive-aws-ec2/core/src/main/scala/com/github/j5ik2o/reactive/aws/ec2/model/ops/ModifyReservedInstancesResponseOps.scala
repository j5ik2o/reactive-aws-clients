// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyReservedInstancesResponseBuilderOps(val self: ModifyReservedInstancesResponse.Builder)
    extends AnyVal {

  final def reservedInstancesModificationIdAsScala(value: Option[String]): ModifyReservedInstancesResponse.Builder = {
    value.fold(self) { v =>
      self.reservedInstancesModificationId(v)
    }
  }

}

final class ModifyReservedInstancesResponseOps(val self: ModifyReservedInstancesResponse) extends AnyVal {

  final def reservedInstancesModificationIdAsScala: Option[String] = Option(self.reservedInstancesModificationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyReservedInstancesResponseOps {

  implicit def toModifyReservedInstancesResponseBuilderOps(
      v: ModifyReservedInstancesResponse.Builder
  ): ModifyReservedInstancesResponseBuilderOps = new ModifyReservedInstancesResponseBuilderOps(v)

  implicit def toModifyReservedInstancesResponseOps(
      v: ModifyReservedInstancesResponse
  ): ModifyReservedInstancesResponseOps = new ModifyReservedInstancesResponseOps(v)

}
