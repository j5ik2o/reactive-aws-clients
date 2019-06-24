// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RunInstancesRequestBuilderOps(val self: RunInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala(value: Option[Seq[InstanceIpv6Address]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Addresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.maxCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minCountAsScala(value: Option[Int]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.minCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala(value: Option[Placement]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala(value: Option[Seq[String]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalInfoAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.additionalInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala(value: Option[Boolean]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[Boolean]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfileSpecification]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala(value: Option[ShutdownBehavior]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala(value: Option[String]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSpecificationAsScala(value: Option[Seq[ElasticGpuSpecification]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticGpuSpecification(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticInferenceAcceleratorsAsScala(
      value: Option[Seq[ElasticInferenceAccelerator]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticInferenceAccelerators(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala(value: Option[LaunchTemplateSpecification]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMarketOptionsAsScala(value: Option[InstanceMarketOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.instanceMarketOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creditSpecificationAsScala(value: Option[CreditSpecificationRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.creditSpecification(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuOptionsAsScala(value: Option[CpuOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.cpuOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationSpecificationAsScala(
      value: Option[CapacityReservationSpecification]
  ): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationOptionsAsScala(value: Option[HibernationOptionsRequest]): RunInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.hibernationOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala(
      value: Option[Seq[LicenseConfigurationRequest]]
  ): RunInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class RunInstancesRequestOps(val self: RunInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxCountAsScala: Option[Int] = Option(self.maxCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minCountAsScala: Option[Int] = Option(self.minCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala: Option[Placement] = Option(self.placement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala: Option[String] = Option(self.userData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalInfoAsScala: Option[String] = Option(self.additionalInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala: Option[Boolean] = Option(self.disableApiTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSpecificationAsScala: Option[Seq[ElasticGpuSpecification]] =
    Option(self.elasticGpuSpecification).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticInferenceAcceleratorsAsScala: Option[Seq[ElasticInferenceAccelerator]] =
    Option(self.elasticInferenceAccelerators).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTemplateAsScala: Option[LaunchTemplateSpecification] = Option(self.launchTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMarketOptionsAsScala: Option[InstanceMarketOptionsRequest] = Option(self.instanceMarketOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creditSpecificationAsScala: Option[CreditSpecificationRequest] = Option(self.creditSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuOptionsAsScala: Option[CpuOptionsRequest] = Option(self.cpuOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationSpecificationAsScala: Option[CapacityReservationSpecification] =
    Option(self.capacityReservationSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationOptionsAsScala: Option[HibernationOptionsRequest] = Option(self.hibernationOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala: Option[Seq[LicenseConfigurationRequest]] =
    Option(self.licenseSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunInstancesRequestOps {

  implicit def toRunInstancesRequestBuilderOps(v: RunInstancesRequest.Builder): RunInstancesRequestBuilderOps =
    new RunInstancesRequestBuilderOps(v)

  implicit def toRunInstancesRequestOps(v: RunInstancesRequest): RunInstancesRequestOps = new RunInstancesRequestOps(v)

}
