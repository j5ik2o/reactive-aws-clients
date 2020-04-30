// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcEndpointConnectionBuilderOps(val self: VpcEndpointConnection.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala(value: Option[String]): VpcEndpointConnection.Builder = {
            value.fold(self){ v => self.serviceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointIdAsScala(value: Option[String]): VpcEndpointConnection.Builder = {
            value.fold(self){ v => self.vpcEndpointId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointOwnerAsScala(value: Option[String]): VpcEndpointConnection.Builder = {
            value.fold(self){ v => self.vpcEndpointOwner(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointStateAsScala(value: Option[State]): VpcEndpointConnection.Builder = {
            value.fold(self){ v => self.vpcEndpointState(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimestampAsScala(value: Option[java.time.Instant]): VpcEndpointConnection.Builder = {
            value.fold(self){ v => self.creationTimestamp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def dnsEntriesAsScala(value: Option[Seq[DnsEntry]]): VpcEndpointConnection.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dnsEntries(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkLoadBalancerArnsAsScala(value: Option[Seq[String]]): VpcEndpointConnection.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkLoadBalancerArns(v.asJava) } 
            }


}

final class VpcEndpointConnectionOps(val self: VpcEndpointConnection) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala: Option[String] = Option(self.serviceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointOwnerAsScala: Option[String] = Option(self.vpcEndpointOwner) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointStateAsScala: Option[State] = Option(self.vpcEndpointState) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def dnsEntriesAsScala: Option[Seq[DnsEntry]] = Option(self.dnsEntries).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.networkLoadBalancerArns).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcEndpointConnectionOps {

implicit def toVpcEndpointConnectionBuilderOps(v: VpcEndpointConnection.Builder): VpcEndpointConnectionBuilderOps = new VpcEndpointConnectionBuilderOps(v)

implicit def toVpcEndpointConnectionOps(v: VpcEndpointConnection): VpcEndpointConnectionOps = new VpcEndpointConnectionOps(v)

}

