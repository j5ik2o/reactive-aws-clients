// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StartVpcEndpointServicePrivateDnsVerificationRequestBuilderOps(val self: StartVpcEndpointServicePrivateDnsVerificationRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala(value: Option[String]): StartVpcEndpointServicePrivateDnsVerificationRequest.Builder = {
            value.fold(self){ v => self.serviceId(v) }
            } 


}

final class StartVpcEndpointServicePrivateDnsVerificationRequestOps(val self: StartVpcEndpointServicePrivateDnsVerificationRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala: Option[String] = Option(self.serviceId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartVpcEndpointServicePrivateDnsVerificationRequestOps {

implicit def toStartVpcEndpointServicePrivateDnsVerificationRequestBuilderOps(v: StartVpcEndpointServicePrivateDnsVerificationRequest.Builder): StartVpcEndpointServicePrivateDnsVerificationRequestBuilderOps = new StartVpcEndpointServicePrivateDnsVerificationRequestBuilderOps(v)

implicit def toStartVpcEndpointServicePrivateDnsVerificationRequestOps(v: StartVpcEndpointServicePrivateDnsVerificationRequest): StartVpcEndpointServicePrivateDnsVerificationRequestOps = new StartVpcEndpointServicePrivateDnsVerificationRequestOps(v)

}

