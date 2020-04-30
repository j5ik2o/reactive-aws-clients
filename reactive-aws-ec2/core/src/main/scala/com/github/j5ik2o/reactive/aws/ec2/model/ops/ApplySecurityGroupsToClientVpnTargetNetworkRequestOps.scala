// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(val self: ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala(value: Option[String]): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
            value.fold(self){ v => self.clientVpnEndpointId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def securityGroupIdsAsScala(value: Option[Seq[String]]): ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava) } 
            }


}

final class ApplySecurityGroupsToClientVpnTargetNetworkRequestOps(val self: ApplySecurityGroupsToClientVpnTargetNetworkRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplySecurityGroupsToClientVpnTargetNetworkRequestOps {

implicit def toApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(v: ApplySecurityGroupsToClientVpnTargetNetworkRequest.Builder): ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps = new ApplySecurityGroupsToClientVpnTargetNetworkRequestBuilderOps(v)

implicit def toApplySecurityGroupsToClientVpnTargetNetworkRequestOps(v: ApplySecurityGroupsToClientVpnTargetNetworkRequest): ApplySecurityGroupsToClientVpnTargetNetworkRequestOps = new ApplySecurityGroupsToClientVpnTargetNetworkRequestOps(v)

}

