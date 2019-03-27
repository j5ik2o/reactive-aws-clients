// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeEndpointsResponse => ScalaDescribeEndpointsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeEndpointsResult => JavaDescribeEndpointsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeEndpointsResponseOps {

  implicit class JavaDescribeEndpointsResponseOps(val self: JavaDescribeEndpointsResponse) extends AnyVal {

    def toScala: ScalaDescribeEndpointsResponse = {
      ScalaDescribeEndpointsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withEndpoints(Option(self.getEndpoints).map { v =>
          import scala.collection.JavaConverters._, EndpointOps._; v.asScala.map(_.toScala)
        }) // Seq[Endpoint]
    }

  }

}
