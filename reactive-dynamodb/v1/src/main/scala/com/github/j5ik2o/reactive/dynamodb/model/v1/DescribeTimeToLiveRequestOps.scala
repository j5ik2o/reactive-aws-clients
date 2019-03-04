package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeTimeToLiveRequest => JavaDescribeTimeToLiveRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeTimeToLiveRequest => ScalaDescribeTimeToLiveRequest }

object DescribeTimeToLiveRequestOps {

  implicit class ScalaDescribeTimeToLiveRequestOps(val self: ScalaDescribeTimeToLiveRequest) extends AnyVal {

    def toJava: JavaDescribeTimeToLiveRequest = {
      val result = new JavaDescribeTimeToLiveRequest()
      self.tableName.foreach(result.setTableName)
      result
    }

  }

  implicit class JavaDescribeTimeToLiveRequestOps(val self: JavaDescribeTimeToLiveRequest) extends AnyVal {

    def toScala: ScalaDescribeTimeToLiveRequest = {
      ScalaDescribeTimeToLiveRequest().withTableName(Option(self.getTableName))
    }

  }

}
