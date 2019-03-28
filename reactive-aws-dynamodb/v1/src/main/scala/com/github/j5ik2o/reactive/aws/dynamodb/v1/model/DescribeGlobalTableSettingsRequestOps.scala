// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => ScalaDescribeGlobalTableSettingsRequest,
  _
}
import com.amazonaws.services.dynamodbv2.model.{
  DescribeGlobalTableSettingsRequest => JavaDescribeGlobalTableSettingsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableSettingsRequestOps {

  implicit class ScalaDescribeGlobalTableSettingsRequestOps(val self: ScalaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaDescribeGlobalTableSettingsRequest = {
      val result = new JavaDescribeGlobalTableSettingsRequest()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.withGlobalTableName(v)) // String

      result
    }

  }

}
