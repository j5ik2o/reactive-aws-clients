package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateTableResponse => ScalaUpdateTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTableResponse => JavaUpdateTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaUpdateTableResponseOps(val self: JavaUpdateTableResponse) extends AnyVal {

    def toScala: ScalaUpdateTableResponse = {
      ScalaUpdateTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTableDescription(Option(self.tableDescription).map(_.toScala))
    }
  }

}
