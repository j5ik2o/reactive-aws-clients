// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchSpecificationBuilderOps(val self: LaunchSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.userData(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala(value: Option[Seq[GroupIdentifier]]): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressingTypeAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.addressingType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(value: Option[Seq[BlockDeviceMapping]]): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[Boolean]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.ebsOptimized(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala(value: Option[IamInstanceProfileSpecification]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.iamInstanceProfile(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.kernelId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.keyName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(
      value: Option[Seq[InstanceNetworkInterfaceSpecification]]
  ): LaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala(value: Option[SpotPlacement]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.placement(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.ramdiskId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala(value: Option[RunInstancesMonitoringEnabled]): LaunchSpecification.Builder = {
    value.fold(self) { v => self.monitoring(v) }
  }

}

final class LaunchSpecificationOps(val self: LaunchSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala: Option[String] = Option(self.userData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala: Option[Seq[GroupIdentifier]] =
    Option(self.securityGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressingTypeAsScala: Option[String] = Option(self.addressingType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[BlockDeviceMapping]] =
    Option(self.blockDeviceMappings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

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
  final def networkInterfacesAsScala: Option[Seq[InstanceNetworkInterfaceSpecification]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala: Option[SpotPlacement] = Option(self.placement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala: Option[RunInstancesMonitoringEnabled] = Option(self.monitoring)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchSpecificationOps {

  implicit def toLaunchSpecificationBuilderOps(v: LaunchSpecification.Builder): LaunchSpecificationBuilderOps =
    new LaunchSpecificationBuilderOps(v)

  implicit def toLaunchSpecificationOps(v: LaunchSpecification): LaunchSpecificationOps = new LaunchSpecificationOps(v)

}
