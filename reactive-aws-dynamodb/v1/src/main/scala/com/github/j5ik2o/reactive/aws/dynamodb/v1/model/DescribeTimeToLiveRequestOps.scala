// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTimeToLiveRequest => ScalaDescribeTimeToLiveRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeTimeToLiveRequest => JavaDescribeTimeToLiveRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTimeToLiveRequestOps {

  implicit class ScalaDescribeTimeToLiveRequestOps(val self: ScalaDescribeTimeToLiveRequest) extends AnyVal {

    def toJava: JavaDescribeTimeToLiveRequest = {
      val result = new JavaDescribeTimeToLiveRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String

      result
    }

  }

}
