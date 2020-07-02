// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerDefinitionBuilderOps(val self: ContainerDefinition.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryCredentialsAsScala(value: Option[RepositoryCredentials]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.repositoryCredentials(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.cpu(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.memory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.memoryReservation(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linksAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.links(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portMappingsAsScala(value: Option[Seq[PortMapping]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.portMappings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def essentialAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.essential(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entryPointAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entryPoint(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environment(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.mountPoints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesFromAsScala(value: Option[Seq[VolumeFrom]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumesFrom(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linuxParametersAsScala(value: Option[LinuxParameters]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.linuxParameters(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secretsAsScala(value: Option[Seq[Secret]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.secrets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dependsOnAsScala(value: Option[Seq[ContainerDependency]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dependsOn(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeoutAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.startTimeout(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stopTimeoutAsScala(value: Option[Int]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.stopTimeout(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostnameAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.hostname(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.user(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def workingDirectoryAsScala(value: Option[String]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.workingDirectory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableNetworkingAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.disableNetworking(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.privileged(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.readonlyRootFilesystem(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dnsServers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSearchDomainsAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dnsSearchDomains(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extraHostsAsScala(value: Option[Seq[HostEntry]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.extraHosts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerSecurityOptionsAsScala(value: Option[Seq[String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dockerSecurityOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interactiveAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.interactive(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pseudoTerminalAsScala(value: Option[Boolean]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.pseudoTerminal(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerLabelsAsScala(value: Option[Map[String, String]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dockerLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ulimits(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logConfigurationAsScala(value: Option[LogConfiguration]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.logConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckAsScala(value: Option[HealthCheck]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.healthCheck(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemControlsAsScala(value: Option[Seq[SystemControl]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.systemControls(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala(value: Option[Seq[ResourceRequirement]]): ContainerDefinition.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceRequirements(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firelensConfigurationAsScala(value: Option[FirelensConfiguration]): ContainerDefinition.Builder = {
    value.fold(self) { v => self.firelensConfiguration(v) }
  }

}

final class ContainerDefinitionOps(val self: ContainerDefinition) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[String] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryCredentialsAsScala: Option[RepositoryCredentials] = Option(self.repositoryCredentials)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuAsScala: Option[Int] = Option(self.cpu)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[Int] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryReservationAsScala: Option[Int] = Option(self.memoryReservation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linksAsScala: Option[Seq[String]] =
    Option(self.links).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def portMappingsAsScala: Option[Seq[PortMapping]] =
    Option(self.portMappings).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def essentialAsScala: Option[Boolean] = Option(self.essential)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entryPointAsScala: Option[Seq[String]] =
    Option(self.entryPoint).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] =
    Option(self.command).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Seq[KeyValuePair]] =
    Option(self.environment).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala: Option[Seq[MountPoint]] =
    Option(self.mountPoints).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesFromAsScala: Option[Seq[VolumeFrom]] =
    Option(self.volumesFrom).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linuxParametersAsScala: Option[LinuxParameters] = Option(self.linuxParameters)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def secretsAsScala: Option[Seq[Secret]] =
    Option(self.secrets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dependsOnAsScala: Option[Seq[ContainerDependency]] =
    Option(self.dependsOn).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeoutAsScala: Option[Int] = Option(self.startTimeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stopTimeoutAsScala: Option[Int] = Option(self.stopTimeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostnameAsScala: Option[String] = Option(self.hostname)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala: Option[String] = Option(self.user)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def workingDirectoryAsScala: Option[String] = Option(self.workingDirectory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableNetworkingAsScala: Option[Boolean] = Option(self.disableNetworking)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala: Option[Seq[String]] =
    Option(self.dnsServers).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsSearchDomainsAsScala: Option[Seq[String]] =
    Option(self.dnsSearchDomains).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extraHostsAsScala: Option[Seq[HostEntry]] =
    Option(self.extraHosts).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerSecurityOptionsAsScala: Option[Seq[String]] =
    Option(self.dockerSecurityOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def interactiveAsScala: Option[Boolean] = Option(self.interactive)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pseudoTerminalAsScala: Option[Boolean] = Option(self.pseudoTerminal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dockerLabelsAsScala: Option[Map[String, String]] =
    Option(self.dockerLabels).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala: Option[Seq[Ulimit]] =
    Option(self.ulimits).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logConfigurationAsScala: Option[LogConfiguration] = Option(self.logConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthCheckAsScala: Option[HealthCheck] = Option(self.healthCheck)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def systemControlsAsScala: Option[Seq[SystemControl]] =
    Option(self.systemControls).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala: Option[Seq[ResourceRequirement]] =
    Option(self.resourceRequirements).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def firelensConfigurationAsScala: Option[FirelensConfiguration] = Option(self.firelensConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDefinitionOps {

  implicit def toContainerDefinitionBuilderOps(v: ContainerDefinition.Builder): ContainerDefinitionBuilderOps =
    new ContainerDefinitionBuilderOps(v)

  implicit def toContainerDefinitionOps(v: ContainerDefinition): ContainerDefinitionOps = new ContainerDefinitionOps(v)

}
