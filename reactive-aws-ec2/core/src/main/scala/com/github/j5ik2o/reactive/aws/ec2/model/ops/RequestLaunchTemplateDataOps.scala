// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestLaunchTemplateDataBuilderOps(val self: RequestLaunchTemplateData.Builder) extends AnyVal {

  final def kernelIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(
      value: Option[LaunchTemplateIamInstanceProfileSpecificationRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[LaunchTemplateBlockDeviceMappingRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def imageIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def monitoringAsScala(value: Option[LaunchTemplatesMonitoringRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def placementAsScala(value: Option[LaunchTemplatePlacementRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramDiskIdAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.ramDiskId(v)
    }
  }

  final def disableApiTerminationAsScala(value: Option[Boolean]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[ShutdownBehavior]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def userDataAsScala(value: Option[String]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def tagSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateTagSpecificationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

  final def elasticGpuSpecificationsAsScala(
      value: Option[Seq[ElasticGpuSpecification]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuSpecifications(v.asJava)
    }
  }

  final def elasticInferenceAcceleratorsAsScala(
      value: Option[Seq[LaunchTemplateElasticInferenceAccelerator]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticInferenceAccelerators(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def instanceMarketOptionsAsScala(
      value: Option[LaunchTemplateInstanceMarketOptionsRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceMarketOptions(v)
    }
  }

  final def creditSpecificationAsScala(value: Option[CreditSpecificationRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.creditSpecification(v)
    }
  }

  final def cpuOptionsAsScala(value: Option[LaunchTemplateCpuOptionsRequest]): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.cpuOptions(v)
    }
  }

  final def capacityReservationSpecificationAsScala(
      value: Option[LaunchTemplateCapacityReservationSpecificationRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

  final def hibernationOptionsAsScala(
      value: Option[LaunchTemplateHibernationOptionsRequest]
  ): RequestLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.hibernationOptions(v)
    }
  }

  final def licenseSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateLicenseConfigurationRequest]]
  ): RequestLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class RequestLaunchTemplateDataOps(val self: RequestLaunchTemplateData) extends AnyVal {

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[LaunchTemplateIamInstanceProfileSpecificationRequest] =
    Option(self.iamInstanceProfile)

  final def blockDeviceMappingsAsScala: Option[Seq[LaunchTemplateBlockDeviceMappingRequest]] =
    Option(self.blockDeviceMappings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def networkInterfacesAsScala: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecificationRequest]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def monitoringAsScala: Option[LaunchTemplatesMonitoringRequest] = Option(self.monitoring)

  final def placementAsScala: Option[LaunchTemplatePlacementRequest] = Option(self.placement)

  final def ramDiskIdAsScala: Option[String] = Option(self.ramDiskId)

  final def disableApiTerminationAsScala: Option[Boolean] = Option(self.disableApiTermination)

  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def userDataAsScala: Option[String] = Option(self.userData)

  final def tagSpecificationsAsScala: Option[Seq[LaunchTemplateTagSpecificationRequest]] =
    Option(self.tagSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def elasticGpuSpecificationsAsScala: Option[Seq[ElasticGpuSpecification]] =
    Option(self.elasticGpuSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def elasticInferenceAcceleratorsAsScala: Option[Seq[LaunchTemplateElasticInferenceAccelerator]] =
    Option(self.elasticInferenceAccelerators).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceMarketOptionsAsScala: Option[LaunchTemplateInstanceMarketOptionsRequest] =
    Option(self.instanceMarketOptions)

  final def creditSpecificationAsScala: Option[CreditSpecificationRequest] = Option(self.creditSpecification)

  final def cpuOptionsAsScala: Option[LaunchTemplateCpuOptionsRequest] = Option(self.cpuOptions)

  final def capacityReservationSpecificationAsScala: Option[LaunchTemplateCapacityReservationSpecificationRequest] =
    Option(self.capacityReservationSpecification)

  final def hibernationOptionsAsScala: Option[LaunchTemplateHibernationOptionsRequest] = Option(self.hibernationOptions)

  final def licenseSpecificationsAsScala: Option[Seq[LaunchTemplateLicenseConfigurationRequest]] =
    Option(self.licenseSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestLaunchTemplateDataOps {

  implicit def toRequestLaunchTemplateDataBuilderOps(
      v: RequestLaunchTemplateData.Builder
  ): RequestLaunchTemplateDataBuilderOps = new RequestLaunchTemplateDataBuilderOps(v)

  implicit def toRequestLaunchTemplateDataOps(v: RequestLaunchTemplateData): RequestLaunchTemplateDataOps =
    new RequestLaunchTemplateDataOps(v)

}
