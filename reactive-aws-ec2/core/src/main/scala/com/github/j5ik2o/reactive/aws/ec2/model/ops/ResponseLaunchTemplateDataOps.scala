// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ResponseLaunchTemplateDataBuilderOps(val self: ResponseLaunchTemplateData.Builder) extends AnyVal {

  final def kernelIdAsScala(value: Option[String]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(
      value: Option[LaunchTemplateIamInstanceProfileSpecification]
  ): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[LaunchTemplateBlockDeviceMapping]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecification]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def imageIdAsScala(value: Option[String]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def monitoringAsScala(value: Option[LaunchTemplatesMonitoring]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def placementAsScala(value: Option[LaunchTemplatePlacement]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramDiskIdAsScala(value: Option[String]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.ramDiskId(v)
    }
  }

  final def disableApiTerminationAsScala(value: Option[Boolean]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.disableApiTermination(v)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[ShutdownBehavior]
  ): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def userDataAsScala(value: Option[String]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def tagSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateTagSpecification]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

  final def elasticGpuSpecificationsAsScala(
      value: Option[Seq[ElasticGpuSpecificationResponse]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticGpuSpecifications(v.asJava)
    }
  }

  final def elasticInferenceAcceleratorsAsScala(
      value: Option[Seq[LaunchTemplateElasticInferenceAcceleratorResponse]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.elasticInferenceAccelerators(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def instanceMarketOptionsAsScala(
      value: Option[LaunchTemplateInstanceMarketOptions]
  ): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.instanceMarketOptions(v)
    }
  }

  final def creditSpecificationAsScala(value: Option[CreditSpecification]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.creditSpecification(v)
    }
  }

  final def cpuOptionsAsScala(value: Option[LaunchTemplateCpuOptions]): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.cpuOptions(v)
    }
  }

  final def capacityReservationSpecificationAsScala(
      value: Option[LaunchTemplateCapacityReservationSpecificationResponse]
  ): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.capacityReservationSpecification(v)
    }
  }

  final def hibernationOptionsAsScala(
      value: Option[LaunchTemplateHibernationOptions]
  ): ResponseLaunchTemplateData.Builder = {
    value.fold(self) { v =>
      self.hibernationOptions(v)
    }
  }

  final def licenseSpecificationsAsScala(
      value: Option[Seq[LaunchTemplateLicenseConfiguration]]
  ): ResponseLaunchTemplateData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.licenseSpecifications(v.asJava)
    }
  }

}

final class ResponseLaunchTemplateDataOps(val self: ResponseLaunchTemplateData) extends AnyVal {

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[LaunchTemplateIamInstanceProfileSpecification] =
    Option(self.iamInstanceProfile)

  final def blockDeviceMappingsAsScala: Option[Seq[LaunchTemplateBlockDeviceMapping]] =
    Option(self.blockDeviceMappings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def networkInterfacesAsScala: Option[Seq[LaunchTemplateInstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def monitoringAsScala: Option[LaunchTemplatesMonitoring] = Option(self.monitoring)

  final def placementAsScala: Option[LaunchTemplatePlacement] = Option(self.placement)

  final def ramDiskIdAsScala: Option[String] = Option(self.ramDiskId)

  final def disableApiTerminationAsScala: Option[Boolean] = Option(self.disableApiTermination)

  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def userDataAsScala: Option[String] = Option(self.userData)

  final def tagSpecificationsAsScala: Option[Seq[LaunchTemplateTagSpecification]] = Option(self.tagSpecifications).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala
  }

  final def elasticGpuSpecificationsAsScala: Option[Seq[ElasticGpuSpecificationResponse]] =
    Option(self.elasticGpuSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def elasticInferenceAcceleratorsAsScala: Option[Seq[LaunchTemplateElasticInferenceAcceleratorResponse]] =
    Option(self.elasticInferenceAccelerators).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceMarketOptionsAsScala: Option[LaunchTemplateInstanceMarketOptions] =
    Option(self.instanceMarketOptions)

  final def creditSpecificationAsScala: Option[CreditSpecification] = Option(self.creditSpecification)

  final def cpuOptionsAsScala: Option[LaunchTemplateCpuOptions] = Option(self.cpuOptions)

  final def capacityReservationSpecificationAsScala: Option[LaunchTemplateCapacityReservationSpecificationResponse] =
    Option(self.capacityReservationSpecification)

  final def hibernationOptionsAsScala: Option[LaunchTemplateHibernationOptions] = Option(self.hibernationOptions)

  final def licenseSpecificationsAsScala: Option[Seq[LaunchTemplateLicenseConfiguration]] =
    Option(self.licenseSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResponseLaunchTemplateDataOps {

  implicit def toResponseLaunchTemplateDataBuilderOps(
      v: ResponseLaunchTemplateData.Builder
  ): ResponseLaunchTemplateDataBuilderOps = new ResponseLaunchTemplateDataBuilderOps(v)

  implicit def toResponseLaunchTemplateDataOps(v: ResponseLaunchTemplateData): ResponseLaunchTemplateDataOps =
    new ResponseLaunchTemplateDataOps(v)

}
