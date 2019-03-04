package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ DescribeGlobalTableRequest => JavaDescribeGlobalTableRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeGlobalTableRequest => ScalaDescribeGlobalTableRequest }

object DescribeGlobalTableRequestOps {

  implicit class ScalaDescribeGlobalTableRequestOps(val self: ScalaDescribeGlobalTableRequest) extends AnyVal {

    def toJava: JavaDescribeGlobalTableRequest = {
      val result = new JavaDescribeGlobalTableRequest()
      self.globalTableName.foreach(result.setGlobalTableName)
      result
    }

  }

  implicit class JavaDescribeGlobalTableRequestOps(val self: JavaDescribeGlobalTableRequest) extends AnyVal {

    def toScala: ScalaDescribeGlobalTableRequest = {
      ScalaDescribeGlobalTableRequest().withGlobalTableName(Option(self.getGlobalTableName))
    }

  }

}
