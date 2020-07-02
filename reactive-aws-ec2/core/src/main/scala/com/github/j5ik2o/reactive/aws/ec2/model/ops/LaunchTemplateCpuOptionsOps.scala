// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateCpuOptionsBuilderOps(val self: LaunchTemplateCpuOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coreCountAsScala(value: Option[Int]): LaunchTemplateCpuOptions.Builder = {
    value.fold(self) { v => self.coreCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def threadsPerCoreAsScala(value: Option[Int]): LaunchTemplateCpuOptions.Builder = {
    value.fold(self) { v => self.threadsPerCore(v) }
  }

}

final class LaunchTemplateCpuOptionsOps(val self: LaunchTemplateCpuOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coreCountAsScala: Option[Int] = Option(self.coreCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def threadsPerCoreAsScala: Option[Int] = Option(self.threadsPerCore)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateCpuOptionsOps {

  implicit def toLaunchTemplateCpuOptionsBuilderOps(
      v: LaunchTemplateCpuOptions.Builder
  ): LaunchTemplateCpuOptionsBuilderOps = new LaunchTemplateCpuOptionsBuilderOps(v)

  implicit def toLaunchTemplateCpuOptionsOps(v: LaunchTemplateCpuOptions): LaunchTemplateCpuOptionsOps =
    new LaunchTemplateCpuOptionsOps(v)

}
