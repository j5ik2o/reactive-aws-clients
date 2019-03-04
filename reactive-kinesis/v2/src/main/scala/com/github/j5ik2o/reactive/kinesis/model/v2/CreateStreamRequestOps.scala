package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ CreateStreamRequest => ScalaCreateStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ CreateStreamRequest => JavaCreateStreamRequest }

object CreateStreamRequestOps {

  implicit class ScalaCreateStreamRequestOps(val self: ScalaCreateStreamRequest) extends AnyVal {

    def toJava: JavaCreateStreamRequest = {
      val result = JavaCreateStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardCount.foreach(v => result.shardCount(v))
      result.build()
    }

  }

}
