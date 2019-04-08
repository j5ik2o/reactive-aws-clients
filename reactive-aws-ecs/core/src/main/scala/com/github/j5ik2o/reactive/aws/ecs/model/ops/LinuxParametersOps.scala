// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class LinuxParametersBuilderOps(val self: LinuxParameters.Builder) extends AnyVal {

  final def capabilitiesAsScala(value: Option[KernelCapabilities]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.capabilities(v)
    }
  }

  final def devicesAsScala(value: Option[Seq[Device]]): LinuxParameters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.devices(v.asJava)
    }
  }

  final def initProcessEnabledAsScala(value: Option[Boolean]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.initProcessEnabled(v)
    }
  }

  final def sharedMemorySizeAsScala(value: Option[Int]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.sharedMemorySize(v)
    }
  }

  final def tmpfsAsScala(value: Option[Seq[Tmpfs]]): LinuxParameters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tmpfs(v.asJava)
    }
  }

}

final class LinuxParametersOps(val self: LinuxParameters) extends AnyVal {

  final def capabilitiesAsScala: Option[KernelCapabilities] = Option(self.capabilities)

  final def devicesAsScala: Option[Seq[Device]] = Option(self.devices).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def initProcessEnabledAsScala: Option[Boolean] = Option(self.initProcessEnabled)

  final def sharedMemorySizeAsScala: Option[Int] = Option(self.sharedMemorySize)

  final def tmpfsAsScala: Option[Seq[Tmpfs]] = Option(self.tmpfs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLinuxParametersOps {

  implicit def toLinuxParametersBuilderOps(v: LinuxParameters.Builder): LinuxParametersBuilderOps =
    new LinuxParametersBuilderOps(v)

  implicit def toLinuxParametersOps(v: LinuxParameters): LinuxParametersOps = new LinuxParametersOps(v)

}
