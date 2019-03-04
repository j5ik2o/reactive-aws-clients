package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ ListShardsRequest => JavaListShardsRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListShardsRequest => ScalaListShardsRequest }

object ListShardsRequestOps {

  implicit class ScalaListShardsRequestOps(val self: ScalaListShardsRequest) extends AnyVal {

    def toJava: JavaListShardsRequest = {
      val result = new JavaListShardsRequest()
      self.streamName.foreach(result.setStreamName)
      self.nextToken.foreach(result.setNextToken)
      self.exclusiveStartShardId.foreach(result.setExclusiveStartShardId)
      self.maxResults.foreach(v => result.setMaxResults(v))
      self.streamCreationTimestamp.map(Date.from).foreach(result.setStreamCreationTimestamp)
      result
    }

  }

}
