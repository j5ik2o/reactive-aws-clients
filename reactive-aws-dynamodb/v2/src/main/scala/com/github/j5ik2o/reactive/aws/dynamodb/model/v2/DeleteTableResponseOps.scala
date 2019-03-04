package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableResponse => ScalaDeleteTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteTableResponse => JavaDeleteTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DeleteTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaDeleteTableResponseOps(val self: JavaDeleteTableResponse) extends AnyVal {

    def toScala: ScalaDeleteTableResponse = {
      ScalaDeleteTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTableDescription(Option(self.tableDescription).map(_.toScala))
    }

  }

}
