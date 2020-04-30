// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AvailabilityZoneMessageBuilderOps(val self: AvailabilityZoneMessage.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): AvailabilityZoneMessage.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class AvailabilityZoneMessageOps(val self: AvailabilityZoneMessage) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAvailabilityZoneMessageOps {

implicit def toAvailabilityZoneMessageBuilderOps(v: AvailabilityZoneMessage.Builder): AvailabilityZoneMessageBuilderOps = new AvailabilityZoneMessageBuilderOps(v)

implicit def toAvailabilityZoneMessageOps(v: AvailabilityZoneMessage): AvailabilityZoneMessageOps = new AvailabilityZoneMessageOps(v)

}

