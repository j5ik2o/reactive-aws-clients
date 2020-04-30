// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnassignIpv6AddressesRequestBuilderOps(val self: UnassignIpv6AddressesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6AddressesAsScala(value: Option[Seq[String]]): UnassignIpv6AddressesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala(value: Option[String]): UnassignIpv6AddressesRequest.Builder = {
            value.fold(self){ v => self.networkInterfaceId(v) }
            } 


}

final class UnassignIpv6AddressesRequestOps(val self: UnassignIpv6AddressesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipv6AddressesAsScala: Option[Seq[String]] = Option(self.ipv6Addresses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnassignIpv6AddressesRequestOps {

implicit def toUnassignIpv6AddressesRequestBuilderOps(v: UnassignIpv6AddressesRequest.Builder): UnassignIpv6AddressesRequestBuilderOps = new UnassignIpv6AddressesRequestBuilderOps(v)

implicit def toUnassignIpv6AddressesRequestOps(v: UnassignIpv6AddressesRequest): UnassignIpv6AddressesRequestOps = new UnassignIpv6AddressesRequestOps(v)

}

