package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsRequest => ScalaListShardsRequest }
import software.amazon.awssdk.services.kinesis.model.{ ListShardsRequest => JavaListShardsRequest }

object ListShardsRequestOps {

  implicit class ScalaListShardsRequestOps(val self: ScalaListShardsRequest) extends AnyVal {

    def toJava: JavaListShardsRequest = {
      val result = JavaListShardsRequest.builder()
      self.streamName.foreach(result.streamName)
      self.nextToken.foreach(result.nextToken)
      self.exclusiveStartShardId.foreach(result.exclusiveStartShardId)
      self.maxResults.foreach(v => result.maxResults(v))
      self.streamCreationTimestamp.foreach(result.streamCreationTimestamp)
      result.build()
    }

  }

}
