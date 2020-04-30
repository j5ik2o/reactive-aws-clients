// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateDefaultSubnetResponseBuilderOps(val self: CreateDefaultSubnetResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala(value: Option[Subnet]): CreateDefaultSubnetResponse.Builder = {
            value.fold(self){ v => self.subnet(v) }
            } 


}

final class CreateDefaultSubnetResponseOps(val self: CreateDefaultSubnetResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetAsScala: Option[Subnet] = Option(self.subnet) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDefaultSubnetResponseOps {

implicit def toCreateDefaultSubnetResponseBuilderOps(v: CreateDefaultSubnetResponse.Builder): CreateDefaultSubnetResponseBuilderOps = new CreateDefaultSubnetResponseBuilderOps(v)

implicit def toCreateDefaultSubnetResponseOps(v: CreateDefaultSubnetResponse): CreateDefaultSubnetResponseOps = new CreateDefaultSubnetResponseOps(v)

}

