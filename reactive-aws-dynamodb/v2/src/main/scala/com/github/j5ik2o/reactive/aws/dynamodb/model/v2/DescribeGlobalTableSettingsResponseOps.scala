package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeGlobalTableSettingsResponse => ScalaDescribeGlobalTableSettingsResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeGlobalTableSettingsResponse => JavaDescribeGlobalTableSettingsResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeGlobalTableSettingsResponseOps {

  implicit class JavaDescribeGlobalTableSettingsResponseOps(val self: JavaDescribeGlobalTableSettingsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeGlobalTableSettingsResponse = {
      ScalaDescribeGlobalTableSettingsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withGlobalTableName(Option(self.globalTableName))
    }

  }

}
