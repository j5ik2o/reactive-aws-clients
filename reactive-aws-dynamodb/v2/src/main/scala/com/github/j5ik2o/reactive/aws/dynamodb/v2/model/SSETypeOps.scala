// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SSEType => ScalaSSEType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SSEType => JavaSSEType }

object SSETypeOps {

  implicit class ScalaSSETypeOps(val self: ScalaSSEType) extends AnyVal {

    def toJava: JavaSSEType = {
      JavaSSEType.valueOf(self.entryName)
    }

  }

  implicit class JavaSSETypeOps(val self: JavaSSEType) extends AnyVal {

    def toScala: ScalaSSEType = {
      ScalaSSEType.withName(self.toString)
    }

  }

}
