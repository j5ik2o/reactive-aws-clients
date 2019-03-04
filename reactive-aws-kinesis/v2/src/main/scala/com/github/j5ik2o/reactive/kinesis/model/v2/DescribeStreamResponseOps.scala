package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ DescribeStreamResponse => ScalaDescribeStreamResponse }
import software.amazon.awssdk.services.kinesis.model.{ DescribeStreamResponse => JavaDescribeStreamResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeStreamResponseOps {

  import StreamDescriptionOps._

  implicit class JavaDescribeStreamResponseOps(val self: JavaDescribeStreamResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamResponse = {
      ScalaDescribeStreamResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamDescription(Option(self.streamDescription()).map(_.toScala))
    }

  }

}
