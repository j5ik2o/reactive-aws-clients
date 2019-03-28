// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DescribeTableRequest => ScalaDescribeTableRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DescribeTableRequest => JavaDescribeTableRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeTableRequestOps {

  implicit class ScalaDescribeTableRequestOps(val self: ScalaDescribeTableRequest) extends AnyVal {

    def toJava: JavaDescribeTableRequest = {
      val result = JavaDescribeTableRequest.builder()
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v)) // String

      result.build()
    }

  }

}
