// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsRequest => ScalaMergeShardsRequest, _ }
import com.amazonaws.services.kinesis.model.{ MergeShardsRequest => JavaMergeShardsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MergeShardsRequestOps {

  implicit class ScalaMergeShardsRequestOps(val self: ScalaMergeShardsRequest) extends AnyVal {

    def toJava: JavaMergeShardsRequest = {
      val result = new JavaMergeShardsRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                     // String
      self.shardToMerge.filter(_.nonEmpty).foreach(v => result.withShardToMerge(v))                 // String
      self.adjacentShardToMerge.filter(_.nonEmpty).foreach(v => result.withAdjacentShardToMerge(v)) // String

      result
    }

  }

}
