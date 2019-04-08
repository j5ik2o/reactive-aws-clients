// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceLaunchSpecificationBuilderOps(val self: ImportInstanceLaunchSpecification.Builder)
    extends AnyVal {

  final def additionalInfoAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.additionalInfo(v)
    }
  }

  final def architectureAsScala(value: Option[ArchitectureValues]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.architecture(v)
    }
  }

  final def groupIdsAsScala(value: Option[Seq[String]]): ImportInstanceLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupIds(v.asJava)
    }
  }

  final def groupNamesAsScala(value: Option[Seq[String]]): ImportInstanceLaunchSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupNames(v.asJava)
    }
  }

  final def instanceInitiatedShutdownBehaviorAsScala(
      value: Option[ShutdownBehavior]
  ): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceInitiatedShutdownBehavior(v)
    }
  }

  final def instanceTypeAsScala(value: Option[InstanceType]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def monitoringAsScala(value: Option[Boolean]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.monitoring(v)
    }
  }

  final def placementAsScala(value: Option[Placement]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.placement(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def userDataAsScala(value: Option[UserData]): ImportInstanceLaunchSpecification.Builder = {
    value.fold(self) { v =>
      self.userData(v)
    }
  }

}

final class ImportInstanceLaunchSpecificationOps(val self: ImportInstanceLaunchSpecification) extends AnyVal {

  final def additionalInfoAsScala: Option[String] = Option(self.additionalInfo)

  final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture)

  final def groupIdsAsScala: Option[Seq[String]] = Option(self.groupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] =
    Option(self.instanceInitiatedShutdownBehavior)

  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  final def monitoringAsScala: Option[Boolean] = Option(self.monitoring)

  final def placementAsScala: Option[Placement] = Option(self.placement)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def userDataAsScala: Option[UserData] = Option(self.userData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceLaunchSpecificationOps {

  implicit def toImportInstanceLaunchSpecificationBuilderOps(
      v: ImportInstanceLaunchSpecification.Builder
  ): ImportInstanceLaunchSpecificationBuilderOps = new ImportInstanceLaunchSpecificationBuilderOps(v)

  implicit def toImportInstanceLaunchSpecificationOps(
      v: ImportInstanceLaunchSpecification
  ): ImportInstanceLaunchSpecificationOps = new ImportInstanceLaunchSpecificationOps(v)

}
