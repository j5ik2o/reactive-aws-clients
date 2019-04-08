// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerDetailBuilderOps(val self: ContainerDetail.Builder) extends AnyVal {

  final def imageAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  } // String

  final def vcpusAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  } // Int

  final def memoryAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  } // Int

  final def commandAsScala(value: Option[Seq[String]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    } // Seq[String]
  }

  final def jobRoleArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.jobRoleArn(v)
    }
  } // String

  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    } // Seq[Volume]
  }

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    } // Seq[KeyValuePair]
  }

  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountPoints(v.asJava)
    } // Seq[MountPoint]
  }

  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  } // Boolean

  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ulimits(v.asJava)
    } // Seq[Ulimit]
  }

  final def privilegedAsScala(value: Option[Boolean]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  } // Boolean

  final def userAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  } // String

  final def exitCodeAsScala(value: Option[Int]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  } // Int

  final def reasonAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  } // String

  final def containerInstanceArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  } // String

  final def taskArnAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  } // String

  final def logStreamNameAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  } // String

  final def instanceTypeAsScala(value: Option[String]): ContainerDetail.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  } // String

  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): ContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    } // Seq[NetworkInterface]
  }

}

final class ContainerDetailOps(val self: ContainerDetail) extends AnyVal {

  final def imageAsScala: Option[String] = Option(self.image) // String

  final def vcpusAsScala: Option[Int] = Option(self.vcpus) // Int

  final def memoryAsScala: Option[Int] = Option(self.memory) // Int

  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def jobRoleArnAsScala: Option[String] = Option(self.jobRoleArn) // String

  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Volume]

  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[KeyValuePair]

  final def mountPointsAsScala: Option[Seq[MountPoint]] = Option(self.mountPoints).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[MountPoint]

  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem) // Boolean

  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Ulimit]

  final def privilegedAsScala: Option[Boolean] = Option(self.privileged) // Boolean

  final def userAsScala: Option[String] = Option(self.user) // String

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode) // Int

  final def reasonAsScala: Option[String] = Option(self.reason) // String

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn) // String

  final def taskArnAsScala: Option[String] = Option(self.taskArn) // String

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName) // String

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType) // String

  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[NetworkInterface]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerDetailOps {

  implicit def toContainerDetailBuilderOps(v: ContainerDetail.Builder): ContainerDetailBuilderOps =
    new ContainerDetailBuilderOps(v)

  implicit def toContainerDetailOps(v: ContainerDetail): ContainerDetailOps = new ContainerDetailOps(v)

}
