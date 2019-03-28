// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  DescribeStreamConsumerResponse => ScalaDescribeStreamConsumerResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  DescribeStreamConsumerResponse => JavaDescribeStreamConsumerResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeStreamConsumerResponseOps {

  implicit class JavaDescribeStreamConsumerResponseOps(val self: JavaDescribeStreamConsumerResponse) extends AnyVal {

    def toScala: ScalaDescribeStreamConsumerResponse = {
      ScalaDescribeStreamConsumerResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withConsumerDescription(Option(self.consumerDescription).map { v =>
          import ConsumerDescriptionOps._; v.toScala
        }) // ConsumerDescription
    }

  }

}
