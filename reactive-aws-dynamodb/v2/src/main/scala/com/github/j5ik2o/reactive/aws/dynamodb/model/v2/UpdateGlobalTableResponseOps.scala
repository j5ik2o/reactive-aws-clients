package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableResponse => ScalaUpdateGlobalTableResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateGlobalTableResponse => JavaUpdateGlobalTableResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableResponseOps {

  implicit class JavaUpdateGlobalTableResponseOps(val self: JavaUpdateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableResponse = {
      ScalaUpdateGlobalTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
            .withGlobalTableDescription(Option(self.globalTableDescription).map{ v => import GlobalTableDescriptionOps._; v.toScala}) // GlobalTableDescription, Map-12
    }

  }

}