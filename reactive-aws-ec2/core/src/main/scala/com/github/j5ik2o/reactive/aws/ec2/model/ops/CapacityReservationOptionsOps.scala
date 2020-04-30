// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CapacityReservationOptionsBuilderOps(val self: CapacityReservationOptions.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usageStrategyAsScala(value: Option[FleetCapacityReservationUsageStrategy]): CapacityReservationOptions.Builder = {
            value.fold(self){ v => self.usageStrategy(v) }
            } 


}

final class CapacityReservationOptionsOps(val self: CapacityReservationOptions) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def usageStrategyAsScala: Option[FleetCapacityReservationUsageStrategy] = Option(self.usageStrategy) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityReservationOptionsOps {

implicit def toCapacityReservationOptionsBuilderOps(v: CapacityReservationOptions.Builder): CapacityReservationOptionsBuilderOps = new CapacityReservationOptionsBuilderOps(v)

implicit def toCapacityReservationOptionsOps(v: CapacityReservationOptions): CapacityReservationOptionsOps = new CapacityReservationOptionsOps(v)

}

