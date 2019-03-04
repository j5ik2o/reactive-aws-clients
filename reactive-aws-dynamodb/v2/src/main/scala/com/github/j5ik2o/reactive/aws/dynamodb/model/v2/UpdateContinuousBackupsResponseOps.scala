package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  UpdateContinuousBackupsResponse => ScalaUpdateContinuousBackupsResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  UpdateContinuousBackupsResponse => JavaUpdateContinuousBackupsResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateContinuousBackupsResponseOps {

  import ContinuousBackupsDescriptionOps._

  implicit class JavaUpdateContinuousBackupsResponseOps(val self: JavaUpdateContinuousBackupsResponse) extends AnyVal {

    def toScala: ScalaUpdateContinuousBackupsResponse = {
      ScalaUpdateContinuousBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withContinuousBackupsDescription(Option(self.continuousBackupsDescription).map(_.toScala))
    }

  }

}
