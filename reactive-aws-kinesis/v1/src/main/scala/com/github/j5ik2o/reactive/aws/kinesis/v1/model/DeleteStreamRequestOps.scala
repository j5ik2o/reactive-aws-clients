// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DeleteStreamRequest => ScalaDeleteStreamRequest, _ }
import com.amazonaws.services.kinesis.model.{ DeleteStreamRequest => JavaDeleteStreamRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteStreamRequestOps {

  implicit class ScalaDeleteStreamRequestOps(val self: ScalaDeleteStreamRequest) extends AnyVal {

    def toJava: JavaDeleteStreamRequest = {
      val result = new JavaDeleteStreamRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                            // String
      self.enforceConsumerDeletion.map(_.booleanValue).foreach(v => result.withEnforceConsumerDeletion(v)) // Boolean

      result
    }

  }

}
