// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateInstanceMetadataOptionsBuilderOps(val self: LaunchTemplateInstanceMetadataOptions.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(
      value: Option[LaunchTemplateInstanceMetadataOptionsState]
  ): LaunchTemplateInstanceMetadataOptions.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala(
      value: Option[LaunchTemplateHttpTokensState]
  ): LaunchTemplateInstanceMetadataOptions.Builder = {
    value.fold(self) { v =>
      self.httpTokens(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala(value: Option[Int]): LaunchTemplateInstanceMetadataOptions.Builder = {
    value.fold(self) { v =>
      self.httpPutResponseHopLimit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala(
      value: Option[LaunchTemplateInstanceMetadataEndpointState]
  ): LaunchTemplateInstanceMetadataOptions.Builder = {
    value.fold(self) { v =>
      self.httpEndpoint(v)
    }
  }

}

final class LaunchTemplateInstanceMetadataOptionsOps(val self: LaunchTemplateInstanceMetadataOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[LaunchTemplateInstanceMetadataOptionsState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala: Option[LaunchTemplateHttpTokensState] = Option(self.httpTokens)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala: Option[Int] = Option(self.httpPutResponseHopLimit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala: Option[LaunchTemplateInstanceMetadataEndpointState] = Option(self.httpEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateInstanceMetadataOptionsOps {

  implicit def toLaunchTemplateInstanceMetadataOptionsBuilderOps(
      v: LaunchTemplateInstanceMetadataOptions.Builder
  ): LaunchTemplateInstanceMetadataOptionsBuilderOps = new LaunchTemplateInstanceMetadataOptionsBuilderOps(v)

  implicit def toLaunchTemplateInstanceMetadataOptionsOps(
      v: LaunchTemplateInstanceMetadataOptions
  ): LaunchTemplateInstanceMetadataOptionsOps = new LaunchTemplateInstanceMetadataOptionsOps(v)

}
