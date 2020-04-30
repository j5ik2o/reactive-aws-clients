// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CancelCapacityReservationResponseBuilderOps(val self: CancelCapacityReservationResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValueAsScala(value: Option[Boolean]): CancelCapacityReservationResponse.Builder = {
            value.fold(self){ v => self.returnValue(v) }
            } 


}

final class CancelCapacityReservationResponseOps(val self: CancelCapacityReservationResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValueAsScala: Option[Boolean] = Option(self.returnValue) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCancelCapacityReservationResponseOps {

implicit def toCancelCapacityReservationResponseBuilderOps(v: CancelCapacityReservationResponse.Builder): CancelCapacityReservationResponseBuilderOps = new CancelCapacityReservationResponseBuilderOps(v)

implicit def toCancelCapacityReservationResponseOps(v: CancelCapacityReservationResponse): CancelCapacityReservationResponseOps = new CancelCapacityReservationResponseOps(v)

}

