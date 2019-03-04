package com.github.j5ik2o.reactive.kinesis.model.v1

import java.util.Date

import com.amazonaws.services.kinesis.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest }

object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = new JavaGetShardIteratorRequest()
      self.streamName.foreach(result.setStreamName)
      self.shardId.foreach(result.setShardId)
      self.shardIteratorType.map(_.entryName).foreach(result.setShardIteratorType)
      self.startingSequenceNumber.foreach(result.setStartingSequenceNumber)
      self.timestamp.map(Date.from).foreach(result.setTimestamp)
      result
    }

  }

}
