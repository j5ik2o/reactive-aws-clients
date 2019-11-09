// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class LinuxParametersBuilderOps(val self: LinuxParameters.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def devicesAsScala(value: Option[Seq[Device]]): LinuxParameters.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.devices(v.asJava)
    }
  }

}

final class LinuxParametersOps(val self: LinuxParameters) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def devicesAsScala: Option[Seq[Device]] = Option(self.devices).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLinuxParametersOps {

  implicit def toLinuxParametersBuilderOps(v: LinuxParameters.Builder): LinuxParametersBuilderOps =
    new LinuxParametersBuilderOps(v)

  implicit def toLinuxParametersOps(v: LinuxParameters): LinuxParametersOps = new LinuxParametersOps(v)

}
