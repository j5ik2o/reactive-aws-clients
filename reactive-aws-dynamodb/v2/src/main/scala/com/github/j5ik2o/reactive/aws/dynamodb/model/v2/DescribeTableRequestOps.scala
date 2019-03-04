package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableRequest => ScalaDescribeTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTableRequest => JavaDescribeTableRequest }

object DescribeTableRequestOps {

  implicit class ScalaDescribeTableRequestOps(val self: ScalaDescribeTableRequest) extends AnyVal {

    def toJava: JavaDescribeTableRequest = {
      val result = JavaDescribeTableRequest.builder()
      self.tableName.foreach(result.tableName)
      result.build()
    }

  }

  implicit class JavaDescribeTableRequestOps(val self: JavaDescribeTableRequest) extends AnyVal {

    def toScala: ScalaDescribeTableRequest = {
      ScalaDescribeTableRequest().withTableName(Option(self.tableName))
    }
  }

}
