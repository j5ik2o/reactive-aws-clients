package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeEndpointsResponse => ScalaDescribeEndpointsResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeEndpointsResponse => JavaDescribeEndpointsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeEndpointsResponseOps {

  implicit class JavaDescribeEndpointsResponseOps(val self: JavaDescribeEndpointsResponse) extends AnyVal {

    def toScala: ScalaDescribeEndpointsResponse = {
      ScalaDescribeEndpointsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
                    .withEndpoints(Option(self.endpoints).map{ v => import scala.collection.JavaConverters._, EndpointOps._; v.asScala.map(_.toScala)}) // Seq[Endpoint], Seq-6
    }

  }

}