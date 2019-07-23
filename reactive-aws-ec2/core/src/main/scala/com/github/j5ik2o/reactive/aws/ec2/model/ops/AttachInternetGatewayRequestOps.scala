// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AttachInternetGatewayRequestBuilderOps(val self: AttachInternetGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdAsScala(value: Option[String]): AttachInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.internetGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): AttachInternetGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class AttachInternetGatewayRequestOps(val self: AttachInternetGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def internetGatewayIdAsScala: Option[String] = Option(self.internetGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachInternetGatewayRequestOps {

  implicit def toAttachInternetGatewayRequestBuilderOps(
      v: AttachInternetGatewayRequest.Builder
  ): AttachInternetGatewayRequestBuilderOps = new AttachInternetGatewayRequestBuilderOps(v)

  implicit def toAttachInternetGatewayRequestOps(v: AttachInternetGatewayRequest): AttachInternetGatewayRequestOps =
    new AttachInternetGatewayRequestOps(v)

}
