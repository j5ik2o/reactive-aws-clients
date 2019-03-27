// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableRequest => ScalaDescribeTableRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ DescribeTableRequest => JavaDescribeTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTableRequestOps {

  implicit class ScalaDescribeTableRequestOps(val self: ScalaDescribeTableRequest) extends AnyVal {

    def toJava: JavaDescribeTableRequest = {
      val result = new JavaDescribeTableRequest()
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v)) // String

      result
    }

  }

}
