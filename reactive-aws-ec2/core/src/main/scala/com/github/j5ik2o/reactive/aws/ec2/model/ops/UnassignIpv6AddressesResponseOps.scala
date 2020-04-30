// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnassignIpv6AddressesResponseBuilderOps(val self: UnassignIpv6AddressesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala(value: Option[String]): UnassignIpv6AddressesResponse.Builder = {
            value.fold(self){ v => self.networkInterfaceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unassignedIpv6AddressesAsScala(value: Option[Seq[String]]): UnassignIpv6AddressesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unassignedIpv6Addresses(v.asJava) } 
            }


}

final class UnassignIpv6AddressesResponseOps(val self: UnassignIpv6AddressesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unassignedIpv6AddressesAsScala: Option[Seq[String]] = Option(self.unassignedIpv6Addresses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnassignIpv6AddressesResponseOps {

implicit def toUnassignIpv6AddressesResponseBuilderOps(v: UnassignIpv6AddressesResponse.Builder): UnassignIpv6AddressesResponseBuilderOps = new UnassignIpv6AddressesResponseBuilderOps(v)

implicit def toUnassignIpv6AddressesResponseOps(v: UnassignIpv6AddressesResponse): UnassignIpv6AddressesResponseOps = new UnassignIpv6AddressesResponseOps(v)

}

