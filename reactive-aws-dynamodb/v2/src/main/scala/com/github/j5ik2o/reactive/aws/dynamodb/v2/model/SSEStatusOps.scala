// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEStatus => ScalaSSEStatus, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SSEStatus => JavaSSEStatus }

object SSEStatusOps {

  implicit class ScalaSSEStatusOps(val self: ScalaSSEStatus) extends AnyVal {

    def toJava: JavaSSEStatus = {
      JavaSSEStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaSSEStatusOps(val self: JavaSSEStatus) extends AnyVal {

    def toScala: ScalaSSEStatus = {
      ScalaSSEStatus.withName(self.toString)
    }

  }

}
