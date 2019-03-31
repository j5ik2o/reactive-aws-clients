// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamSummaryResponse => ScalaDescribeStreamSummaryResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamSummaryResponse => JavaDescribeStreamSummaryResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamSummaryResponseOps {

  implicit class JavaDescribeStreamSummaryResponseOps(val self: JavaDescribeStreamSummaryResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamSummaryResponse = {
      ScalaDescribeStreamSummaryResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamDescriptionSummary(Option(self.streamDescriptionSummary).map { v =>
          import StreamDescriptionSummaryOps._; v.toScala
        }) // StreamDescriptionSummary
    }

  }

}
