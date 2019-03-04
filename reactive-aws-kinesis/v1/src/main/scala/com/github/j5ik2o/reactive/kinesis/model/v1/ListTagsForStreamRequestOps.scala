package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListTagsForStreamRequest => JavaListTagsForStreamRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ ListTagsForStreamRequest => ScalaListTagsForStreamRequest }

object ListTagsForStreamRequestOps {

  implicit class ScalaListTagsForStreamRequestOps(val self: ScalaListTagsForStreamRequest) extends AnyVal {

    def toJava: JavaListTagsForStreamRequest = {
      val result = new JavaListTagsForStreamRequest()
      self.streamName.foreach(result.setStreamName)
      self.limit.foreach(v => result.setLimit(v))
      self.exclusiveStartTagKey.foreach(result.setExclusiveStartTagKey)
      result
    }

  }

}
