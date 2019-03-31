// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ Protocol => ScalaProtocol, _ }
import software.amazon.awssdk.services.s3.model.{ Protocol => JavaProtocol }

object ProtocolOps {

  implicit class ScalaProtocolOps(val self: ScalaProtocol) extends AnyVal {

    def toJava: JavaProtocol = {
      JavaProtocol.valueOf(self.entryName)
    }

  }

  implicit class JavaProtocolOps(val self: JavaProtocol) extends AnyVal {

    def toScala: ScalaProtocol = {
      ScalaProtocol.withName(self.toString)
    }

  }

}
