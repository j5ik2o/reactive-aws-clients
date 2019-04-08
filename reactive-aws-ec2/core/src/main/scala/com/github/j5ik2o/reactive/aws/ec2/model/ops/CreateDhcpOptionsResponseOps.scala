// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateDhcpOptionsResponseBuilderOps(val self: CreateDhcpOptionsResponse.Builder) extends AnyVal {

  final def dhcpOptionsAsScala(value: Option[DhcpOptions]): CreateDhcpOptionsResponse.Builder = {
    value.fold(self) { v =>
      self.dhcpOptions(v)
    }
  }

}

final class CreateDhcpOptionsResponseOps(val self: CreateDhcpOptionsResponse) extends AnyVal {

  final def dhcpOptionsAsScala: Option[DhcpOptions] = Option(self.dhcpOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDhcpOptionsResponseOps {

  implicit def toCreateDhcpOptionsResponseBuilderOps(
      v: CreateDhcpOptionsResponse.Builder
  ): CreateDhcpOptionsResponseBuilderOps = new CreateDhcpOptionsResponseBuilderOps(v)

  implicit def toCreateDhcpOptionsResponseOps(v: CreateDhcpOptionsResponse): CreateDhcpOptionsResponseOps =
    new CreateDhcpOptionsResponseOps(v)

}
