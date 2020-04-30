// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SearchTransitGatewayMulticastGroupsResponseBuilderOps(val self: SearchTransitGatewayMulticastGroupsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def multicastGroupsAsScala(value: Option[Seq[TransitGatewayMulticastGroup]]): SearchTransitGatewayMulticastGroupsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.multicastGroups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): SearchTransitGatewayMulticastGroupsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class SearchTransitGatewayMulticastGroupsResponseOps(val self: SearchTransitGatewayMulticastGroupsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def multicastGroupsAsScala: Option[Seq[TransitGatewayMulticastGroup]] = Option(self.multicastGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchTransitGatewayMulticastGroupsResponseOps {

implicit def toSearchTransitGatewayMulticastGroupsResponseBuilderOps(v: SearchTransitGatewayMulticastGroupsResponse.Builder): SearchTransitGatewayMulticastGroupsResponseBuilderOps = new SearchTransitGatewayMulticastGroupsResponseBuilderOps(v)

implicit def toSearchTransitGatewayMulticastGroupsResponseOps(v: SearchTransitGatewayMulticastGroupsResponse): SearchTransitGatewayMulticastGroupsResponseOps = new SearchTransitGatewayMulticastGroupsResponseOps(v)

}

