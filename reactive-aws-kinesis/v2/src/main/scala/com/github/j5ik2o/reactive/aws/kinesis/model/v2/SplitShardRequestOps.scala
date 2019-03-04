package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardRequest => ScalaSplitShardRequest }
import software.amazon.awssdk.services.kinesis.model.{ SplitShardRequest => JavaSplitShardRequest }

object SplitShardRequestOps {

  implicit class ScalaSplitShardRequestOps(val self: ScalaSplitShardRequest) extends AnyVal {

    def toJava: JavaSplitShardRequest = {
      val result = JavaSplitShardRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardToSplit.foreach(result.shardToSplit)
      self.newStartingHashKey.foreach(result.newStartingHashKey)
      result.build()
    }

  }

}
