package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeEndpointsResult => JavaDescribeEndpointsResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeEndpointsResponse => ScalaDescribeEndpointsResponse }

import scala.collection.JavaConverters._

object DescribeEndpointsResponseOps {

  import EndpointOps._

  implicit class JavaDescribeEndpointsResponseOps(val self: JavaDescribeEndpointsResponse) extends AnyVal {

    def toScala: ScalaDescribeEndpointsResponse = {
      ScalaDescribeEndpointsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withEndpoints(Option(self.getEndpoints).map(_.asScala.map(_.toScala)))
    }

  }
}
