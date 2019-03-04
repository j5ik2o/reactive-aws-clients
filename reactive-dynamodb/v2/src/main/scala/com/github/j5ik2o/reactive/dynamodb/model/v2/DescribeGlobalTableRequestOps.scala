package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeGlobalTableRequest => ScalaDescribeGlobalTableRequest }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeGlobalTableRequest => JavaDescribeGlobalTableRequest }

object DescribeGlobalTableRequestOps {

  implicit class ScalaDescribeGlobalTableRequestOps(val self: ScalaDescribeGlobalTableRequest) extends AnyVal {

    def toJava: JavaDescribeGlobalTableRequest = {
      val result = JavaDescribeGlobalTableRequest.builder()
      self.globalTableName.foreach(result.globalTableName)
      result.build()
    }

  }

  implicit class JavaDescribeGlobalTableRequestOps(val self: JavaDescribeGlobalTableRequest) extends AnyVal {

    def toScala: ScalaDescribeGlobalTableRequest = {
      ScalaDescribeGlobalTableRequest().withGlobalTableName(Option(self.globalTableName))
    }

  }

}
