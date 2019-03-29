// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SplitShardRequest => ScalaSplitShardRequest, _ }
import com.amazonaws.services.kinesis.model.{ SplitShardRequest => JavaSplitShardRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SplitShardRequestOps {

  implicit class ScalaSplitShardRequestOps(val self: ScalaSplitShardRequest) extends AnyVal {

    def toJava: JavaSplitShardRequest = {
      val result = new JavaSplitShardRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))                 // String
      self.shardToSplit.filter(_.nonEmpty).foreach(v => result.withShardToSplit(v))             // String
      self.newStartingHashKey.filter(_.nonEmpty).foreach(v => result.withNewStartingHashKey(v)) // String

      result
    }

  }

}
