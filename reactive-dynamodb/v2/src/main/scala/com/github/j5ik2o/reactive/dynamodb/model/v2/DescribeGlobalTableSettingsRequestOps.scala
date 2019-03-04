package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => ScalaDescribeGlobalTableSettingsRequest
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => JavaDescribeGlobalTableSettingsRequest
}

object DescribeGlobalTableSettingsRequestOps {

  implicit class ScalaDescribeGlobalTableSettingsRequestOps(val self: ScalaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaDescribeGlobalTableSettingsRequest = {
      val result = JavaDescribeGlobalTableSettingsRequest.builder()
      self.globalTableName.foreach(result.globalTableName)
      result.build()
    }

  }

  implicit class JavaDescribeGlobalTableSettingsRequestOps(val self: JavaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toScala: ScalaDescribeGlobalTableSettingsRequest = {
      ScalaDescribeGlobalTableSettingsRequest().withGlobalTableName(Option(self.globalTableName))
    }

  }

}
