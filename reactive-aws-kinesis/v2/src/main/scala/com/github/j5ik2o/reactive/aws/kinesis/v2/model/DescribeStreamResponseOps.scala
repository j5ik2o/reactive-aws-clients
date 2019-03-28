// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ DescribeStreamResponse => ScalaDescribeStreamResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ DescribeStreamResponse => JavaDescribeStreamResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamResponseOps {

  implicit class JavaDescribeStreamResponseOps(val self: JavaDescribeStreamResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamResponse = {
      ScalaDescribeStreamResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withStreamDescription(Option(self.streamDescription).map { v =>
          import StreamDescriptionOps._; v.toScala
        }) // StreamDescription
    }

  }

}
