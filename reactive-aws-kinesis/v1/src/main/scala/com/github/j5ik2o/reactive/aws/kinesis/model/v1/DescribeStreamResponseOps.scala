package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ DescribeStreamResult => JavaDescribeStreamResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeStreamResponse => ScalaDescribeStreamResponse }

import scala.collection.JavaConverters._

object DescribeStreamResponseOps {

  import StreamDescriptionOps._

  implicit class JavaDescribeStreamResponseOps(val self: JavaDescribeStreamResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamResponse = {
      ScalaDescribeStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreamDescription(Option(self.getStreamDescription).map(_.toScala))
    }

  }

}
