package com.github.j5ik2o.reactive.dynamodb.model.v2

import com.github.j5ik2o.reactive.dynamodb.model.{ UpdateTimeToLiveResponse => ScalaUpdateTimeToLiveResponse }
import software.amazon.awssdk.services.dynamodb.model.{ UpdateTimeToLiveResponse => JavaUpdateTimeToLiveResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object UpdateTimeToLiveResponseOps {

  import TimeToLiveSpecificationOps._

  implicit class JavaUpdateTimeToLiveResponseOps(val self: JavaUpdateTimeToLiveResponse) extends AnyVal {

    def toScala: ScalaUpdateTimeToLiveResponse = {
      ScalaUpdateTimeToLiveResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTimeToLiveSpecification(
          Option(self.timeToLiveSpecification).map(_.toScala)
        )
    }

  }

}
