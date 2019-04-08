// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerPropertiesBuilderOps(val self: ContainerProperties.Builder) extends AnyVal {

  final def imageAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  } // String

  final def vcpusAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  } // Int

  final def memoryAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  } // Int

  final def commandAsScala(value: Option[Seq[String]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.command(v.asJava)
    } // Seq[String]
  }

  final def jobRoleArnAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.jobRoleArn(v)
    }
  } // String

  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    } // Seq[Volume]
  }

  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.environment(v.asJava)
    } // Seq[KeyValuePair]
  }

  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.mountPoints(v.asJava)
    } // Seq[MountPoint]
  }

  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  } // Boolean

  final def privilegedAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  } // Boolean

  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ulimits(v.asJava)
    } // Seq[Ulimit]
  }

  final def userAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  } // String

  final def instanceTypeAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  } // String

}

final class ContainerPropertiesOps(val self: ContainerProperties) extends AnyVal {

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

  final def privilegedAsScala: Option[Boolean] = Option(self.privileged) // Boolean

  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Ulimit]

  final def userAsScala: Option[String] = Option(self.user) // String

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerPropertiesOps {

  implicit def toContainerPropertiesBuilderOps(v: ContainerProperties.Builder): ContainerPropertiesBuilderOps =
    new ContainerPropertiesBuilderOps(v)

  implicit def toContainerPropertiesOps(v: ContainerProperties): ContainerPropertiesOps = new ContainerPropertiesOps(v)

}
