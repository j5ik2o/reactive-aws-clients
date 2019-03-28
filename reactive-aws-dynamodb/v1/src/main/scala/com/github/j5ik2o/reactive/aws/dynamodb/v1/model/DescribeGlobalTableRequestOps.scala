// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableRequest => ScalaDescribeGlobalTableRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ DescribeGlobalTableRequest => JavaDescribeGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableRequestOps {

  implicit class ScalaDescribeGlobalTableRequestOps(val self: ScalaDescribeGlobalTableRequest) extends AnyVal {

    def toJava: JavaDescribeGlobalTableRequest = {
      val result = new JavaDescribeGlobalTableRequest()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String

      result
    }

  }

}
