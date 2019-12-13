// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceMetadataOptionsRequestBuilderOps(val self: InstanceMetadataOptionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala(value: Option[HttpTokensState]): InstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpTokens(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala(value: Option[Int]): InstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpPutResponseHopLimit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala(
      value: Option[InstanceMetadataEndpointState]
  ): InstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpEndpoint(v)
    }
  }

}

final class InstanceMetadataOptionsRequestOps(val self: InstanceMetadataOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala: Option[HttpTokensState] = Option(self.httpTokens)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala: Option[Int] = Option(self.httpPutResponseHopLimit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala: Option[InstanceMetadataEndpointState] = Option(self.httpEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceMetadataOptionsRequestOps {

  implicit def toInstanceMetadataOptionsRequestBuilderOps(
      v: InstanceMetadataOptionsRequest.Builder
  ): InstanceMetadataOptionsRequestBuilderOps = new InstanceMetadataOptionsRequestBuilderOps(v)

  implicit def toInstanceMetadataOptionsRequestOps(
      v: InstanceMetadataOptionsRequest
  ): InstanceMetadataOptionsRequestOps = new InstanceMetadataOptionsRequestOps(v)

}
