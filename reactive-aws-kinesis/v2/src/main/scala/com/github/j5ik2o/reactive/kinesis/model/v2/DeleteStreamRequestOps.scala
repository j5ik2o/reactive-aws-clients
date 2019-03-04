package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ DeleteStreamRequest => ScalaDeleteStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ DeleteStreamRequest => JavaDeleteStreamRequest }

object DeleteStreamRequestOps {

  implicit class ScalaDeleteStreamRequestOps(val self: ScalaDeleteStreamRequest) extends AnyVal {

    def toJava: JavaDeleteStreamRequest = {
      val result = JavaDeleteStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.enforceConsumerDeletion.foreach(v => result.enforceConsumerDeletion(v))
      result.build()
    }

  }

}
