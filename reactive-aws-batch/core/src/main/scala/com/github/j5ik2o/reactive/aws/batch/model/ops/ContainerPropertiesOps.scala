// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerPropertiesBuilderOps(val self: ContainerProperties.Builder) extends AnyVal {

  final def imageAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  final def vcpusAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  }

  final def memoryAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  final def commandAsScala(value: Option[Seq[String]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    }
  }

  final def jobRoleArnAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.jobRoleArn(v)
    }
  }

  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    }
  }

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    }
  }

  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountPoints(v.asJava)
    }
  }

  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  }

  final def privilegedAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ulimits(v.asJava)
    }
  }

  final def userAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

}

final class ContainerPropertiesOps(val self: ContainerProperties) extends AnyVal {

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

  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def userAsScala: Option[String] = Option(self.user)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerPropertiesOps {

  implicit def toContainerPropertiesBuilderOps(v: ContainerProperties.Builder): ContainerPropertiesBuilderOps =
    new ContainerPropertiesBuilderOps(v)

  implicit def toContainerPropertiesOps(v: ContainerProperties): ContainerPropertiesOps = new ContainerPropertiesOps(v)

}
