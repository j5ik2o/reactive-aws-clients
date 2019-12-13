// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GpuInfoBuilderOps(val self: GpuInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpusAsScala(value: Option[Seq[GpuDeviceInfo]]): GpuInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.gpus(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalGpuMemoryInMiBAsScala(value: Option[Int]): GpuInfo.Builder = {
    value.fold(self) { v =>
      self.totalGpuMemoryInMiB(v)
    }
  }

}

final class GpuInfoOps(val self: GpuInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gpusAsScala: Option[Seq[GpuDeviceInfo]] = Option(self.gpus).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalGpuMemoryInMiBAsScala: Option[Int] = Option(self.totalGpuMemoryInMiB)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGpuInfoOps {

  implicit def toGpuInfoBuilderOps(v: GpuInfo.Builder): GpuInfoBuilderOps = new GpuInfoBuilderOps(v)

  implicit def toGpuInfoOps(v: GpuInfo): GpuInfoOps = new GpuInfoOps(v)

}
