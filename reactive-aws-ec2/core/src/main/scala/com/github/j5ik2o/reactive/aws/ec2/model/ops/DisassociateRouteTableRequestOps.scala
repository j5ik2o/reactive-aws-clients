// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DisassociateRouteTableRequestBuilderOps(val self: DisassociateRouteTableRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala(value: Option[String]): DisassociateRouteTableRequest.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

}

final class DisassociateRouteTableRequestOps(val self: DisassociateRouteTableRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisassociateRouteTableRequestOps {

  implicit def toDisassociateRouteTableRequestBuilderOps(
      v: DisassociateRouteTableRequest.Builder
  ): DisassociateRouteTableRequestBuilderOps = new DisassociateRouteTableRequestBuilderOps(v)

  implicit def toDisassociateRouteTableRequestOps(v: DisassociateRouteTableRequest): DisassociateRouteTableRequestOps =
    new DisassociateRouteTableRequestOps(v)

}
