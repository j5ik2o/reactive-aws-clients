// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSubnetResponseBuilderOps(val self: CreateSubnetResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala(value: Option[Subnet]): CreateSubnetResponse.Builder = {
            value.fold(self){ v => self.subnet(v) }
            } 


}

final class CreateSubnetResponseOps(val self: CreateSubnetResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala: Option[Subnet] = Option(self.subnet) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetResponseOps {

implicit def toCreateSubnetResponseBuilderOps(v: CreateSubnetResponse.Builder): CreateSubnetResponseBuilderOps = new CreateSubnetResponseBuilderOps(v)

implicit def toCreateSubnetResponseOps(v: CreateSubnetResponse): CreateSubnetResponseOps = new CreateSubnetResponseOps(v)

}

