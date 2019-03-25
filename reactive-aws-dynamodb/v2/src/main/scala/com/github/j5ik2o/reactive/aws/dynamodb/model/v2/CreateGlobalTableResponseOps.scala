package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateGlobalTableResponse => ScalaCreateGlobalTableResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ CreateGlobalTableResponse => JavaCreateGlobalTableResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateGlobalTableResponseOps {

  implicit class JavaCreateGlobalTableResponseOps(val self: JavaCreateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaCreateGlobalTableResponse = {
      ScalaCreateGlobalTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
            .withGlobalTableDescription(Option(self.globalTableDescription).map{ v => import GlobalTableDescriptionOps._; v.toScala}) // GlobalTableDescription, Map-12
    }

  }

}