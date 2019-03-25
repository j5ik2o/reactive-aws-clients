package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableResponse => ScalaDeleteTableResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ DeleteTableResponse => JavaDeleteTableResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteTableResponseOps {

  implicit class JavaDeleteTableResponseOps(val self: JavaDeleteTableResponse) extends AnyVal {

    def toScala: ScalaDeleteTableResponse = {
      ScalaDeleteTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableDescription(Option(self.tableDescription).map { v =>
          v.toScala
        }) // TableDescription, Map-12
    }

  }

}
