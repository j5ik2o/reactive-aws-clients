// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AllowedPrincipalBuilderOps(val self: AllowedPrincipal.Builder) extends AnyVal {

  final def principalTypeAsScala(value: Option[PrincipalType]): AllowedPrincipal.Builder = {
    value.fold(self) { v =>
      self.principalType(v)
    }
  }

  final def principalAsScala(value: Option[String]): AllowedPrincipal.Builder = {
    value.fold(self) { v =>
      self.principal(v)
    }
  }

}

final class AllowedPrincipalOps(val self: AllowedPrincipal) extends AnyVal {

  final def principalTypeAsScala: Option[PrincipalType] = Option(self.principalType)

  final def principalAsScala: Option[String] = Option(self.principal)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAllowedPrincipalOps {

  implicit def toAllowedPrincipalBuilderOps(v: AllowedPrincipal.Builder): AllowedPrincipalBuilderOps =
    new AllowedPrincipalBuilderOps(v)

  implicit def toAllowedPrincipalOps(v: AllowedPrincipal): AllowedPrincipalOps = new AllowedPrincipalOps(v)

}
