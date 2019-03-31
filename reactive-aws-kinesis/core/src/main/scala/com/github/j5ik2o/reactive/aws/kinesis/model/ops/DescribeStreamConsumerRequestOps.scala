// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerRequest => ScalaDescribeStreamConsumerRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamConsumerRequest => JavaDescribeStreamConsumerRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamConsumerRequestOps {

  implicit class ScalaDescribeStreamConsumerRequestOps(val self: ScalaDescribeStreamConsumerRequest) extends AnyVal {

    def toJava: JavaDescribeStreamConsumerRequest = {
      val result = JavaDescribeStreamConsumerRequest.builder()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.streamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.consumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.consumerARN(v))   // String

      result.build()
    }

  }

}
