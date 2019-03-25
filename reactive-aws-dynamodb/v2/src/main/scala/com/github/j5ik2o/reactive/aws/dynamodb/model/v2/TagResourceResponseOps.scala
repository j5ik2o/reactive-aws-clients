package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceResponse => ScalaTagResourceResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TagResourceResponse => JavaTagResourceResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TagResourceResponseOps {

  implicit class JavaTagResourceResponseOps(val self: JavaTagResourceResponse) extends AnyVal {

    def toScala: ScalaTagResourceResponse = {
      ScalaTagResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }

  }

}