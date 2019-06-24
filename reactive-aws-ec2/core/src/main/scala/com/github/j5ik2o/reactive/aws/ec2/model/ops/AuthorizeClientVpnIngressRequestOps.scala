// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizeClientVpnIngressRequestBuilderOps(val self: AuthorizeClientVpnIngressRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala(value: Option[String]): AuthorizeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.clientVpnEndpointId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNetworkCidrAsScala(value: Option[String]): AuthorizeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.targetNetworkCidr(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessGroupIdAsScala(value: Option[String]): AuthorizeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.accessGroupId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizeAllGroupsAsScala(value: Option[Boolean]): AuthorizeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.authorizeAllGroups(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): AuthorizeClientVpnIngressRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

}

final class AuthorizeClientVpnIngressRequestOps(val self: AuthorizeClientVpnIngressRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientVpnEndpointIdAsScala: Option[String] = Option(self.clientVpnEndpointId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetNetworkCidrAsScala: Option[String] = Option(self.targetNetworkCidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessGroupIdAsScala: Option[String] = Option(self.accessGroupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authorizeAllGroupsAsScala: Option[Boolean] = Option(self.authorizeAllGroups)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizeClientVpnIngressRequestOps {

  implicit def toAuthorizeClientVpnIngressRequestBuilderOps(
      v: AuthorizeClientVpnIngressRequest.Builder
  ): AuthorizeClientVpnIngressRequestBuilderOps = new AuthorizeClientVpnIngressRequestBuilderOps(v)

  implicit def toAuthorizeClientVpnIngressRequestOps(
      v: AuthorizeClientVpnIngressRequest
  ): AuthorizeClientVpnIngressRequestOps = new AuthorizeClientVpnIngressRequestOps(v)

}
