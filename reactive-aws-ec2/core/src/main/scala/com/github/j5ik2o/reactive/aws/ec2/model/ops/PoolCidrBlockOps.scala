// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PoolCidrBlockBuilderOps(val self: PoolCidrBlock.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): PoolCidrBlock.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

}

final class PoolCidrBlockOps(val self: PoolCidrBlock) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPoolCidrBlockOps {

  implicit def toPoolCidrBlockBuilderOps(v: PoolCidrBlock.Builder): PoolCidrBlockBuilderOps =
    new PoolCidrBlockBuilderOps(v)

  implicit def toPoolCidrBlockOps(v: PoolCidrBlock): PoolCidrBlockOps = new PoolCidrBlockOps(v)

}
