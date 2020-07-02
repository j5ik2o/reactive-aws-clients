// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestLaunchTemplateDataBuilderOps(val self: RequestLaunchTemplateData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.kernelId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[Boolean]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.ebsOptimized(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala(
      value: Option[LaunchTemplateIamInstanceProfileSpecificationRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.iamInstanceProfile(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(
      value: Option[Seq[LaunchTemplateBlockDeviceMappingRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(
      value: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.keyName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala(value: Option[LaunchTemplatesMonitoringRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.monitoring(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala(value: Option[LaunchTemplatePlacementRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.placement(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramDiskIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.ramDiskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala(value: Option[Boolean]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.disableApiTermination(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[ShutdownBehavior]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.instanceInitiatedShutdownBehavior(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.userData(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateTagSpecificationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSpecificationsAsScala(
      value: Option[Seq[ElasticGpuSpecification]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticGpuSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticInferenceAcceleratorsAsScala(
      value: Option[Seq[LaunchTemplateElasticInferenceAccelerator]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.elasticInferenceAccelerators(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala(value: Option[Seq[String]]): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMarketOptionsAsScala(
      value: Option[LaunchTemplateInstanceMarketOptionsRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.instanceMarketOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creditSpecificationAsScala(value: Option[CreditSpecificationRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.creditSpecification(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuOptionsAsScala(value: Option[LaunchTemplateCpuOptionsRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.cpuOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationSpecificationAsScala(
      value: Option[LaunchTemplateCapacityReservationSpecificationRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.capacityReservationSpecification(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateLicenseConfigurationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.licenseSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationOptionsAsScala(
      value: Option[LaunchTemplateHibernationOptionsRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.hibernationOptions(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataOptionsAsScala(
      value: Option[LaunchTemplateInstanceMetadataOptionsRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v => self.metadataOptions(v) }
  }

}

final class RequestLaunchTemplateDataOps(val self: RequestLaunchTemplateData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala: Option[LaunchTemplateIamInstanceProfileSpecificationRequest] =
    Option(self.iamInstanceProfile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[LaunchTemplateBlockDeviceMappingRequest]] =
    Option(self.blockDeviceMappings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala: Option[LaunchTemplatesMonitoringRequest] = Option(self.monitoring)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala: Option[LaunchTemplatePlacementRequest] = Option(self.placement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramDiskIdAsScala: Option[String] = Option(self.ramDiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableApiTerminationAsScala: Option[Boolean] = Option(self.disableApiTermination)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala: Option[String] = Option(self.userData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[LaunchTemplateTagSpecificationRequest]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticGpuSpecificationsAsScala: Option[Seq[ElasticGpuSpecification]] =
    Option(self.elasticGpuSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticInferenceAcceleratorsAsScala: Option[Seq[LaunchTemplateElasticInferenceAccelerator]] =
    Option(self.elasticInferenceAccelerators).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] =
    Option(self.securityGroupIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala: Option[Seq[String]] =
    Option(self.securityGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceMarketOptionsAsScala: Option[LaunchTemplateInstanceMarketOptionsRequest] =
    Option(self.instanceMarketOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creditSpecificationAsScala: Option[CreditSpecificationRequest] = Option(self.creditSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuOptionsAsScala: Option[LaunchTemplateCpuOptionsRequest] = Option(self.cpuOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityReservationSpecificationAsScala: Option[LaunchTemplateCapacityReservationSpecificationRequest] =
    Option(self.capacityReservationSpecification)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def licenseSpecificationsAsScala: Option[Seq[LaunchTemplateLicenseConfigurationRequest]] =
    Option(self.licenseSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hibernationOptionsAsScala: Option[LaunchTemplateHibernationOptionsRequest] = Option(self.hibernationOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metadataOptionsAsScala: Option[LaunchTemplateInstanceMetadataOptionsRequest] = Option(self.metadataOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestLaunchTemplateDataOps {

  implicit def toRequestLaunchTemplateDataBuilderOps(
      v: RequestLaunchTemplateData.Builder
  ): RequestLaunchTemplateDataBuilderOps = new RequestLaunchTemplateDataBuilderOps(v)

  implicit def toRequestLaunchTemplateDataOps(v: RequestLaunchTemplateData): RequestLaunchTemplateDataOps =
    new RequestLaunchTemplateDataOps(v)

}
