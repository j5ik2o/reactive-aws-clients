// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ServiceConfigurationBuilderOps(val self: ServiceConfiguration.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceTypeAsScala(value: Option[Seq[ServiceTypeDetail]]): ServiceConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceType(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala(value: Option[String]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.serviceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceNameAsScala(value: Option[String]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.serviceName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceStateAsScala(value: Option[ServiceState]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.serviceState(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def availabilityZonesAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acceptanceRequiredAsScala(value: Option[Boolean]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.acceptanceRequired(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def managesVpcEndpointsAsScala(value: Option[Boolean]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.managesVpcEndpoints(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkLoadBalancerArnsAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkLoadBalancerArns(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def baseEndpointDnsNamesAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.baseEndpointDnsNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala(value: Option[String]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.privateDnsName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameConfigurationAsScala(value: Option[PrivateDnsNameConfiguration]): ServiceConfiguration.Builder = {
            value.fold(self){ v => self.privateDnsNameConfiguration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): ServiceConfiguration.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class ServiceConfigurationOps(val self: ServiceConfiguration) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def serviceTypeAsScala: Option[Seq[ServiceTypeDetail]] = Option(self.serviceType).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala: Option[String] = Option(self.serviceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceNameAsScala: Option[String] = Option(self.serviceName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceStateAsScala: Option[ServiceState] = Option(self.serviceState) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def managesVpcEndpointsAsScala: Option[Boolean] = Option(self.managesVpcEndpoints) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.networkLoadBalancerArns).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def baseEndpointDnsNamesAsScala: Option[Seq[String]] = Option(self.baseEndpointDnsNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameConfigurationAsScala: Option[PrivateDnsNameConfiguration] = Option(self.privateDnsNameConfiguration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceConfigurationOps {

implicit def toServiceConfigurationBuilderOps(v: ServiceConfiguration.Builder): ServiceConfigurationBuilderOps = new ServiceConfigurationBuilderOps(v)

implicit def toServiceConfigurationOps(v: ServiceConfiguration): ServiceConfigurationOps = new ServiceConfigurationOps(v)

}

