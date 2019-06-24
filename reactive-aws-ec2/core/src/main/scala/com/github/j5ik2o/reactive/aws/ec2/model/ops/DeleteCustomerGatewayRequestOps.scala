// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteCustomerGatewayRequestBuilderOps(val self: DeleteCustomerGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdAsScala(value: Option[String]): DeleteCustomerGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.customerGatewayId(v)
    }
  }

}

final class DeleteCustomerGatewayRequestOps(val self: DeleteCustomerGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCustomerGatewayRequestOps {

  implicit def toDeleteCustomerGatewayRequestBuilderOps(
      v: DeleteCustomerGatewayRequest.Builder
  ): DeleteCustomerGatewayRequestBuilderOps = new DeleteCustomerGatewayRequestBuilderOps(v)

  implicit def toDeleteCustomerGatewayRequestOps(v: DeleteCustomerGatewayRequest): DeleteCustomerGatewayRequestOps =
    new DeleteCustomerGatewayRequestOps(v)

}
