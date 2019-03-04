package com.github.j5ik2o.reactive.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ DescribeTableRequest => JavaDescribeTableRequest }
import com.github.j5ik2o.reactive.dynamodb.model.{ DescribeTableRequest => ScalaDescribeTableRequest }

object DescribeTableRequestOps {

  implicit class ScalaDescribeTableRequestOps(val self: ScalaDescribeTableRequest) extends AnyVal {

    def toJava: JavaDescribeTableRequest = {
      val result = new JavaDescribeTableRequest()
      self.tableName.foreach(result.setTableName)
      result
    }

  }

  implicit class JavaDescribeTableRequestOps(val self: JavaDescribeTableRequest) extends AnyVal {

    def toScala: ScalaDescribeTableRequest = {
      ScalaDescribeTableRequest().withTableName(Option(self.getTableName))
    }
  }

}
