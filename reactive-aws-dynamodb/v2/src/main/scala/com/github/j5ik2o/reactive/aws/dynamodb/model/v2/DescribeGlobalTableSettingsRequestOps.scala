package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => ScalaDescribeGlobalTableSettingsRequest,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => JavaDescribeGlobalTableSettingsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeGlobalTableSettingsRequestOps {

  implicit class ScalaDescribeGlobalTableSettingsRequestOps(val self: ScalaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaDescribeGlobalTableSettingsRequest = {
      val result = JavaDescribeGlobalTableSettingsRequest.builder()
      self.globalTableName.filter(_.nonEmpty).foreach(v => result.globalTableName(v)) // String

      result.build()
    }

  }

}
