package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeTimeToLiveRequest => ScalaDescribeTimeToLiveRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTimeToLiveRequest => JavaDescribeTimeToLiveRequest }

object DescribeTimeToLiveRequestOps {

  implicit class ScalaDescribeTimeToLiveRequestOps(val self: ScalaDescribeTimeToLiveRequest) extends AnyVal {

    def toJava: JavaDescribeTimeToLiveRequest = {
      val result = JavaDescribeTimeToLiveRequest.builder()
      self.tableName.foreach(result.tableName)
      result.build()
    }

  }

  implicit class JavaDescribeTimeToLiveRequestOps(val self: JavaDescribeTimeToLiveRequest) extends AnyVal {

    def toScala: ScalaDescribeTimeToLiveRequest = {
      ScalaDescribeTimeToLiveRequest().withTableName(Option(self.tableName))
    }

  }

}
