// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class LinuxParametersBuilderOps(val self: LinuxParameters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[KernelCapabilities]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.capabilities(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def devicesAsScala(value: Option[Seq[Device]]): LinuxParameters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.devices(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def initProcessEnabledAsScala(value: Option[Boolean]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.initProcessEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sharedMemorySizeAsScala(value: Option[Int]): LinuxParameters.Builder = {
    value.fold(self) { v =>
      self.sharedMemorySize(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tmpfsAsScala(value: Option[Seq[Tmpfs]]): LinuxParameters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tmpfs(v.asJava)
    }
  }

}

final class LinuxParametersOps(val self: LinuxParameters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[KernelCapabilities] = Option(self.capabilities)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def devicesAsScala: Option[Seq[Device]] = Option(self.devices).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def initProcessEnabledAsScala: Option[Boolean] = Option(self.initProcessEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sharedMemorySizeAsScala: Option[Int] = Option(self.sharedMemorySize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tmpfsAsScala: Option[Seq[Tmpfs]] = Option(self.tmpfs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLinuxParametersOps {

  implicit def toLinuxParametersBuilderOps(v: LinuxParameters.Builder): LinuxParametersBuilderOps =
    new LinuxParametersBuilderOps(v)

  implicit def toLinuxParametersOps(v: LinuxParameters): LinuxParametersOps = new LinuxParametersOps(v)

}
