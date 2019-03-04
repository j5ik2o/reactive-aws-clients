package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTimeToLiveResponse => ScalaDescribeTimeToLiveResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTimeToLiveResponse => JavaDescribeTimeToLiveResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeTimeToLiveResponseOps {

  import TimeToLiveDescriptionOps._

  implicit class JavaDescribeTimeToLiveResponseOps(val self: JavaDescribeTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaDescribeTimeToLiveResponse = {
      ScalaDescribeTimeToLiveResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTimeToLiveDescription(Option(self.timeToLiveDescription).map(_.toScala))
    }

  }

}
