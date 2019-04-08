// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchSpecificationBuilderOps(val self: LaunchSpecification.Builder) extends AnyVal {

  final def userDataAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[GroupIdentifier]]): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def addressingTypeAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.addressingType(v)
    }
  }

  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfileSpecification]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def placementAsScala(value: Option[SpotPlacement]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): LaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

}

final class LaunchSpecificationOps(val self: LaunchSpecification) extends AnyVal {

  final def userDataAsScala: Option[String] = Option(self.userData)

  final def securityGroupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.securityGroups).map { v =>
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

  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def placementAsScala: Option[SpotPlacement] = Option(self.placement)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchSpecificationOps {

  implicit def toLaunchSpecificationBuilderOps(v: LaunchSpecification.Builder): LaunchSpecificationBuilderOps =
    new LaunchSpecificationBuilderOps(v)

  implicit def toLaunchSpecificationOps(v: LaunchSpecification): LaunchSpecificationOps = new LaunchSpecificationOps(v)

}
