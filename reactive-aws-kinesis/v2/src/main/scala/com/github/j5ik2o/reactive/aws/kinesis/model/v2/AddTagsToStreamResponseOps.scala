package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamResponse => ScalaAddTagsToStreamResponse }
import software.amazon.awssdk.services.kinesis.model.{ AddTagsToStreamResponse => JavaAddTagsToStreamResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object AddTagsToStreamResponseOps {

  implicit class JavaAddTagsToStreamResponseOps(val self: JavaAddTagsToStreamResponse) extends AnyVal {

    def toScala: ScalaAddTagsToStreamResponse = {
      ScalaAddTagsToStreamResponse()
        .withStatusCode(Some(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Some(self.sdkHttpResponse().headers().asScala.toMap.mapValues(_.asScala)))
    }

  }

}
