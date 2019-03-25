package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  RestoreTableToPointInTimeResponse => ScalaRestoreTableToPointInTimeResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableToPointInTimeResponse => JavaRestoreTableToPointInTimeResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreTableToPointInTimeResponseOps {

  implicit class JavaRestoreTableToPointInTimeResponseOps(val self: JavaRestoreTableToPointInTimeResponse)
      extends AnyVal {

    def toScala: ScalaRestoreTableToPointInTimeResponse = {
      ScalaRestoreTableToPointInTimeResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTableDescription(Option(self.tableDescription).map { v =>
          v.toScala
        }) // TableDescription, Map-12
    }

  }

}
