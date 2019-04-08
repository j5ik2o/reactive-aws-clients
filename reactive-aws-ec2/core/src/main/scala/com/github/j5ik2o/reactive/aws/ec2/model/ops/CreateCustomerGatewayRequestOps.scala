// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCustomerGatewayRequestBuilderOps(val self: CreateCustomerGatewayRequest.Builder) extends AnyVal {

  final def bgpAsnAsScala(value: Option[Int]): CreateCustomerGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.bgpAsn(v)
    }
  }

  final def publicIpAsScala(value: Option[String]): CreateCustomerGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.publicIp(v)
    }
  }

  final def typeAsScala(value: Option[GatewayType]): CreateCustomerGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

}

final class CreateCustomerGatewayRequestOps(val self: CreateCustomerGatewayRequest) extends AnyVal {

  final def bgpAsnAsScala: Option[Int] = Option(self.bgpAsn)

  final def publicIpAsScala: Option[String] = Option(self.publicIp)

  final def typeAsScala: Option[GatewayType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCustomerGatewayRequestOps {

  implicit def toCreateCustomerGatewayRequestBuilderOps(
      v: CreateCustomerGatewayRequest.Builder
  ): CreateCustomerGatewayRequestBuilderOps = new CreateCustomerGatewayRequestBuilderOps(v)

  implicit def toCreateCustomerGatewayRequestOps(v: CreateCustomerGatewayRequest): CreateCustomerGatewayRequestOps =
    new CreateCustomerGatewayRequestOps(v)

}
