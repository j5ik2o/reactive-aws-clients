package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ SplitShardRequest => JavaSplitShardRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardRequest => ScalaSplitShardRequest }

object SplitShardRequestOps {

  implicit class ScalaSplitShardRequestOps(val self: ScalaSplitShardRequest) extends AnyVal {

    def toJava: JavaSplitShardRequest = {
      val result = new JavaSplitShardRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardToSplit.foreach(result.setShardToSplit)
      self.newStartingHashKey.foreach(result.setNewStartingHashKey)
      result
    }

  }

}
