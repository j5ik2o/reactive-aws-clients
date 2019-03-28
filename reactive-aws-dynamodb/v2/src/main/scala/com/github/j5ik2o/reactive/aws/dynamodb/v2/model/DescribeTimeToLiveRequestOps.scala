// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTimeToLiveRequest => ScalaDescribeTimeToLiveRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTimeToLiveRequest => JavaDescribeTimeToLiveRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTimeToLiveRequestOps {

  implicit class ScalaDescribeTimeToLiveRequestOps(val self: ScalaDescribeTimeToLiveRequest) extends AnyVal {

    def toJava: JavaDescribeTimeToLiveRequest = {
      val result = JavaDescribeTimeToLiveRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String

      result.build()
    }

  }

}
