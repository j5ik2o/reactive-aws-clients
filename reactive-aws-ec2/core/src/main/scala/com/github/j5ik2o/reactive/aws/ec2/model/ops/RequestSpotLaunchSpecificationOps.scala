// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotLaunchSpecificationBuilderOps(val self: RequestSpotLaunchSpecification.Builder) extends AnyVal {

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): RequestSpotLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[String]]): RequestSpotLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def addressingTypeAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.addressingType(v)
    }
  }

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[BlockDeviceMapping]]
  ): RequestSpotLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(
      value: Option[IamInstanceProfileSpecification]
  ): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): RequestSpotLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def placementAsScala(value: Option[SpotPlacement]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def userDataAsScala(value: Option[String]): RequestSpotLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class RequestSpotLaunchSpecificationOps(val self: RequestSpotLaunchSpecification) extends AnyVal {

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupsAsScala: Option[Seq[String]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def addressingTypeAsScala: Option[String] = Option(self.addressingType)

  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] = Option(self.blockDeviceMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[IamInstanceProfileSpecification] = Option(self.iamInstanceProfile)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring)

  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def placementAsScala: Option[SpotPlacement] = Option(self.placement)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def userDataAsScala: Option[String] = Option(self.userData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotLaunchSpecificationOps {

  implicit def toRequestSpotLaunchSpecificationBuilderOps(
      v: RequestSpotLaunchSpecification.Builder
  ): RequestSpotLaunchSpecificationBuilderOps = new RequestSpotLaunchSpecificationBuilderOps(v)

  implicit def toRequestSpotLaunchSpecificationOps(
      v: RequestSpotLaunchSpecification
  ): RequestSpotLaunchSpecificationOps = new RequestSpotLaunchSpecificationOps(v)

}
