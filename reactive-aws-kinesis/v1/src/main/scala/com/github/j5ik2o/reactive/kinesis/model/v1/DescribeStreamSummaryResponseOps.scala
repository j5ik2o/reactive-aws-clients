package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamSummaryResult => JavaDescribeStreamSummaryResponse }
import com.github.j5ik2o.reactive.kinesis.model.{ DescribeStreamSummaryResponse => ScalaDescribeStreamSummaryResponse }

import scala.collection.JavaConverters._
object DescribeStreamSummaryResponseOps {

  import StreamDescriptionSummaryOps._

  implicit class JavaDescribeStreamSummaryResponseOps(val self: JavaDescribeStreamSummaryResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamSummaryResponse = {
      ScalaDescribeStreamSummaryResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamDescriptionSummary(Option(self.getStreamDescriptionSummary).map(_.toScala))
    }

  }

}
