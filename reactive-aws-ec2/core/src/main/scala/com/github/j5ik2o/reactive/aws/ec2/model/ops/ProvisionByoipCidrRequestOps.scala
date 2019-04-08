// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ProvisionByoipCidrRequestBuilderOps(val self: ProvisionByoipCidrRequest.Builder) extends AnyVal {

  final def cidrAsScala(value: Option[String]): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v =>
      self.cidr(v)
    }
  }

  final def cidrAuthorizationContextAsScala(
      value: Option[CidrAuthorizationContext]
  ): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v =>
      self.cidrAuthorizationContext(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ProvisionByoipCidrRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class ProvisionByoipCidrRequestOps(val self: ProvisionByoipCidrRequest) extends AnyVal {

  final def cidrAsScala: Option[String] = Option(self.cidr)

  final def cidrAuthorizationContextAsScala: Option[CidrAuthorizationContext] = Option(self.cidrAuthorizationContext)

  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionByoipCidrRequestOps {

  implicit def toProvisionByoipCidrRequestBuilderOps(
      v: ProvisionByoipCidrRequest.Builder
  ): ProvisionByoipCidrRequestBuilderOps = new ProvisionByoipCidrRequestBuilderOps(v)

  implicit def toProvisionByoipCidrRequestOps(v: ProvisionByoipCidrRequest): ProvisionByoipCidrRequestOps =
    new ProvisionByoipCidrRequestOps(v)

}
