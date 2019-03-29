// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerRequest => ScalaDescribeStreamConsumerRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ DescribeStreamConsumerRequest => JavaDescribeStreamConsumerRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamConsumerRequestOps {

  implicit class ScalaDescribeStreamConsumerRequestOps(val self: ScalaDescribeStreamConsumerRequest) extends AnyVal {

    def toJava: JavaDescribeStreamConsumerRequest = {
      val result = new JavaDescribeStreamConsumerRequest()
      self.streamARN.filter(_.nonEmpty).foreach(v => result.withStreamARN(v))       // String
      self.consumerName.filter(_.nonEmpty).foreach(v => result.withConsumerName(v)) // String
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.withConsumerARN(v))   // String

      result
    }

  }

}
