package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ TagResourceResponse => ScalaTagResourceResponse }
import software.amazon.awssdk.services.dynamodb.model.{ TagResourceResponse => JavaTagResourceResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object TagResourceResponseOps {

  implicit class JavaTagResourceResponseOps(val self: JavaTagResourceResponse) extends AnyVal {

    def toScala: ScalaTagResourceResponse = {
      ScalaTagResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
    }

  }

}
