// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsRequest => ScalaMergeShardsRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ MergeShardsRequest => JavaMergeShardsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MergeShardsRequestOps {

  implicit class ScalaMergeShardsRequestOps(val self: ScalaMergeShardsRequest) extends AnyVal {

    def toJava: JavaMergeShardsRequest = {
      val result = JavaMergeShardsRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                     // String
      self.shardToMerge.filter(_.nonEmpty).foreach(v => result.shardToMerge(v))                 // String
      self.adjacentShardToMerge.filter(_.nonEmpty).foreach(v => result.adjacentShardToMerge(v)) // String

      result.build()
    }

  }

}
