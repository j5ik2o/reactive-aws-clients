package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateContinuousBackupsResponse => ScalaUpdateContinuousBackupsResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateContinuousBackupsResponse => JavaUpdateContinuousBackupsResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateContinuousBackupsResponseOps {

  implicit class JavaUpdateContinuousBackupsResponseOps(val self: JavaUpdateContinuousBackupsResponse) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsResponse = {
      ScalaUpdateContinuousBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withContinuousBackupsDescription(Option(self.continuousBackupsDescription).map { v =>
          import ContinuousBackupsDescriptionOps._; v.toScala
        }) // ContinuousBackupsDescription
    }

  }

}
