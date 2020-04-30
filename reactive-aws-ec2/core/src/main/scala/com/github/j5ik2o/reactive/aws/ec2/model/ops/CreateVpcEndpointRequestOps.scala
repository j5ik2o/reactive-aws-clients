// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateVpcEndpointRequestBuilderOps(val self: CreateVpcEndpointRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointTypeAsScala(value: Option[VpcEndpointType]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.vpcEndpointType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceNameAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.serviceName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def policyDocumentAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.policyDocument(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def routeTableIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routeTableIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def securityGroupIdsAsScala(value: Option[Seq[String]]): CreateVpcEndpointRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsEnabledAsScala(value: Option[Boolean]): CreateVpcEndpointRequest.Builder = {
            value.fold(self){ v => self.privateDnsEnabled(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateVpcEndpointRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateVpcEndpointRequestOps(val self: CreateVpcEndpointRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointTypeAsScala: Option[VpcEndpointType] = Option(self.vpcEndpointType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceNameAsScala: Option[String] = Option(self.serviceName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def policyDocumentAsScala: Option[String] = Option(self.policyDocument) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def routeTableIdsAsScala: Option[Seq[String]] = Option(self.routeTableIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsEnabledAsScala: Option[Boolean] = Option(self.privateDnsEnabled) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateVpcEndpointRequestOps {

implicit def toCreateVpcEndpointRequestBuilderOps(v: CreateVpcEndpointRequest.Builder): CreateVpcEndpointRequestBuilderOps = new CreateVpcEndpointRequestBuilderOps(v)

implicit def toCreateVpcEndpointRequestOps(v: CreateVpcEndpointRequest): CreateVpcEndpointRequestOps = new CreateVpcEndpointRequestOps(v)

}

