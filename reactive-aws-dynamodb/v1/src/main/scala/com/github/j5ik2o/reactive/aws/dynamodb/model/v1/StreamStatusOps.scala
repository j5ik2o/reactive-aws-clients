// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamStatus => ScalaStreamStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ StreamStatus => JavaStreamStatus }

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
