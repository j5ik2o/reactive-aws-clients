// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardRequest => ScalaSplitShardRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ SplitShardRequest => JavaSplitShardRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SplitShardRequestOps {

  implicit class ScalaSplitShardRequestOps(val self: ScalaSplitShardRequest) extends AnyVal {

    def toJava: JavaSplitShardRequest = {
      val result = JavaSplitShardRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))                 // String
      self.shardToSplit.filter(_.nonEmpty).foreach(v => result.shardToSplit(v))             // String
      self.newStartingHashKey.filter(_.nonEmpty).foreach(v => result.newStartingHashKey(v)) // String

      result.build()
    }

  }

}
