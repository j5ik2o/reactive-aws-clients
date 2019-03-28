// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEStatus => ScalaSSEStatus, _ }
import com.amazonaws.services.dynamodbv2.model.{ SSEStatus => JavaSSEStatus }

object SSEStatusOps {

  implicit class ScalaSSEStatusOps(val self: ScalaSSEStatus) extends AnyVal {

    def toJava: JavaSSEStatus = {
      JavaSSEStatus.valueOf(self.entryName)
    }

  }

  implicit class JavaSSEStatusOps(val self: String) extends AnyVal {

    def toScala: ScalaSSEStatus = {
      ScalaSSEStatus.withName(self)
    }

  }

}
