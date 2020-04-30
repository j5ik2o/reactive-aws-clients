// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Ipv6CidrBlockBuilderOps(val self: Ipv6CidrBlock.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6CidrBlockAsScala(value: Option[String]): Ipv6CidrBlock.Builder = {
            value.fold(self){ v => self.ipv6CidrBlock(v) }
            } 


}

final class Ipv6CidrBlockOps(val self: Ipv6CidrBlock) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIpv6CidrBlockOps {

implicit def toIpv6CidrBlockBuilderOps(v: Ipv6CidrBlock.Builder): Ipv6CidrBlockBuilderOps = new Ipv6CidrBlockBuilderOps(v)

implicit def toIpv6CidrBlockOps(v: Ipv6CidrBlock): Ipv6CidrBlockOps = new Ipv6CidrBlockOps(v)

}

