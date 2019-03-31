// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeEndpointsRequest => ScalaDescribeEndpointsRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeEndpointsRequest => JavaDescribeEndpointsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeEndpointsRequestOps {

  implicit class ScalaDescribeEndpointsRequestOps(val self: ScalaDescribeEndpointsRequest) extends AnyVal {

    def toJava: JavaDescribeEndpointsRequest = {
      val result = JavaDescribeEndpointsRequest.builder()

      result.build()
    }

  }

}
