// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CpuOptionsBuilderOps(val self: CpuOptions.Builder) extends AnyVal {

  final def coreCountAsScala(value: Option[Int]): CpuOptions.Builder = {
    value.fold(self) { v =>
      self.coreCount(v)
    }
  }

  final def threadsPerCoreAsScala(value: Option[Int]): CpuOptions.Builder = {
    value.fold(self) { v =>
      self.threadsPerCore(v)
    }
  }

}

final class CpuOptionsOps(val self: CpuOptions) extends AnyVal {

  final def coreCountAsScala: Option[Int] = Option(self.coreCount)

  final def threadsPerCoreAsScala: Option[Int] = Option(self.threadsPerCore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCpuOptionsOps {

  implicit def toCpuOptionsBuilderOps(v: CpuOptions.Builder): CpuOptionsBuilderOps = new CpuOptionsBuilderOps(v)

  implicit def toCpuOptionsOps(v: CpuOptions): CpuOptionsOps = new CpuOptionsOps(v)

}
