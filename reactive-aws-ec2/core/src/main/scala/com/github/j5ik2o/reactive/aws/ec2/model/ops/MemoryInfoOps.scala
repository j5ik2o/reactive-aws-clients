// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class MemoryInfoBuilderOps(val self: MemoryInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeInMiBAsScala(value: Option[Long]): MemoryInfo.Builder = {
    value.fold(self) { v =>
      self.sizeInMiB(v)
    }
  }

}

final class MemoryInfoOps(val self: MemoryInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sizeInMiBAsScala: Option[Long] = Option(self.sizeInMiB)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMemoryInfoOps {

  implicit def toMemoryInfoBuilderOps(v: MemoryInfo.Builder): MemoryInfoBuilderOps = new MemoryInfoBuilderOps(v)

  implicit def toMemoryInfoOps(v: MemoryInfo): MemoryInfoOps = new MemoryInfoOps(v)

}
