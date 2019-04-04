// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RedirectBuilderOps(val self: Redirect.Builder) extends AnyVal {

  final def withHostNameAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.hostName(v)
    }
  } // String

  final def withHttpRedirectCodeAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.httpRedirectCode(v)
    }
  } // String

  final def withProtocolAsScala(value: Option[Protocol]): Redirect.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  } // String

  final def withReplaceKeyPrefixWithAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.replaceKeyPrefixWith(v)
    }
  } // String

  final def withReplaceKeyWithAsScala(value: Option[String]): Redirect.Builder = {
    value.fold(self) { v =>
      self.replaceKeyWith(v)
    }
  } // String

}

final class RedirectOps(val self: Redirect) extends AnyVal {

  final def hostNameAsScala: Option[String] = Option(self.hostName) // String

  final def httpRedirectCodeAsScala: Option[String] = Option(self.httpRedirectCode) // String

  final def protocolAsScala: Option[Protocol] = Option(self.protocol) // String

  final def replaceKeyPrefixWithAsScala: Option[String] = Option(self.replaceKeyPrefixWith) // String

  final def replaceKeyWithAsScala: Option[String] = Option(self.replaceKeyWith) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRedirectOps {

  implicit def toRedirectBuilderOps(v: Redirect.Builder): RedirectBuilderOps = new RedirectBuilderOps(v)

  implicit def toRedirectOps(v: Redirect): RedirectOps = new RedirectOps(v)

}
