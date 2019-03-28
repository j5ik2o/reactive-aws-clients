// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTableResponse => ScalaUpdateTableResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTableResponse => JavaUpdateTableResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTableResponseOps {

  implicit class JavaUpdateTableResponseOps(val self: JavaUpdateTableResponse) extends AnyVal {

    def toScala: ScalaUpdateTableResponse = {
      ScalaUpdateTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableDescription(Option(self.tableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
