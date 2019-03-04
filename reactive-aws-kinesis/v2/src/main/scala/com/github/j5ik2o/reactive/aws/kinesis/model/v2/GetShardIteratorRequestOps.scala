package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest }
import software.amazon.awssdk.services.kinesis.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }

object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = JavaGetShardIteratorRequest.builder()
      self.streamName.foreach(result.streamName)
      self.shardId.foreach(result.shardId)
      self.shardIteratorType.map(_.entryName).foreach(result.shardIteratorType)
      self.startingSequenceNumber.foreach(result.startingSequenceNumber)
      self.timestamp.foreach(result.timestamp)
      result.build()
    }

  }

}
