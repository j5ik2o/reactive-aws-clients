// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceBuilderOps(val self: Instance.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def amiLaunchIndexAsScala(value: Option[Int]): Instance.Builder = {
            value.fold(self){ v => self.amiLaunchIndex(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[InstanceType]): Instance.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.kernelId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.keyName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTimeAsScala(value: Option[java.time.Instant]): Instance.Builder = {
            value.fold(self){ v => self.launchTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala(value: Option[Monitoring]): Instance.Builder = {
            value.fold(self){ v => self.monitoring(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala(value: Option[Placement]): Instance.Builder = {
            value.fold(self){ v => self.placement(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala(value: Option[PlatformValues]): Instance.Builder = {
            value.fold(self){ v => self.platform(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.privateDnsName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.privateIpAddress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodesAsScala(value: Option[Seq[ProductCode]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicDnsNameAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.publicDnsName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAddressAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.publicIpAddress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.ramdiskId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[InstanceState]): Instance.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateTransitionReasonAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.stateTransitionReason(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def architectureAsScala(value: Option[ArchitectureValues]): Instance.Builder = {
            value.fold(self){ v => self.architecture(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def blockDeviceMappingsAsScala(value: Option[Seq[InstanceBlockDeviceMapping]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala(value: Option[Boolean]): Instance.Builder = {
            value.fold(self){ v => self.ebsOptimized(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enaSupportAsScala(value: Option[Boolean]): Instance.Builder = {
            value.fold(self){ v => self.enaSupport(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hypervisorAsScala(value: Option[HypervisorType]): Instance.Builder = {
            value.fold(self){ v => self.hypervisor(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala(value: Option[IamInstanceProfile]): Instance.Builder = {
            value.fold(self){ v => self.iamInstanceProfile(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceLifecycleAsScala(value: Option[InstanceLifecycleType]): Instance.Builder = {
            value.fold(self){ v => self.instanceLifecycle(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticGpuAssociationsAsScala(value: Option[Seq[ElasticGpuAssociation]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticGpuAssociations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationsAsScala(value: Option[Seq[ElasticInferenceAcceleratorAssociation]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticInferenceAcceleratorAssociations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def networkInterfacesAsScala(value: Option[Seq[InstanceNetworkInterface]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def outpostArnAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.outpostArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rootDeviceNameAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.rootDeviceName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rootDeviceTypeAsScala(value: Option[DeviceType]): Instance.Builder = {
            value.fold(self){ v => self.rootDeviceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def securityGroupsAsScala(value: Option[Seq[GroupIdentifier]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceDestCheckAsScala(value: Option[Boolean]): Instance.Builder = {
            value.fold(self){ v => self.sourceDestCheck(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotInstanceRequestIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.spotInstanceRequestId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sriovNetSupportAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.sriovNetSupport(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateReasonAsScala(value: Option[StateReason]): Instance.Builder = {
            value.fold(self){ v => self.stateReason(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def virtualizationTypeAsScala(value: Option[VirtualizationType]): Instance.Builder = {
            value.fold(self){ v => self.virtualizationType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuOptionsAsScala(value: Option[CpuOptions]): Instance.Builder = {
            value.fold(self){ v => self.cpuOptions(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationIdAsScala(value: Option[String]): Instance.Builder = {
            value.fold(self){ v => self.capacityReservationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationSpecificationAsScala(value: Option[CapacityReservationSpecificationResponse]): Instance.Builder = {
            value.fold(self){ v => self.capacityReservationSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hibernationOptionsAsScala(value: Option[HibernationOptions]): Instance.Builder = {
            value.fold(self){ v => self.hibernationOptions(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def licensesAsScala(value: Option[Seq[LicenseConfiguration]]): Instance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.licenses(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def metadataOptionsAsScala(value: Option[InstanceMetadataOptionsResponse]): Instance.Builder = {
            value.fold(self){ v => self.metadataOptions(v) }
            } 


}

final class InstanceOps(val self: Instance) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def amiLaunchIndexAsScala: Option[Int] = Option(self.amiLaunchIndex) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kernelIdAsScala: Option[String] = Option(self.kernelId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala: Option[String] = Option(self.keyName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTimeAsScala: Option[java.time.Instant] = Option(self.launchTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala: Option[Monitoring] = Option(self.monitoring) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala: Option[Placement] = Option(self.placement) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala: Option[PlatformValues] = Option(self.platform) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicDnsNameAsScala: Option[String] = Option(self.publicDnsName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAddressAsScala: Option[String] = Option(self.publicIpAddress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[InstanceState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMapping]] = Option(self.blockDeviceMappings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hypervisorAsScala: Option[HypervisorType] = Option(self.hypervisor) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def iamInstanceProfileAsScala: Option[IamInstanceProfile] = Option(self.iamInstanceProfile) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceLifecycleAsScala: Option[InstanceLifecycleType] = Option(self.instanceLifecycle) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def elasticGpuAssociationsAsScala: Option[Seq[ElasticGpuAssociation]] = Option(self.elasticGpuAssociations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def elasticInferenceAcceleratorAssociationsAsScala: Option[Seq[ElasticInferenceAcceleratorAssociation]] = Option(self.elasticInferenceAcceleratorAssociations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterface]] = Option(self.networkInterfaces).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def outpostArnAsScala: Option[String] = Option(self.outpostArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def rootDeviceTypeAsScala: Option[DeviceType] = Option(self.rootDeviceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def securityGroupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.securityGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateReasonAsScala: Option[StateReason] = Option(self.stateReason) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def virtualizationTypeAsScala: Option[VirtualizationType] = Option(self.virtualizationType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def cpuOptionsAsScala: Option[CpuOptions] = Option(self.cpuOptions) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityReservationSpecificationAsScala: Option[CapacityReservationSpecificationResponse] = Option(self.capacityReservationSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def hibernationOptionsAsScala: Option[HibernationOptions] = Option(self.hibernationOptions) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def licensesAsScala: Option[Seq[LicenseConfiguration]] = Option(self.licenses).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def metadataOptionsAsScala: Option[InstanceMetadataOptionsResponse] = Option(self.metadataOptions) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceOps {

implicit def toInstanceBuilderOps(v: Instance.Builder): InstanceBuilderOps = new InstanceBuilderOps(v)

implicit def toInstanceOps(v: Instance): InstanceOps = new InstanceOps(v)

}

