// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstancesLaunchSpecificationBuilderOps(val self: ScheduledInstancesLaunchSpecification.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala(
      value: Option[Seq[ScheduledInstancesBlockDeviceMapping]]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.blockDeviceMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala(value: Option[Boolean]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ebsOptimized(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala(
      value: Option[ScheduledInstancesIamInstanceProfile]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.iamInstanceProfile(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.kernelId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala(
      value: Option[ScheduledInstancesMonitoring]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(
      value: Option[Seq[ScheduledInstancesNetworkInterface]]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala(
      value: Option[ScheduledInstancesPlacement]
  ): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.ramdiskId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): ScheduledInstancesLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userDataAsScala(value: Option[String]): ScheduledInstancesLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class ScheduledInstancesLaunchSpecificationOps(val self: ScheduledInstancesLaunchSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def blockDeviceMappingsAsScala: Option[Seq[ScheduledInstancesBlockDeviceMapping]] =
    Option(self.blockDeviceMappings).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptimizedAsScala: Option[Boolean] = Option(self.ebsOptimized)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAsScala: Option[ScheduledInstancesIamInstanceProfile] = Option(self.iamInstanceProfile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[String] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kernelIdAsScala: Option[String] = Option(self.kernelId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def monitoringAsScala: Option[ScheduledInstancesMonitoring] = Option(self.monitoring)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[ScheduledInstancesNetworkInterface]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def placementAsScala: Option[ScheduledInstancesPlacement] = Option(self.placement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ramdiskIdAsScala: Option[String] = Option(self.ramdiskId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
