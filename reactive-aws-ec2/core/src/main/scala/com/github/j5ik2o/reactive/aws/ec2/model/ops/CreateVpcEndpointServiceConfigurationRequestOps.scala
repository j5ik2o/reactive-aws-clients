// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointServiceConfigurationRequestBuilderOps(val self: CreateVpcEndpointServiceConfigurationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acceptanceRequiredAsScala(value: Option[Boolean]): CreateVpcEndpointServiceConfigurationRequest.Builder = {
            value.fold(self){ v => self.acceptanceRequired(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala(value: Option[String]): CreateVpcEndpointServiceConfigurationRequest.Builder = {
            value.fold(self){ v => self.privateDnsName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkLoadBalancerArnsAsScala(value: Option[Seq[String]]): CreateVpcEndpointServiceConfigurationRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkLoadBalancerArns(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointServiceConfigurationRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateVpcEndpointServiceConfigurationRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateVpcEndpointServiceConfigurationRequestOps(val self: CreateVpcEndpointServiceConfigurationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.networkLoadBalancerArns).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointServiceConfigurationRequestOps {

implicit def toCreateVpcEndpointServiceConfigurationRequestBuilderOps(v: CreateVpcEndpointServiceConfigurationRequest.Builder): CreateVpcEndpointServiceConfigurationRequestBuilderOps = new CreateVpcEndpointServiceConfigurationRequestBuilderOps(v)

implicit def toCreateVpcEndpointServiceConfigurationRequestOps(v: CreateVpcEndpointServiceConfigurationRequest): CreateVpcEndpointServiceConfigurationRequestOps = new CreateVpcEndpointServiceConfigurationRequestOps(v)

}

