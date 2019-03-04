package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ DescribeStreamRequest => ScalaDescribeStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ DescribeStreamRequest => JavaDescribeStreamRequest }

object DescribeStreamRequestOps {

  implicit class ScalaDescribeStreamRequestOps(val self: ScalaDescribeStreamRequest) extends AnyVal {

    def toJava: JavaDescribeStreamRequest = {
      val result = JavaDescribeStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.limit.foreach(v => result.limit(v))
      self.exclusiveStartShardId.foreach(result.exclusiveStartShardId)
      result.build()
    }

  }

}
