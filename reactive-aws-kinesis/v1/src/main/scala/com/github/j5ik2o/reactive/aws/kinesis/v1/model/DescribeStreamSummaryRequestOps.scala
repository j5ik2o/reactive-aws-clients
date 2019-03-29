// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamSummaryRequest => ScalaDescribeStreamSummaryRequest,
  _
}
import com.amazonaws.services.kinesis.model.{ DescribeStreamSummaryRequest => JavaDescribeStreamSummaryRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamSummaryRequestOps {

  implicit class ScalaDescribeStreamSummaryRequestOps(val self: ScalaDescribeStreamSummaryRequest) extends AnyVal {

    def toJava: JavaDescribeStreamSummaryRequest = {
      val result = new JavaDescribeStreamSummaryRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String

      result
    }

  }

}
