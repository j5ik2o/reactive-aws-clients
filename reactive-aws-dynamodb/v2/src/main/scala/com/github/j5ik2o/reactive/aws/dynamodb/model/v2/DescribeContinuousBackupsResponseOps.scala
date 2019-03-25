package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DescribeContinuousBackupsResponse => ScalaDescribeContinuousBackupsResponse,
  _
}
import software.amazon.awssdk.services.dynamodb.model.{
  DescribeContinuousBackupsResponse => JavaDescribeContinuousBackupsResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DescribeContinuousBackupsResponseOps {

  implicit class JavaDescribeContinuousBackupsResponseOps(val self: JavaDescribeContinuousBackupsResponse)
      extends AnyVal {

    def toScala: ScalaDescribeContinuousBackupsResponse = {
      ScalaDescribeContinuousBackupsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withContinuousBackupsDescription(Option(self.continuousBackupsDescription).map { v =>
          import ContinuousBackupsDescriptionOps._; v.toScala
        }) // ContinuousBackupsDescription
    }

  }

}
