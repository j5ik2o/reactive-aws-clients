package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateGlobalTableResponse => ScalaUpdateGlobalTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableResponse => JavaUpdateGlobalTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateGlobalTableResponseOps {

  import GlobalTableDescriptionOps._

  implicit class JavaUpdateGlobalTableResponseOps(val self: JavaUpdateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableResponse = {
      ScalaUpdateGlobalTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withGlobalTableDescription(Option(self.globalTableDescription).map(_.toScala))
    }

  }

}
