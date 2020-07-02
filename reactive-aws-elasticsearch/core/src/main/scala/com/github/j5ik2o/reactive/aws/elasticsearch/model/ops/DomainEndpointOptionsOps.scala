// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DomainEndpointOptionsBuilderOps(val self: DomainEndpointOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enforceHTTPSAsScala(value: Option[Boolean]): DomainEndpointOptions.Builder = {
    value.fold(self) { v => self.enforceHTTPS(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tlsSecurityPolicyAsScala(value: Option[TLSSecurityPolicy]): DomainEndpointOptions.Builder = {
    value.fold(self) { v => self.tlsSecurityPolicy(v) }
  }

}

final class DomainEndpointOptionsOps(val self: DomainEndpointOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enforceHTTPSAsScala: Option[Boolean] = Option(self.enforceHTTPS)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tlsSecurityPolicyAsScala: Option[TLSSecurityPolicy] = Option(self.tlsSecurityPolicy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDomainEndpointOptionsOps {

  implicit def toDomainEndpointOptionsBuilderOps(v: DomainEndpointOptions.Builder): DomainEndpointOptionsBuilderOps =
    new DomainEndpointOptionsBuilderOps(v)

  implicit def toDomainEndpointOptionsOps(v: DomainEndpointOptions): DomainEndpointOptionsOps =
    new DomainEndpointOptionsOps(v)

}
