// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceMetadataOptionsResponseBuilderOps(val self: InstanceMetadataOptionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[InstanceMetadataOptionsState]): InstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala(value: Option[HttpTokensState]): InstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.httpTokens(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala(value: Option[Int]): InstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.httpPutResponseHopLimit(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala(
      value: Option[InstanceMetadataEndpointState]
  ): InstanceMetadataOptionsResponse.Builder = {
    value.fold(self) { v => self.httpEndpoint(v) }
  }

}

final class InstanceMetadataOptionsResponseOps(val self: InstanceMetadataOptionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[InstanceMetadataOptionsState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala: Option[HttpTokensState] = Option(self.httpTokens)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala: Option[Int] = Option(self.httpPutResponseHopLimit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala: Option[InstanceMetadataEndpointState] = Option(self.httpEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceMetadataOptionsResponseOps {

  implicit def toInstanceMetadataOptionsResponseBuilderOps(
      v: InstanceMetadataOptionsResponse.Builder
  ): InstanceMetadataOptionsResponseBuilderOps = new InstanceMetadataOptionsResponseBuilderOps(v)

  implicit def toInstanceMetadataOptionsResponseOps(
      v: InstanceMetadataOptionsResponse
  ): InstanceMetadataOptionsResponseOps = new InstanceMetadataOptionsResponseOps(v)

}
