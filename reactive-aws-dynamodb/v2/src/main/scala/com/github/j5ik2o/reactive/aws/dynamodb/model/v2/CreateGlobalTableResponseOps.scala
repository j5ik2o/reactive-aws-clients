package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateGlobalTableResponse => ScalaCreateGlobalTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ CreateGlobalTableResponse => JavaCreateGlobalTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object CreateGlobalTableResponseOps {

  import GlobalTableDescriptionOps._

  implicit class JavaCreateGlobalTableResponseOps(val self: JavaCreateGlobalTableResponse) {

    def toScala: ScalaCreateGlobalTableResponse = {
      ScalaCreateGlobalTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withGlobalTableDescription(Option(self.globalTableDescription).map(_.toScala))
    }

  }
}
