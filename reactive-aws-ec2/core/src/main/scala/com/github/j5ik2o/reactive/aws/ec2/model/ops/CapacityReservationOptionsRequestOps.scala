// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationOptionsRequestBuilderOps(val self: CapacityReservationOptionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usageStrategyAsScala(value: Option[FleetCapacityReservationUsageStrategy]): CapacityReservationOptionsRequest.Builder = {
            value.fold(self){ v => self.usageStrategy(v) }
            } 


}

final class CapacityReservationOptionsRequestOps(val self: CapacityReservationOptionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usageStrategyAsScala: Option[FleetCapacityReservationUsageStrategy] = Option(self.usageStrategy) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationOptionsRequestOps {

implicit def toCapacityReservationOptionsRequestBuilderOps(v: CapacityReservationOptionsRequest.Builder): CapacityReservationOptionsRequestBuilderOps = new CapacityReservationOptionsRequestBuilderOps(v)

implicit def toCapacityReservationOptionsRequestOps(v: CapacityReservationOptionsRequest): CapacityReservationOptionsRequestOps = new CapacityReservationOptionsRequestOps(v)

}

