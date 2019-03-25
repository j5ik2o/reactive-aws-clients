package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeStreamResponse => ScalaDescribeStreamResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeStreamResponse => JavaDescribeStreamResponse }

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
          v.toScala
        }) // StreamDescription, Map-12
    }

  }

}
