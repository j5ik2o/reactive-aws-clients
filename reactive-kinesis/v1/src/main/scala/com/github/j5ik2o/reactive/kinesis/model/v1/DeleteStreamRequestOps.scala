package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DeleteStreamRequest => JavaDeleteStreamRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ DeleteStreamRequest => ScalaDeleteStreamRequest }

object DeleteStreamRequestOps {

  implicit class ScalaDeleteStreamRequestOps(val self: ScalaDeleteStreamRequest) extends AnyVal {

    def toJava: JavaDeleteStreamRequest = {
      val result = new JavaDeleteStreamRequest()
      self.streamName.foreach(result.setStreamName)
      self.enforceConsumerDeletion.foreach(v => result.setEnforceConsumerDeletion(v))
      result
    }

  }

}
