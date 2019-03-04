package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamSummaryRequest => ScalaDescribeStreamSummaryRequest
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamSummaryRequest => JavaDescribeStreamSummaryRequest
}

object DescribeStreamSummaryRequestOps {

  implicit class ScalaDescribeStreamSummaryRequestOps(val self: ScalaDescribeStreamSummaryRequest) extends AnyVal {

    def toJava: JavaDescribeStreamSummaryRequest = {
      val result = JavaDescribeStreamSummaryRequest.builder()
      self.streamName.foreach(result.streamName)
      result.build()
    }

  }

}
