// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerDefinitionBuilderOps(val self: ContainerDefinition.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def imageAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def repositoryCredentialsAsScala(value: Option[RepositoryCredentials]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.repositoryCredentials(v)
    }
  }

  final def cpuAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.cpu(v)
    }
  }

  final def memoryAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def memoryReservationAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.memoryReservation(v)
    }
  }

  final def linksAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.links(v.asJava)
    }
  }

  final def portMappingsAsScala(value: Option[Seq[PortMapping]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.portMappings(v.asJava)
    }
  }

  final def essentialAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.essential(v)
    }
  }

  final def entryPointAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.entryPoint(v.asJava)
    }
  }

  final def commandAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    }
  }

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    }
  }

  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountPoints(v.asJava)
    }
  }

  final def volumesFromAsScala(value: Option[Seq[VolumeFrom]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumesFrom(v.asJava)
    }
  }

  final def linuxParametersAsScala(value: Option[LinuxParameters]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.linuxParameters(v)
    }
  }

  final def secretsAsScala(value: Option[Seq[Secret]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.secrets(v.asJava)
    }
  }

  final def hostnameAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.hostname(v)
    }
  }

  final def userAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  final def workingDirectoryAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.workingDirectory(v)
    }
  }

  final def disableNetworkingAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.disableNetworking(v)
    }
  }

  final def privilegedAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  }

  final def dnsServersAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dnsServers(v.asJava)
    }
  }

  final def dnsSearchDomainsAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dnsSearchDomains(v.asJava)
    }
  }

  final def extraHostsAsScala(value: Option[Seq[HostEntry]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.extraHosts(v.asJava)
    }
  }

  final def dockerSecurityOptionsAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dockerSecurityOptions(v.asJava)
    }
  }

  final def interactiveAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.interactive(v)
    }
  }

  final def pseudoTerminalAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.pseudoTerminal(v)
    }
  }

  final def dockerLabelsAsScala(value: Option[Map[String, String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dockerLabels(v.asJava)
    }
  }

  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ulimits(v.asJava)
    }
  }

  final def logConfigurationAsScala(value: Option[LogConfiguration]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.logConfiguration(v)
    }
  }

  final def healthCheckAsScala(value: Option[HealthCheck]): ContainerDefinition.Builder = {
    value.fold(self) { v =>
      self.healthCheck(v)
    }
  }

  final def systemControlsAsScala(value: Option[Seq[SystemControl]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.systemControls(v.asJava)
    }
  }

  final def resourceRequirementsAsScala(value: Option[Seq[ResourceRequirement]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceRequirements(v.asJava)
    }
  }

}

final class ContainerDefinitionOps(val self: ContainerDefinition) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def imageAsScala: Option[String] = Option(self.image)

  final def repositoryCredentialsAsScala: Option[RepositoryCredentials] = Option(self.repositoryCredentials)

  final def cpuAsScala: Option[Int] = Option(self.cpu)

  final def memoryAsScala: Option[Int] = Option(self.memory)

  final def memoryReservationAsScala: Option[Int] = Option(self.memoryReservation)

  final def linksAsScala: Option[Seq[String]] = Option(self.links).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def portMappingsAsScala: Option[Seq[PortMapping]] = Option(self.portMappings).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def essentialAsScala: Option[Boolean] = Option(self.essential)

  final def entryPointAsScala: Option[Seq[String]] = Option(self.entryPoint).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def mountPointsAsScala: Option[Seq[MountPoint]] = Option(self.mountPoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def volumesFromAsScala: Option[Seq[VolumeFrom]] = Option(self.volumesFrom).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def linuxParametersAsScala: Option[LinuxParameters] = Option(self.linuxParameters)

  final def secretsAsScala: Option[Seq[Secret]] = Option(self.secrets).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hostnameAsScala: Option[String] = Option(self.hostname)

  final def userAsScala: Option[String] = Option(self.user)

  final def workingDirectoryAsScala: Option[String] = Option(self.workingDirectory)

  final def disableNetworkingAsScala: Option[Boolean] = Option(self.disableNetworking)

  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem)

  final def dnsServersAsScala: Option[Seq[String]] = Option(self.dnsServers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def dnsSearchDomainsAsScala: Option[Seq[String]] = Option(self.dnsSearchDomains).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def extraHostsAsScala: Option[Seq[HostEntry]] = Option(self.extraHosts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def dockerSecurityOptionsAsScala: Option[Seq[String]] = Option(self.dockerSecurityOptions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def interactiveAsScala: Option[Boolean] = Option(self.interactive)

  final def pseudoTerminalAsScala: Option[Boolean] = Option(self.pseudoTerminal)

  final def dockerLabelsAsScala: Option[Map[String, String]] = Option(self.dockerLabels).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def logConfigurationAsScala: Option[LogConfiguration] = Option(self.logConfiguration)

  final def healthCheckAsScala: Option[HealthCheck] = Option(self.healthCheck)

  final def systemControlsAsScala: Option[Seq[SystemControl]] = Option(self.systemControls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def resourceRequirementsAsScala: Option[Seq[ResourceRequirement]] = Option(self.resourceRequirements).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDefinitionOps {

  implicit def toContainerDefinitionBuilderOps(v: ContainerDefinition.Builder): ContainerDefinitionBuilderOps =
    new ContainerDefinitionBuilderOps(v)

  implicit def toContainerDefinitionOps(v: ContainerDefinition): ContainerDefinitionOps = new ContainerDefinitionOps(v)

}
