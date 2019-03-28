// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEType => ScalaSSEType, _ }
import com.amazonaws.services.dynamodbv2.model.{ SSEType => JavaSSEType }

object SSETypeOps {

  implicit class ScalaSSETypeOps(val self: ScalaSSEType) extends AnyVal {

    def toJava: JavaSSEType = {
      JavaSSEType.valueOf(self.entryName)
    }

  }

  implicit class JavaSSETypeOps(val self: String) extends AnyVal {

    def toScala: ScalaSSEType = {
      ScalaSSEType.withName(self)
    }

  }

}
