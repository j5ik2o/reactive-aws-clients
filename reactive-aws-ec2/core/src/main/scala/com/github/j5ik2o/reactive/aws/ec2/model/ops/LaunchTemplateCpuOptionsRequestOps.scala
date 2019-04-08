// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateCpuOptionsRequestBuilderOps(val self: LaunchTemplateCpuOptionsRequest.Builder)
    extends AnyVal {

  final def coreCountAsScala(value: Option[Int]): LaunchTemplateCpuOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.coreCount(v)
    }
  }

  final def threadsPerCoreAsScala(value: Option[Int]): LaunchTemplateCpuOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.threadsPerCore(v)
    }
  }

}

final class LaunchTemplateCpuOptionsRequestOps(val self: LaunchTemplateCpuOptionsRequest) extends AnyVal {

  final def coreCountAsScala: Option[Int] = Option(self.coreCount)

  final def threadsPerCoreAsScala: Option[Int] = Option(self.threadsPerCore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateCpuOptionsRequestOps {

  implicit def toLaunchTemplateCpuOptionsRequestBuilderOps(
      v: LaunchTemplateCpuOptionsRequest.Builder
  ): LaunchTemplateCpuOptionsRequestBuilderOps = new LaunchTemplateCpuOptionsRequestBuilderOps(v)

  implicit def toLaunchTemplateCpuOptionsRequestOps(
      v: LaunchTemplateCpuOptionsRequest
  ): LaunchTemplateCpuOptionsRequestOps = new LaunchTemplateCpuOptionsRequestOps(v)

}
