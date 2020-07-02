// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteEgressOnlyInternetGatewayResponseBuilderOps(val self: DeleteEgressOnlyInternetGatewayResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnCodeAsScala(value: Option[Boolean]): DeleteEgressOnlyInternetGatewayResponse.Builder = {
    value.fold(self) { v => self.returnCode(v) }
  }

}

final class DeleteEgressOnlyInternetGatewayResponseOps(val self: DeleteEgressOnlyInternetGatewayResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def returnCodeAsScala: Option[Boolean] = Option(self.returnCode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteEgressOnlyInternetGatewayResponseOps {

  implicit def toDeleteEgressOnlyInternetGatewayResponseBuilderOps(
      v: DeleteEgressOnlyInternetGatewayResponse.Builder
  ): DeleteEgressOnlyInternetGatewayResponseBuilderOps = new DeleteEgressOnlyInternetGatewayResponseBuilderOps(v)

  implicit def toDeleteEgressOnlyInternetGatewayResponseOps(
      v: DeleteEgressOnlyInternetGatewayResponse
  ): DeleteEgressOnlyInternetGatewayResponseOps = new DeleteEgressOnlyInternetGatewayResponseOps(v)

}
