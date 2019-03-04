package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeEndpointsRequest => JavaDescribeEndpointsRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeEndpointsRequest => ScalaDescribeEndpointsRequest }

object DescribeEndpointsRequestOps {

  implicit class ScalaDescribeEndpointsRequestOps(val self: ScalaDescribeEndpointsRequest) extends AnyVal {

    def toJava: JavaDescribeEndpointsRequest = {
      val result = new JavaDescribeEndpointsRequest
      result
    }

  }

  implicit class JavaDescribeEndpointsRequestOps(val self: JavaDescribeEndpointsRequest) extends AnyVal {

    def toScala: ScalaDescribeEndpointsRequest = {
      ScalaDescribeEndpointsRequest()
    }

  }

}
