package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeTimeToLiveResponse => ScalaDescribeTimeToLiveResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTimeToLiveResponse => JavaDescribeTimeToLiveResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTimeToLiveResponseOps {

  implicit class JavaDescribeTimeToLiveResponseOps(val self: JavaDescribeTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaDescribeTimeToLiveResponse = {
      ScalaDescribeTimeToLiveResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTimeToLiveDescription(Option(self.timeToLiveDescription).map { v =>
          import TimeToLiveDescriptionOps._; v.toScala
        }) // TimeToLiveDescription
    }

  }

}
