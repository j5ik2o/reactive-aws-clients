package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamRequest => JavaDescribeStreamRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ DescribeStreamRequest => ScalaDescribeStreamRequest }

object DescribeStreamRequestOps {

  implicit class ScalaDescribeStreamRequestOps(val self: ScalaDescribeStreamRequest) extends AnyVal {

    def toJava: JavaDescribeStreamRequest = {
      val result = new JavaDescribeStreamRequest()
      self.streamName.foreach(result.setStreamName)
      self.limit.foreach(v => result.setLimit(v))
      self.exclusiveStartShardId.foreach(result.setExclusiveStartShardId)
      result
    }

  }

}
