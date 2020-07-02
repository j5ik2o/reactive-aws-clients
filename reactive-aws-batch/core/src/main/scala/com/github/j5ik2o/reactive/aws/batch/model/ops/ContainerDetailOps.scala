// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerDetailBuilderOps(val self: ContainerDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.image(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v => self.vcpus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v => self.memory(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobRoleArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.jobRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environment(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.mountPoints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v => self.readonlyRootFilesystem(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ulimits(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v => self.privileged(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.user(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v => self.exitCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.containerInstanceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.taskArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.logStreamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala(value: Option[Seq[ResourceRequirement]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceRequirements(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linuxParametersAsScala(value: Option[LinuxParameters]): ContainerDetail.Builder = {
    value.fold(self) { v => self.linuxParameters(v) }
  }

}

final class ContainerDetailOps(val self: ContainerDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[String] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala: Option[Int] = Option(self.vcpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[Int] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] =
    Option(self.command).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobRoleArnAsScala: Option[String] = Option(self.jobRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala: Option[Seq[Volume]] =
    Option(self.volumes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Seq[KeyValuePair]] =
    Option(self.environment).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala: Option[Seq[MountPoint]] =
    Option(self.mountPoints).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala: Option[Seq[Ulimit]] =
    Option(self.ulimits).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala: Option[String] = Option(self.user)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceRequirementsAsScala: Option[Seq[ResourceRequirement]] =
    Option(self.resourceRequirements).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def linuxParametersAsScala: Option[LinuxParameters] = Option(self.linuxParameters)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDetailOps {

  implicit def toContainerDetailBuilderOps(v: ContainerDetail.Builder): ContainerDetailBuilderOps =
    new ContainerDetailBuilderOps(v)

  implicit def toContainerDetailOps(v: ContainerDetail): ContainerDetailOps = new ContainerDetailOps(v)

}
