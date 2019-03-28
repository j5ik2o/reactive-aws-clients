// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableRequest => ScalaDescribeGlobalTableRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{ DescribeGlobalTableRequest => JavaDescribeGlobalTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableRequestOps {

  implicit class ScalaDescribeGlobalTableRequestOps(val self: ScalaDescribeGlobalTableRequest) extends AnyVal {

    def toJava: JavaDescribeGlobalTableRequest = {
      val result = JavaDescribeGlobalTableRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String

      result.build()
    }

  }

}
