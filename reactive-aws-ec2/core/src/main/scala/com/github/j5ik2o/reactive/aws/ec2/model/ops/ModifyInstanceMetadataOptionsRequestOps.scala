// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceMetadataOptionsRequestBuilderOps(val self: ModifyInstanceMetadataOptionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ModifyInstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala(value: Option[HttpTokensState]): ModifyInstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpTokens(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala(value: Option[Int]): ModifyInstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpPutResponseHopLimit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala(
      value: Option[InstanceMetadataEndpointState]
  ): ModifyInstanceMetadataOptionsRequest.Builder = {
    value.fold(self) { v =>
      self.httpEndpoint(v)
    }
  }

}

final class ModifyInstanceMetadataOptionsRequestOps(val self: ModifyInstanceMetadataOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpTokensAsScala: Option[HttpTokensState] = Option(self.httpTokens)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpPutResponseHopLimitAsScala: Option[Int] = Option(self.httpPutResponseHopLimit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def httpEndpointAsScala: Option[InstanceMetadataEndpointState] = Option(self.httpEndpoint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceMetadataOptionsRequestOps {

  implicit def toModifyInstanceMetadataOptionsRequestBuilderOps(
      v: ModifyInstanceMetadataOptionsRequest.Builder
  ): ModifyInstanceMetadataOptionsRequestBuilderOps = new ModifyInstanceMetadataOptionsRequestBuilderOps(v)

  implicit def toModifyInstanceMetadataOptionsRequestOps(
      v: ModifyInstanceMetadataOptionsRequest
  ): ModifyInstanceMetadataOptionsRequestOps = new ModifyInstanceMetadataOptionsRequestOps(v)

}
