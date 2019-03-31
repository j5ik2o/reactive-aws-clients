// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ RequestCharged => ScalaRequestCharged, _ }
import software.amazon.awssdk.services.s3.model.{ RequestCharged => JavaRequestCharged }

object RequestChargedOps {

  implicit class ScalaRequestChargedOps(val self: ScalaRequestCharged) extends AnyVal {

    def toJava: JavaRequestCharged = {
      JavaRequestCharged.valueOf(self.entryName)
    }

  }

  implicit class JavaRequestChargedOps(val self: JavaRequestCharged) extends AnyVal {

    def toScala: ScalaRequestCharged = {
      ScalaRequestCharged.withName(self.toString)
    }

  }

}
