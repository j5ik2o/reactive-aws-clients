package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ CreateTableResponse => ScalaCreateTableResponse }
import software.amazon.awssdk.services.dynamodb.model.{ CreateTableResponse => JavaCreateTableResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object CreateTableResponseOps {

  import TableDescriptionOps._

  implicit class JavaCreateTableResponseOps(val self: JavaCreateTableResponse) extends AnyVal {

    def toScala: ScalaCreateTableResponse = {
      ScalaCreateTableResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableDescription(Option(self.tableDescription).map(_.toScala))
    }

  }
}
