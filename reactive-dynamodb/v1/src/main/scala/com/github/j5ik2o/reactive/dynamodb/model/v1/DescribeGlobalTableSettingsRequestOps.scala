package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{
  DescribeGlobalTableSettingsRequest => JavaDescribeGlobalTableSettingsRequest
}
import com.github.j5ik2o.reactive.dynamodb.model.{
  DescribeGlobalTableSettingsRequest => ScalaDescribeGlobalTableSettingsRequest
}

object DescribeGlobalTableSettingsRequestOps {

  implicit class ScalaDescribeGlobalTableSettingsRequestOps(val self: ScalaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toJava: JavaDescribeGlobalTableSettingsRequest = {
      val result = new JavaDescribeGlobalTableSettingsRequest
      self.globalTableName.foreach(result.setGlobalTableName)
      result
    }

  }

  implicit class JavaDescribeGlobalTableSettingsRequestOps(val self: JavaDescribeGlobalTableSettingsRequest)
      extends AnyVal {

    def toScala: ScalaDescribeGlobalTableSettingsRequest = {
      ScalaDescribeGlobalTableSettingsRequest().withGlobalTableName(Option(self.getGlobalTableName))
    }

  }

}
