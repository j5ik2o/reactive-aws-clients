package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{
  DescribeContinuousBackupsResponse => ScalaDescribeContinuousBackupsResponse
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeContinuousBackupsResponse => JavaDescribeContinuousBackupsResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object DescribeContinuousBackupsResponseOps {

  import ContinuousBackupsDescriptionOps._

  implicit class JavaDescribeContinuousBackupsResponseOps(val self: JavaDescribeContinuousBackupsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsResponse = {
      ScalaDescribeContinuousBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withContinuousBackupsDescription(
          Option(self.continuousBackupsDescription).map(_.toScala)
        )
    }

  }

}
