// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Redirect => ScalaRedirect, _ }
import software.amazon.awssdk.services.s3.model.{ Redirect => JavaRedirect }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RedirectOps {

  implicit class ScalaRedirectOps(val self: ScalaRedirect) extends AnyVal {

    def toJava: JavaRedirect = {
      val result = JavaRedirect.builder()
      self.hostName.filter(_.nonEmpty).foreach(v => result.hostName(v))                 // String
      self.httpRedirectCode.filter(_.nonEmpty).foreach(v => result.httpRedirectCode(v)) // String
      self.protocol.foreach { v =>
        import ProtocolOps._; result.protocol(v.toJava)
      } // String
      self.replaceKeyPrefixWith.filter(_.nonEmpty).foreach(v => result.replaceKeyPrefixWith(v)) // String
      self.replaceKeyWith.filter(_.nonEmpty).foreach(v => result.replaceKeyWith(v))             // String

      result.build()
    }

  }

  implicit class JavaRedirectOps(val self: JavaRedirect) extends AnyVal {

    def toScala: ScalaRedirect = {
      ScalaRedirect()
        .withHostName(Option(self.hostName)) // String
        .withHttpRedirectCode(Option(self.httpRedirectCode)) // String
        .withProtocol(Option(self.protocol).map { v =>
          import ProtocolOps._; v.toScala
        }) // String
        .withReplaceKeyPrefixWith(Option(self.replaceKeyPrefixWith)) // String
        .withReplaceKeyWith(Option(self.replaceKeyWith)) // String
    }

  }

}
