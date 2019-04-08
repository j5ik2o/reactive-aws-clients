// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RunInstancesRequestBuilderOps(val self: RunInstancesRequest.Builder) extends AnyVal {

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def imageIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def ipv6AddressCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  final def ipv6AddressesAsScala(value: Option[Seq[InstanceIpv6Address]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6Addresses(v.asJava)
    }
  }

  final def kernelIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def maxCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxCount(v)
    }
  }

  final def minCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.minCount(v)
    }
  }

  final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def placementAsScala(value: Option[Placement]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def subnetIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def userDataAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def additionalInfoAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.additionalInfo(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def disableApiTerminationAsScala(value: Option[Boolean]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfileSpecification]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(value: Option[ShutdownBehavior]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def elasticGpuSpecificationAsScala(value: Option[Seq[ElasticGpuSpecification]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuSpecification(v.asJava)
    }
  }

  final def elasticInferenceAcceleratorsAsScala(
      value: Option[Seq[ElasticInferenceAccelerator]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticInferenceAccelerators(v.asJava)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

  final def launchTemplateAsScala(value: Option[LaunchTemplateSpecification]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

  final def instanceMarketOptionsAsScala(value: Option[InstanceMarketOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceMarketOptions(v)
    }
  }

  final def creditSpecificationAsScala(value: Option[CreditSpecificationRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.creditSpecification(v)
    }
  }

  final def cpuOptionsAsScala(value: Option[CpuOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.cpuOptions(v)
    }
  }

  final def capacityReservationSpecificationAsScala(
      value: Option[CapacityReservationSpecification]
  ): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

  final def hibernationOptionsAsScala(value: Option[HibernationOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.hibernationOptions(v)
    }
  }

  final def licenseSpecificationsAsScala(
      value: Option[Seq[LicenseConfigurationRequest]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class RunInstancesRequestOps(val self: RunInstancesRequest) extends AnyVal {

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def maxCountAsScala: Option[Int] = Option(self.maxCount)

  final def minCountAsScala: Option[Int] = Option(self.minCount)

  final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring)

  final def placementAsScala: Option[Placement] = Option(self.placement)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def userDataAsScala: Option[String] = Option(self.userData)

  final def additionalInfoAsScala: Option[String] = Option(self.additionalInfo)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def disableApiTerminationAsScala: Option[Boolean] = Option(self.disableApiTermination)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def elasticGpuSpecificationAsScala: Option[Seq[ElasticGpuSpecification]] =
    Option(self.elasticGpuSpecification).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def elasticInferenceAcceleratorsAsScala: Option[Seq[ElasticInferenceAccelerator]] =
    Option(self.elasticInferenceAccelerators).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def launchTemplateAsScala: Option[LaunchTemplateSpecification] = Option(self.launchTemplate)

  final def instanceMarketOptionsAsScala: Option[InstanceMarketOptionsRequest] = Option(self.instanceMarketOptions)

  final def creditSpecificationAsScala: Option[CreditSpecificationRequest] = Option(self.creditSpecification)

  final def cpuOptionsAsScala: Option[CpuOptionsRequest] = Option(self.cpuOptions)

  final def capacityReservationSpecificationAsScala: Option[CapacityReservationSpecification] =
    Option(self.capacityReservationSpecification)

  final def hibernationOptionsAsScala: Option[HibernationOptionsRequest] = Option(self.hibernationOptions)

  final def licenseSpecificationsAsScala: Option[Seq[LicenseConfigurationRequest]] =
    Option(self.licenseSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunInstancesRequestOps {

  implicit def toRunInstancesRequestBuilderOps(v: RunInstancesRequest.Builder): RunInstancesRequestBuilderOps =
    new RunInstancesRequestBuilderOps(v)

  implicit def toRunInstancesRequestOps(v: RunInstancesRequest): RunInstancesRequestOps = new RunInstancesRequestOps(v)

}
