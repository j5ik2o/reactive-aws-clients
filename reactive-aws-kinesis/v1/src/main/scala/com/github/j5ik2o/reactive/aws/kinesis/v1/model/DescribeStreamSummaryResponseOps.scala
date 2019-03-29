// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamSummaryResponse => ScalaDescribeStreamSummaryResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ DescribeStreamSummaryResult => JavaDescribeStreamSummaryResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamSummaryResponseOps {

  implicit class JavaDescribeStreamSummaryResponseOps(val self: JavaDescribeStreamSummaryResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamSummaryResponse = {
      ScalaDescribeStreamSummaryResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamDescriptionSummary(Option(self.getStreamDescriptionSummary).map { v =>
          import StreamDescriptionSummaryOps._; v.toScala
        }) // StreamDescriptionSummary
    }

  }

}
