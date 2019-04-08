// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCustomerGatewayResponseBuilderOps(val self: CreateCustomerGatewayResponse.Builder) extends AnyVal {

  final def customerGatewayAsScala(value: Option[CustomerGateway]): CreateCustomerGatewayResponse.Builder = {
    value.fold(self) { v =>
      self.customerGateway(v)
    }
  }

}

final class CreateCustomerGatewayResponseOps(val self: CreateCustomerGatewayResponse) extends AnyVal {

  final def customerGatewayAsScala: Option[CustomerGateway] = Option(self.customerGateway)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCustomerGatewayResponseOps {

  implicit def toCreateCustomerGatewayResponseBuilderOps(
      v: CreateCustomerGatewayResponse.Builder
  ): CreateCustomerGatewayResponseBuilderOps = new CreateCustomerGatewayResponseBuilderOps(v)

  implicit def toCreateCustomerGatewayResponseOps(v: CreateCustomerGatewayResponse): CreateCustomerGatewayResponseOps =
    new CreateCustomerGatewayResponseOps(v)

}
