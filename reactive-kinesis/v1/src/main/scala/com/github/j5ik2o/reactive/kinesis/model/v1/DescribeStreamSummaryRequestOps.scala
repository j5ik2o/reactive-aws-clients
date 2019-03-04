package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamSummaryRequest => JavaDescribeStreamSummaryRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ DescribeStreamSummaryRequest => ScalaDescribeStreamSummaryRequest }

object DescribeStreamSummaryRequestOps {

  implicit class ScalaDescribeStreamSummaryRequestOps(val self: ScalaDescribeStreamSummaryRequest) extends AnyVal {

    def toJava: JavaDescribeStreamSummaryRequest = {
      val result = new JavaDescribeStreamSummaryRequest()
      self.streamName.foreach(result.setStreamName)
      result
    }

  }

}
