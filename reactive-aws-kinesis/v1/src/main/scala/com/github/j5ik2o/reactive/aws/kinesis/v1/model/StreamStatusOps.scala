// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ StreamStatus => ScalaStreamStatus, _ }
import com.amazonaws.services.kinesis.model.{ StreamStatus => JavaStreamStatus }

object StreamStatusOps {

  implicit class ScalaStreamStatusOps(val self: ScalaStreamStatus) extends AnyVal {

    def toJava: JavaStreamStatus = {
      JavaStreamStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaStreamStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaStreamStatus = {
      ScalaStreamStatus.withName(self)
    }

  }

}
