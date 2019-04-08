// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CpuOptionsRequestBuilderOps(val self: CpuOptionsRequest.Builder) extends AnyVal {

  final def coreCountAsScala(value: Option[Int]): CpuOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.coreCount(v)
    }
  }

  final def threadsPerCoreAsScala(value: Option[Int]): CpuOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.threadsPerCore(v)
    }
  }

}

final class CpuOptionsRequestOps(val self: CpuOptionsRequest) extends AnyVal {

  final def coreCountAsScala: Option[Int] = Option(self.coreCount)

  final def threadsPerCoreAsScala: Option[Int] = Option(self.threadsPerCore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCpuOptionsRequestOps {

  implicit def toCpuOptionsRequestBuilderOps(v: CpuOptionsRequest.Builder): CpuOptionsRequestBuilderOps =
    new CpuOptionsRequestBuilderOps(v)

  implicit def toCpuOptionsRequestOps(v: CpuOptionsRequest): CpuOptionsRequestOps = new CpuOptionsRequestOps(v)

}
