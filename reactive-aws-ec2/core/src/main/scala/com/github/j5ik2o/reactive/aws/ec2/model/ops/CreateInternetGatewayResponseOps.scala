// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateInternetGatewayResponseBuilderOps(val self: CreateInternetGatewayResponse.Builder) extends AnyVal {

  final def internetGatewayAsScala(value: Option[InternetGateway]): CreateInternetGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.internetGateway(v)
    }
  }

}

final class CreateInternetGatewayResponseOps(val self: CreateInternetGatewayResponse) extends AnyVal {

  final def internetGatewayAsScala: Option[InternetGateway] = Option(self.internetGateway)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateInternetGatewayResponseOps {

  implicit def toCreateInternetGatewayResponseBuilderOps(
      v: CreateInternetGatewayResponse.Builder
  ): CreateInternetGatewayResponseBuilderOps = new CreateInternetGatewayResponseBuilderOps(v)

  implicit def toCreateInternetGatewayResponseOps(v: CreateInternetGatewayResponse): CreateInternetGatewayResponseOps =
    new CreateInternetGatewayResponseOps(v)

}
