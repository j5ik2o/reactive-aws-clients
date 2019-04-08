// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesLaunchSpecificationBuilderOps(val self: ScheduledInstancesLaunchSpecification.Builder)
    extends AnyVal {

  final def blockDeviceMappingsAsScala(
      value: Option[Seq[ScheduledInstancesBlockDeviceMapping]]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.blockDeviceMappings(v.asJava)
    }
  }

  final def ebsOptimizedAsScala(value: Option[Boolean]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  final def iamInstanceProfileAsScala(
      value: Option[ScheduledInstancesIamInstanceProfile]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def kernelIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  final def keyNameAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  final def monitoringAsScala(
      value: Option[ScheduledInstancesMonitoring]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def networkInterfacesAsScala(
      value: Option[Seq[ScheduledInstancesNetworkInterface]]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

  final def placementAsScala(
      value: Option[ScheduledInstancesPlacement]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def ramdiskIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def subnetIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def userDataAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class ScheduledInstancesLaunchSpecificationOps(val self: ScheduledInstancesLaunchSpecification) extends AnyVal {

  final def blockDeviceMappingsAsScala: Option[Seq[ScheduledInstancesBlockDeviceMapping]] =
    Option(self.blockDeviceMappings).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  final def iamInstanceProfileAsScala: Option[ScheduledInstancesIamInstanceProfile] = Option(self.iamInstanceProfile)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  final def keyNameAsScala: Option[String] = Option(self.keyName)

  final def monitoringAsScala: Option[ScheduledInstancesMonitoring] = Option(self.monitoring)

  final def networkInterfacesAsScala: Option[Seq[ScheduledInstancesNetworkInterface]] =
    Option(self.networkInterfaces).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def placementAsScala: Option[ScheduledInstancesPlacement] = Option(self.placement)

  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def userDataAsScala: Option[String] = Option(self.userData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstancesLaunchSpecificationOps {

  implicit def toScheduledInstancesLaunchSpecificationBuilderOps(
      v: ScheduledInstancesLaunchSpecification.Builder
  ): ScheduledInstancesLaunchSpecificationBuilderOps = new ScheduledInstancesLaunchSpecificationBuilderOps(v)

  implicit def toScheduledInstancesLaunchSpecificationOps(
      v: ScheduledInstancesLaunchSpecification
  ): ScheduledInstancesLaunchSpecificationOps = new ScheduledInstancesLaunchSpecificationOps(v)

}
