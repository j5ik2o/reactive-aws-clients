// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateCustomerGatewayRequestBuilderOps(val self: CreateCustomerGatewayRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bgpAsnAsScala(value: Option[Int]): CreateCustomerGatewayRequest.Builder = {
            value.fold(self){ v => self.bgpAsn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala(value: Option[String]): CreateCustomerGatewayRequest.Builder = {
            value.fold(self){ v => self.publicIp(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def certificateArnAsScala(value: Option[String]): CreateCustomerGatewayRequest.Builder = {
            value.fold(self){ v => self.certificateArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[GatewayType]): CreateCustomerGatewayRequest.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deviceNameAsScala(value: Option[String]): CreateCustomerGatewayRequest.Builder = {
            value.fold(self){ v => self.deviceName(v) }
            } 


}

final class CreateCustomerGatewayRequestOps(val self: CreateCustomerGatewayRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bgpAsnAsScala: Option[Int] = Option(self.bgpAsn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def publicIpAsScala: Option[String] = Option(self.publicIp) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def certificateArnAsScala: Option[String] = Option(self.certificateArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[GatewayType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deviceNameAsScala: Option[String] = Option(self.deviceName) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateCustomerGatewayRequestOps {

implicit def toCreateCustomerGatewayRequestBuilderOps(v: CreateCustomerGatewayRequest.Builder): CreateCustomerGatewayRequestBuilderOps = new CreateCustomerGatewayRequestBuilderOps(v)

implicit def toCreateCustomerGatewayRequestOps(v: CreateCustomerGatewayRequest): CreateCustomerGatewayRequestOps = new CreateCustomerGatewayRequestOps(v)

}

