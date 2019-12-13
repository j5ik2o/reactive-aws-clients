// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GpuDeviceMemoryInfoBuilderOps(val self: GpuDeviceMemoryInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeInMiBAsScala(value: Option[Int]): GpuDeviceMemoryInfo.Builder = {
    value.fold(self) { v =>
      self.sizeInMiB(v)
    }
  }

}

final class GpuDeviceMemoryInfoOps(val self: GpuDeviceMemoryInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeInMiBAsScala: Option[Int] = Option(self.sizeInMiB)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGpuDeviceMemoryInfoOps {

  implicit def toGpuDeviceMemoryInfoBuilderOps(v: GpuDeviceMemoryInfo.Builder): GpuDeviceMemoryInfoBuilderOps =
    new GpuDeviceMemoryInfoBuilderOps(v)

  implicit def toGpuDeviceMemoryInfoOps(v: GpuDeviceMemoryInfo): GpuDeviceMemoryInfoOps = new GpuDeviceMemoryInfoOps(v)

}
