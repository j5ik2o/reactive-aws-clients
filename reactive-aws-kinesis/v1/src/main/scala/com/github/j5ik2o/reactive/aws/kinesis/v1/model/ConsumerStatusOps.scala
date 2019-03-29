// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ConsumerStatus => ScalaConsumerStatus, _ }
import com.amazonaws.services.kinesis.model.{ ConsumerStatus => JavaConsumerStatus }

object ConsumerStatusOps {

  implicit class ScalaConsumerStatusOps(val self: ScalaConsumerStatus) extends AnyVal {

    def toJava: JavaConsumerStatus = {
      JavaConsumerStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaConsumerStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaConsumerStatus = {
      ScalaConsumerStatus.withName(self)
    }

  }

}
