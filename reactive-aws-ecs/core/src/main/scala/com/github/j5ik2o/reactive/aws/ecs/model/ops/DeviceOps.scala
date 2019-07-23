// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeviceBuilderOps(val self: Device.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPathAsScala(value: Option[String]): Device.Builder = {
    value.fold(self) { v =>
      self.hostPath(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPathAsScala(value: Option[String]): Device.Builder = {
    value.fold(self) { v =>
      self.containerPath(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionsAsScala(value: Option[Seq[DeviceCgroupPermission]]): Device.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.permissions(v.asJava)
    }
  }

}

final class DeviceOps(val self: Device) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPathAsScala: Option[String] = Option(self.hostPath)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPathAsScala: Option[String] = Option(self.containerPath)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionsAsScala: Option[Seq[DeviceCgroupPermission]] = Option(self.permissions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeviceOps {

  implicit def toDeviceBuilderOps(v: Device.Builder): DeviceBuilderOps = new DeviceBuilderOps(v)

  implicit def toDeviceOps(v: Device): DeviceOps = new DeviceOps(v)

}
