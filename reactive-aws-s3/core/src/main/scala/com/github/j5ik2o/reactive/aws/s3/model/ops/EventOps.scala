// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Event => ScalaEvent, _ }
import software.amazon.awssdk.services.s3.model.{ Event => JavaEvent }

object EventOps {

  implicit class ScalaEventOps(val self: ScalaEvent) extends AnyVal {

    def toJava: JavaEvent = {
      JavaEvent.valueOf(self.entryName)
    }

  }

  implicit class JavaEventOps(val self: JavaEvent) extends AnyVal {

    def toScala: ScalaEvent = {
      ScalaEvent.withName(self.toString)
    }

  }

}
