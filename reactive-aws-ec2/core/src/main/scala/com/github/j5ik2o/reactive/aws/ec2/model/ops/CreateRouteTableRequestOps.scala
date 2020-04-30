// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateRouteTableRequestBuilderOps(val self: CreateRouteTableRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): CreateRouteTableRequest.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 


}

final class CreateRouteTableRequestOps(val self: CreateRouteTableRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRouteTableRequestOps {

implicit def toCreateRouteTableRequestBuilderOps(v: CreateRouteTableRequest.Builder): CreateRouteTableRequestBuilderOps = new CreateRouteTableRequestBuilderOps(v)

implicit def toCreateRouteTableRequestOps(v: CreateRouteTableRequest): CreateRouteTableRequestOps = new CreateRouteTableRequestOps(v)

}

