// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RedirectBuilderOps(val self: Redirect.Builder) extends AnyVal {

  final def hostNameAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.hostName(v)
    }
  }

  final def httpRedirectCodeAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.httpRedirectCode(v)
    }
  }

  final def protocolAsScala(value: Option[Protocol]): Redirect.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

  final def replaceKeyPrefixWithAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.replaceKeyPrefixWith(v)
    }
  }

  final def replaceKeyWithAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.replaceKeyWith(v)
    }
  }

}

final class RedirectOps(val self: Redirect) extends AnyVal {

  final def hostNameAsScala: Option[String] = Option(self.hostName)

  final def httpRedirectCodeAsScala: Option[String] = Option(self.httpRedirectCode)

  final def protocolAsScala: Option[Protocol] = Option(self.protocol)

  final def replaceKeyPrefixWithAsScala: Option[String] = Option(self.replaceKeyPrefixWith)

  final def replaceKeyWithAsScala: Option[String] = Option(self.replaceKeyWith)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRedirectOps {

  implicit def toRedirectBuilderOps(v: Redirect.Builder): RedirectBuilderOps = new RedirectBuilderOps(v)

  implicit def toRedirectOps(v: Redirect): RedirectOps = new RedirectOps(v)

}
