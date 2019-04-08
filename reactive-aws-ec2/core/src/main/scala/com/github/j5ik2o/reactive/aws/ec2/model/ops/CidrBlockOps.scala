// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CidrBlockBuilderOps(val self: CidrBlock.Builder) extends AnyVal {

  final def cidrBlockAsScala(value: Option[String]): CidrBlock.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

}

final class CidrBlockOps(val self: CidrBlock) extends AnyVal {

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCidrBlockOps {

  implicit def toCidrBlockBuilderOps(v: CidrBlock.Builder): CidrBlockBuilderOps = new CidrBlockBuilderOps(v)

  implicit def toCidrBlockOps(v: CidrBlock): CidrBlockOps = new CidrBlockOps(v)

}
