package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerRequest => ScalaDescribeStreamConsumerRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamConsumerRequest => JavaDescribeStreamConsumerRequest
}

object DescribeStreamConsumerRequestOps {

  implicit class ScalaDescribeStreamConsumerRequestOps(val self: ScalaDescribeStreamConsumerRequest) extends AnyVal {

    def toJava: JavaDescribeStreamConsumerRequest = {
      val result = JavaDescribeStreamConsumerRequest.builder()
      self.streamARN.foreach(result.streamARN)
      self.consumerName.foreach(result.consumerName)
      self.consumerARN.foreach(result.consumerARN)
      result.build()
    }

  }

}
