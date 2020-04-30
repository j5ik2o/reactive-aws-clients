// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotLaunchSpecificationBuilderOps(val self: RequestSpotLaunchSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def securityGroupIdsAsScala(value: Option[Seq[String]]): RequestSpotLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def securityGroupsAsScala(value: Option[Seq[String]]): RequestSpotLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def addressingTypeAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.addressingType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): RequestSpotLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala(value: Option[Boolean]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.ebsOptimized(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala(value: Option[IamInstanceProfileSpecification]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.iamInstanceProfile(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[InstanceType]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.kernelId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.keyName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.monitoring(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfacesAsScala(value: Option[Seq[InstanceNetworkInterfaceSpecification]]): RequestSpotLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala(value: Option[SpotPlacement]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.placement(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.ramdiskId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
            value.fold(self){ v => self.userData(v) }
            } 


}

final class RequestSpotLaunchSpecificationOps(val self: RequestSpotLaunchSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def addressingTypeAsScala: Option[String] = Option(self.addressingType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelIdAsScala: Option[String] = Option(self.kernelId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala: Option[String] = Option(self.keyName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] = Option(self.networkInterfaces).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala: Option[SpotPlacement] = Option(self.placement) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala: Option[String] = Option(self.userData) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotLaunchSpecificationOps {

implicit def toRequestSpotLaunchSpecificationBuilderOps(v: RequestSpotLaunchSpecification.Builder): RequestSpotLaunchSpecificationBuilderOps = new RequestSpotLaunchSpecificationBuilderOps(v)

implicit def toRequestSpotLaunchSpecificationOps(v: RequestSpotLaunchSpecification): RequestSpotLaunchSpecificationOps = new RequestSpotLaunchSpecificationOps(v)

}

