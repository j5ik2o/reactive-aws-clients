// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PlatformDeviceBuilderOps(val self: PlatformDevice.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): PlatformDevice.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def typeAsScala(value: Option[PlatformDeviceType]): PlatformDevice.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class PlatformDeviceOps(val self: PlatformDevice) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def typeAsScala: Option[PlatformDeviceType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPlatformDeviceOps {

  implicit def toPlatformDeviceBuilderOps(v: PlatformDevice.Builder): PlatformDeviceBuilderOps =
    new PlatformDeviceBuilderOps(v)

  implicit def toPlatformDeviceOps(v: PlatformDevice): PlatformDeviceOps = new PlatformDeviceOps(v)

}
