package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ MergeShardsRequest => ScalaMergeShardsRequest }
import software.amazon.awssdk.services.kinesis.model.{ MergeShardsRequest => JavaMergeShardsRequest }

object MergeShardsRequestOps {

  implicit class ScalaMergeShardsRequestOps(val self: ScalaMergeShardsRequest) extends AnyVal {
    def toJava: JavaMergeShardsRequest = {
      val result = JavaMergeShardsRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardToMerge.foreach(result.shardToMerge)
      self.adjacentShardToMerge.foreach(result.adjacentShardToMerge)
      result.build()
    }
  }

}
