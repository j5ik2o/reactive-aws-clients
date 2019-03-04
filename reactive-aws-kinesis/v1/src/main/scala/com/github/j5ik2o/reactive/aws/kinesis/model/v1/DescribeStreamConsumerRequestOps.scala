package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamConsumerRequest => JavaDescribeStreamConsumerRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeStreamConsumerRequest => ScalaDescribeStreamConsumerRequest }

object DescribeStreamConsumerRequestOps {

  implicit class ScalaDescribeStreamConsumerRequestOps(val self: ScalaDescribeStreamConsumerRequest) extends AnyVal {

    def toJava: JavaDescribeStreamConsumerRequest = {
      val result = new JavaDescribeStreamConsumerRequest()
      self.streamARN.foreach(result.setStreamARN)
      self.consumerName.foreach(result.setConsumerName)
      self.consumerARN.foreach(result.setConsumerARN)
      result
    }

  }

}
