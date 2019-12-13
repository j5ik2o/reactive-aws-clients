// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GpuDeviceInfoBuilderOps(val self: GpuDeviceInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): GpuDeviceInfo.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala(value: Option[String]): GpuDeviceInfo.Builder = {
    value.fold(self) { v =>
      self.manufacturer(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala(value: Option[Int]): GpuDeviceInfo.Builder = {
    value.fold(self) { v =>
      self.count(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala(value: Option[GpuDeviceMemoryInfo]): GpuDeviceInfo.Builder = {
    value.fold(self) { v =>
      self.memoryInfo(v)
    }
  }

}

final class GpuDeviceInfoOps(val self: GpuDeviceInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def manufacturerAsScala: Option[String] = Option(self.manufacturer)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def countAsScala: Option[Int] = Option(self.count)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryInfoAsScala: Option[GpuDeviceMemoryInfo] = Option(self.memoryInfo)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGpuDeviceInfoOps {

  implicit def toGpuDeviceInfoBuilderOps(v: GpuDeviceInfo.Builder): GpuDeviceInfoBuilderOps =
    new GpuDeviceInfoBuilderOps(v)

  implicit def toGpuDeviceInfoOps(v: GpuDeviceInfo): GpuDeviceInfoOps = new GpuDeviceInfoOps(v)

}
