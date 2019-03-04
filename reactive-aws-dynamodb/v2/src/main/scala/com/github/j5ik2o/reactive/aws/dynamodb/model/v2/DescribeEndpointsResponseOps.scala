package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeEndpointsResponse => ScalaDescribeEndpointsResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeEndpointsResponse => JavaDescribeEndpointsResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeEndpointsResponseOps {

  import EndpointOps._

  implicit class JavaDescribeEndpointsResponseOps(val self: JavaDescribeEndpointsResponse) extends AnyVal {

    def toScala: ScalaDescribeEndpointsResponse = {
      ScalaDescribeEndpointsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withEndpoints(Option(self.endpoints).map(_.asScala.map(_.toScala)))
    }

  }
}
