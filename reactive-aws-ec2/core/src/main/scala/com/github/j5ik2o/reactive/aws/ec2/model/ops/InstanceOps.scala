// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceBuilderOps(val self: Instance.Builder) extends AnyVal {

  final def amiLaunchIndexAsScala(value: Option[Int]): Instance.Builder = {
    value.fold(self) { v =>
      self.amiLaunchIndex(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): Instance.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def launchTimeAsScala(value: Option[java.time.Instant]): Instance.Builder = {
    value.fold(self) { v =>
      self.launchTime(v)
    }
  }

  final def monitoringAsScala(value: Option[Monitoring]): Instance.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def placementAsScala(value: Option[Placement]): Instance.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def platformAsScala(value: Option[PlatformValues]): Instance.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[ProductCode]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def publicDnsNameAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.publicDnsName(v)
    }
  }

  final def publicIpAddressAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.publicIpAddress(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def stateAsScala(value: Option[InstanceState]): Instance.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def stateTransitionReasonAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.stateTransitionReason(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def architectureAsScala(value: Option[ArchitectureValues]): Instance.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def blockDeviceMappingsAsScala(value: Option[Seq[InstanceBlockDeviceMapping]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def clientTokenAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): Instance.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def enaSupportAsScala(value: Option[Boolean]): Instance.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

  final def hypervisorAsScala(value: Option[HypervisorType]): Instance.Builder = {
    value.fold(self) { v =>
      self.hypervisor(v)
    }
  }

  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfile]): Instance.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def instanceLifecycleAsScala(value: Option[InstanceLifecycleType]): Instance.Builder = {
    value.fold(self) { v =>
      self.instanceLifecycle(v)
    }
  }

  final def elasticGpuAssociationsAsScala(value: Option[Seq[ElasticGpuAssociation]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuAssociations(v.asJava)
    }
  }

  final def elasticInferenceAcceleratorAssociationsAsScala(
      value: Option[Seq[ElasticInferenceAcceleratorAssociation]]
  ): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticInferenceAcceleratorAssociations(v.asJava)
    }
  }

  final def networkInterfacesAsScala(value: Option[Seq[InstanceNetworkInterface]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def rootDeviceNameAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.rootDeviceName(v)
    }
  }

  final def rootDeviceTypeAsScala(value: Option[DeviceType]): Instance.Builder = {
    value.fold(self) { v =>
      self.rootDeviceType(v)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[GroupIdentifier]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def sourceDestCheckAsScala(value: Option[Boolean]): Instance.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

  final def spotInstanceRequestIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.spotInstanceRequestId(v)
    }
  }

  final def sriovNetSupportAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.sriovNetSupport(v)
    }
  }

  final def stateReasonAsScala(value: Option[StateReason]): Instance.Builder = {
    value.fold(self) { v =>
      self.stateReason(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def virtualizationTypeAsScala(value: Option[VirtualizationType]): Instance.Builder = {
    value.fold(self) { v =>
      self.virtualizationType(v)
    }
  }

  final def cpuOptionsAsScala(value: Option[CpuOptions]): Instance.Builder = {
    value.fold(self) { v =>
      self.cpuOptions(v)
    }
  }

  final def capacityReservationIdAsScala(value: Option[String]): Instance.Builder = {
    value.fold(self) { v =>
      self.capacityReservationId(v)
    }
  }

  final def capacityReservationSpecificationAsScala(
      value: Option[CapacityReservationSpecificationResponse]
  ): Instance.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

  final def hibernationOptionsAsScala(value: Option[HibernationOptions]): Instance.Builder = {
    value.fold(self) { v =>
      self.hibernationOptions(v)
    }
  }

  final def licensesAsScala(value: Option[Seq[LicenseConfiguration]]): Instance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.licenses(v.asJava)
    }
  }

}

final class InstanceOps(val self: Instance) extends AnyVal {

  final def amiLaunchIndexAsScala: Option[Int] = Option(self.amiLaunchIndex)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def launchTimeAsScala: Option[java.time.Instant] = Option(self.launchTime)

  final def monitoringAsScala: Option[Monitoring] = Option(self.monitoring)

  final def placementAsScala: Option[Placement] = Option(self.placement)

  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def productCodesAsScala: Option[Seq[ProductCode]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def publicDnsNameAsScala: Option[String] = Option(self.publicDnsName)

  final def publicIpAddressAsScala: Option[String] = Option(self.publicIpAddress)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def stateAsScala: Option[InstanceState] = Option(self.state)

  final def stateTransitionReasonAsScala: Option[String] = Option(self.stateTransitionReason)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  final def blockDeviceMappingsAsScala: Option[Seq[InstanceBlockDeviceMapping]] = Option(self.blockDeviceMappings).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def enaSupportAsScala: Option[Boolean] = Option(self.enaSupport)

  final def hypervisorAsScala: Option[HypervisorType] = Option(self.hypervisor)

  final def iamInstanceProfileAsScala: Option[IamInstanceProfile] = Option(self.iamInstanceProfile)

  final def instanceLifecycleAsScala: Option[InstanceLifecycleType] = Option(self.instanceLifecycle)

  final def elasticGpuAssociationsAsScala: Option[Seq[ElasticGpuAssociation]] =
    Option(self.elasticGpuAssociations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def elasticInferenceAcceleratorAssociationsAsScala: Option[Seq[ElasticInferenceAcceleratorAssociation]] =
    Option(self.elasticInferenceAcceleratorAssociations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def rootDeviceNameAsScala: Option[String] = Option(self.rootDeviceName)

  final def rootDeviceTypeAsScala: Option[DeviceType] = Option(self.rootDeviceType)

  final def securityGroupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def sourceDestCheckAsScala: Option[Boolean] = Option(self.sourceDestCheck)

  final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId)

  final def sriovNetSupportAsScala: Option[String] = Option(self.sriovNetSupport)

  final def stateReasonAsScala: Option[StateReason] = Option(self.stateReason)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def virtualizationTypeAsScala: Option[VirtualizationType] = Option(self.virtualizationType)

  final def cpuOptionsAsScala: Option[CpuOptions] = Option(self.cpuOptions)

  final def capacityReservationIdAsScala: Option[String] = Option(self.capacityReservationId)

  final def capacityReservationSpecificationAsScala: Option[CapacityReservationSpecificationResponse] =
    Option(self.capacityReservationSpecification)

  final def hibernationOptionsAsScala: Option[HibernationOptions] = Option(self.hibernationOptions)

  final def licensesAsScala: Option[Seq[LicenseConfiguration]] = Option(self.licenses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceOps {

  implicit def toInstanceBuilderOps(v: Instance.Builder): InstanceBuilderOps = new InstanceBuilderOps(v)

  implicit def toInstanceOps(v: Instance): InstanceOps = new InstanceOps(v)

}
