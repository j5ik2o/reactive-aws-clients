// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesIpv6AddressBuilderOps(val self: ScheduledInstancesIpv6Address.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6AddressAsScala(value: Option[String]): ScheduledInstancesIpv6Address.Builder = {
            value.fold(self){ v => self.ipv6Address(v) }
            } 


}

final class ScheduledInstancesIpv6AddressOps(val self: ScheduledInstancesIpv6Address) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6AddressAsScala: Option[String] = Option(self.ipv6Address) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesIpv6AddressOps {

implicit def toScheduledInstancesIpv6AddressBuilderOps(v: ScheduledInstancesIpv6Address.Builder): ScheduledInstancesIpv6AddressBuilderOps = new ScheduledInstancesIpv6AddressBuilderOps(v)

implicit def toScheduledInstancesIpv6AddressOps(v: ScheduledInstancesIpv6Address): ScheduledInstancesIpv6AddressOps = new ScheduledInstancesIpv6AddressOps(v)

}

