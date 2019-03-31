// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamSummaryRequest => ScalaDescribeStreamSummaryRequest,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamSummaryRequest => JavaDescribeStreamSummaryRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamSummaryRequestOps {

  implicit class ScalaDescribeStreamSummaryRequestOps(val self: ScalaDescribeStreamSummaryRequest) extends AnyVal {

    def toJava: JavaDescribeStreamSummaryRequest = {
      val result = JavaDescribeStreamSummaryRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String

      result.build()
    }

  }

}
