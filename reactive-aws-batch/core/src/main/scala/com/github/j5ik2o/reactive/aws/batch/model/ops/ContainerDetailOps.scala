// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerDetailBuilderOps(val self: ContainerDetail.Builder) extends AnyVal {

  final def imageAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def vcpusAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  }

  final def memoryAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def commandAsScala(value: Option[Seq[String]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    }
  }

  final def jobRoleArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.jobRoleArn(v)
    }
  }

  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    }
  }

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    }
  }

  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountPoints(v.asJava)
    }
  }

  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  }

  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ulimits(v.asJava)
    }
  }

  final def privilegedAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

  final def userAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  final def exitCodeAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  }

  final def reasonAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def containerInstanceArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  final def taskArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  }

  final def logStreamNameAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

}

final class ContainerDetailOps(val self: ContainerDetail) extends AnyVal {

  final def imageAsScala: Option[String] = Option(self.image)

  final def vcpusAsScala: Option[Int] = Option(self.vcpus)

  final def memoryAsScala: Option[Int] = Option(self.memory)

  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def jobRoleArnAsScala: Option[String] = Option(self.jobRoleArn)

  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def mountPointsAsScala: Option[Seq[MountPoint]] = Option(self.mountPoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem)

  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  final def userAsScala: Option[String] = Option(self.user)

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDetailOps {

  implicit def toContainerDetailBuilderOps(v: ContainerDetail.Builder): ContainerDetailBuilderOps =
    new ContainerDetailBuilderOps(v)

  implicit def toContainerDetailOps(v: ContainerDetail): ContainerDetailOps = new ContainerDetailOps(v)

}
