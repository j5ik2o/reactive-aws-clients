// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizationRuleBuilderOps(val self: AuthorizationRule.Builder) extends AnyVal {

  final def clientVpnEndpointIdAsScala(value: Option[String]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupIdAsScala(value: Option[String]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def accessAllAsScala(value: Option[Boolean]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.accessAll(v)
    }
  }

  final def destinationCidrAsScala(value: Option[String]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.destinationCidr(v)
    }
  }

  final def statusAsScala(value: Option[ClientVpnAuthorizationRuleStatus]): AuthorizationRule.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class AuthorizationRuleOps(val self: AuthorizationRule) extends AnyVal {

  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def accessAllAsScala: Option[Boolean] = Option(self.accessAll)

  final def destinationCidrAsScala: Option[String] = Option(self.destinationCidr)

  final def statusAsScala: Option[ClientVpnAuthorizationRuleStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizationRuleOps {

  implicit def toAuthorizationRuleBuilderOps(v: AuthorizationRule.Builder): AuthorizationRuleBuilderOps =
    new AuthorizationRuleBuilderOps(v)

  implicit def toAuthorizationRuleOps(v: AuthorizationRule): AuthorizationRuleOps = new AuthorizationRuleOps(v)

}
