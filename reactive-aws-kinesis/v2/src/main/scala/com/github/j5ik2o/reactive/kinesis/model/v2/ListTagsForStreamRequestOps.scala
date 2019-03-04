package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ListTagsForStreamRequest => ScalaListTagsForStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ ListTagsForStreamRequest => JavaListTagsForStreamRequest }

object ListTagsForStreamRequestOps {

  implicit class ScalaListTagsForStreamRequestOps(val self: ScalaListTagsForStreamRequest) extends AnyVal {

    def toJava: JavaListTagsForStreamRequest = {
      val result = JavaListTagsForStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.limit.foreach(v => result.limit(v))
      self.exclusiveStartTagKey.foreach(result.exclusiveStartTagKey)
      result.build()
    }

  }

}
