package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  RestoreTableToPointInTimeResponse => ScalaRestoreTableToPointInTimeResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  RestoreTableToPointInTimeResponse => JavaRestoreTableToPointInTimeResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object RestoreTableToPointInTimeResponseOps {

  import TableDescriptionOps._

  implicit class JavaRestoreTableToPointInTimeResponseOps(val self: JavaRestoreTableToPointInTimeResponse)
      extends AnyVal {

    def toScala: ScalaRestoreTableToPointInTimeResponse = {
      ScalaRestoreTableToPointInTimeResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTableDescription(Option(self.tableDescription).map(_.toScala))
    }

  }

}
