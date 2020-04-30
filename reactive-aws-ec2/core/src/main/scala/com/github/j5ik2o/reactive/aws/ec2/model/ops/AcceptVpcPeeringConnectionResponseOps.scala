// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptVpcPeeringConnectionResponseBuilderOps(val self: AcceptVpcPeeringConnectionResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionAsScala(value: Option[VpcPeeringConnection]): AcceptVpcPeeringConnectionResponse.Builder = {
            value.fold(self){ v => self.vpcPeeringConnection(v) }
            } 


}

final class AcceptVpcPeeringConnectionResponseOps(val self: AcceptVpcPeeringConnectionResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcPeeringConnectionAsScala: Option[VpcPeeringConnection] = Option(self.vpcPeeringConnection) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptVpcPeeringConnectionResponseOps {

implicit def toAcceptVpcPeeringConnectionResponseBuilderOps(v: AcceptVpcPeeringConnectionResponse.Builder): AcceptVpcPeeringConnectionResponseBuilderOps = new AcceptVpcPeeringConnectionResponseBuilderOps(v)

implicit def toAcceptVpcPeeringConnectionResponseOps(v: AcceptVpcPeeringConnectionResponse): AcceptVpcPeeringConnectionResponseOps = new AcceptVpcPeeringConnectionResponseOps(v)

}

