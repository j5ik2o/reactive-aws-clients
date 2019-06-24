// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DockerVolumeConfigurationBuilderOps(val self: DockerVolumeConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala(value: Option[Scope]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.scope(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoprovisionAsScala(value: Option[Boolean]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.autoprovision(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driverAsScala(value: Option[String]): DockerVolumeConfiguration.Builder = {
    value.fold(self) { v =>
      self.driver(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driverOptsAsScala(value: Option[Map[String, String]]): DockerVolumeConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.driverOpts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[Map[String, String]]): DockerVolumeConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.labels(v.asJava)
    }
  }

}

final class DockerVolumeConfigurationOps(val self: DockerVolumeConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala: Option[Scope] = Option(self.scope)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoprovisionAsScala: Option[Boolean] = Option(self.autoprovision)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driverAsScala: Option[String] = Option(self.driver)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driverOptsAsScala: Option[Map[String, String]] = Option(self.driverOpts).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[Map[String, String]] = Option(self.labels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
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
