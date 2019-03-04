package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeEndpointsRequest => ScalaDescribeEndpointsRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeEndpointsRequest => JavaDescribeEndpointsRequest }

object DescribeEndpointsRequestOps {

  implicit class ScalaDescribeEndpointsRequestOps(val self: ScalaDescribeEndpointsRequest) extends AnyVal {

    def toJava: JavaDescribeEndpointsRequest = {
      val result = JavaDescribeEndpointsRequest.builder()
      result.build()
    }

  }

  implicit class JavaDescribeEndpointsRequestOps(val self: JavaDescribeEndpointsRequest) extends AnyVal {

    def toScala: ScalaDescribeEndpointsRequest = {
      ScalaDescribeEndpointsRequest()
    }

  }

}
