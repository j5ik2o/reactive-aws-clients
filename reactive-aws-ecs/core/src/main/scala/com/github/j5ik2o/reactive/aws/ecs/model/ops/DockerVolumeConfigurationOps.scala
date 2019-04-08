// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DockerVolumeConfigurationBuilderOps(val self: DockerVolumeConfiguration.Builder) extends AnyVal {

  final def scopeAsScala(value: Option[Scope]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

  final def autoprovisionAsScala(value: Option[Boolean]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.autoprovision(v)
    }
  }

  final def driverAsScala(value: Option[String]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.driver(v)
    }
  }

  final def driverOptsAsScala(value: Option[Map[String, String]]): DockerVolumeConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.driverOpts(v.asJava)
    }
  }

  final def labelsAsScala(value: Option[Map[String, String]]): DockerVolumeConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.labels(v.asJava)
    }
  }

}

final class DockerVolumeConfigurationOps(val self: DockerVolumeConfiguration) extends AnyVal {

  final def scopeAsScala: Option[Scope] = Option(self.scope)

  final def autoprovisionAsScala: Option[Boolean] = Option(self.autoprovision)

  final def driverAsScala: Option[String] = Option(self.driver)

  final def driverOptsAsScala: Option[Map[String, String]] = Option(self.driverOpts).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def labelsAsScala: Option[Map[String, String]] = Option(self.labels).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDockerVolumeConfigurationOps {

  implicit def toDockerVolumeConfigurationBuilderOps(
      v: DockerVolumeConfiguration.Builder
  ): DockerVolumeConfigurationBuilderOps = new DockerVolumeConfigurationBuilderOps(v)

  implicit def toDockerVolumeConfigurationOps(v: DockerVolumeConfiguration): DockerVolumeConfigurationOps =
    new DockerVolumeConfigurationOps(v)

}
