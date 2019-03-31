// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ RedirectAllRequestsTo => ScalaRedirectAllRequestsTo, _ }
import software.amazon.awssdk.services.s3.model.{ RedirectAllRequestsTo => JavaRedirectAllRequestsTo }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RedirectAllRequestsToOps {

  implicit class ScalaRedirectAllRequestsToOps(val self: ScalaRedirectAllRequestsTo) extends AnyVal {

    def toJava: JavaRedirectAllRequestsTo = {
      val result = JavaRedirectAllRequestsTo.builder()
      self.hostName.filter(_.nonEmpty).foreach(v => result.hostName(v)) // String
      self.protocol.foreach { v =>
        import ProtocolOps._; result.protocol(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaRedirectAllRequestsToOps(val self: JavaRedirectAllRequestsTo) extends AnyVal {

    def toScala: ScalaRedirectAllRequestsTo = {
      ScalaRedirectAllRequestsTo()
        .withHostName(Option(self.hostName)) // String
        .withProtocol(Option(self.protocol).map { v =>
          import ProtocolOps._; v.toScala
        }) // String
    }

  }

}
