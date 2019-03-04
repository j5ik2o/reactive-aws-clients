package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ MergeShardsRequest => JavaMergeShardsRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsRequest => ScalaMergeShardsRequest }

object MergeShardsRequestOps {

  implicit class ScalaMergeShardsRequestOps(val self: ScalaMergeShardsRequest) extends AnyVal {
    def toJava: JavaMergeShardsRequest = {
      val result = new JavaMergeShardsRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardToMerge.foreach(result.setShardToMerge)
      self.adjacentShardToMerge.foreach(result.setAdjacentShardToMerge)
      result
    }
  }

}
