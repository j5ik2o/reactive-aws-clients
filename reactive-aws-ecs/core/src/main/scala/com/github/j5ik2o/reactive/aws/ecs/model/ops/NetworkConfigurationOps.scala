// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class NetworkConfigurationBuilderOps(val self: NetworkConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsvpcConfigurationAsScala(value: Option[AwsVpcConfiguration]): NetworkConfiguration.Builder = {
    value.fold(self) { v => self.awsvpcConfiguration(v) }
  }

}

final class NetworkConfigurationOps(val self: NetworkConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsvpcConfigurationAsScala: Option[AwsVpcConfiguration] = Option(self.awsvpcConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkConfigurationOps {

  implicit def toNetworkConfigurationBuilderOps(v: NetworkConfiguration.Builder): NetworkConfigurationBuilderOps =
    new NetworkConfigurationBuilderOps(v)

  implicit def toNetworkConfigurationOps(v: NetworkConfiguration): NetworkConfigurationOps =
    new NetworkConfigurationOps(v)

}
