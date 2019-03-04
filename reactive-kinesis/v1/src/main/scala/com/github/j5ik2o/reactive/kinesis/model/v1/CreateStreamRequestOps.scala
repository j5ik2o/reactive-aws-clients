package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ CreateStreamRequest => JavaCreateStreamRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ CreateStreamRequest => ScalaCreateStreamRequest }

object CreateStreamRequestOps {

  implicit class ScalaCreateStreamRequestOps(val self: ScalaCreateStreamRequest) extends AnyVal {

    def toJava: JavaCreateStreamRequest = {
      val result = new JavaCreateStreamRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardCount.foreach(v => result.setShardCount(v))
      result
    }

  }

}
