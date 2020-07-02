// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RedirectAllRequestsToBuilderOps(val self: RedirectAllRequestsTo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostNameAsScala(value: Option[String]): RedirectAllRequestsTo.Builder = {
    value.fold(self) { v => self.hostName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[Protocol]): RedirectAllRequestsTo.Builder = {
    value.fold(self) { v => self.protocol(v) }
  }

}

final class RedirectAllRequestsToOps(val self: RedirectAllRequestsTo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostNameAsScala: Option[String] = Option(self.hostName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[Protocol] = Option(self.protocol)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRedirectAllRequestsToOps {

  implicit def toRedirectAllRequestsToBuilderOps(v: RedirectAllRequestsTo.Builder): RedirectAllRequestsToBuilderOps =
    new RedirectAllRequestsToBuilderOps(v)

  implicit def toRedirectAllRequestsToOps(v: RedirectAllRequestsTo): RedirectAllRequestsToOps =
    new RedirectAllRequestsToOps(v)

}
