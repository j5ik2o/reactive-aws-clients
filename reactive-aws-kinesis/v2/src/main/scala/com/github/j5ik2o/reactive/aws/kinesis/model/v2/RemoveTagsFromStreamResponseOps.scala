package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RemoveTagsFromStreamResponse => ScalaRemoveTagsFromStreamResponse
}
import software.amazon.awssdk.services.kinesis.model.{
  RemoveTagsFromStreamResponse => JavaRemoveTagsFromStreamResponse
}

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object RemoveTagsFromStreamResponseOps {

  implicit class JavaRemoveTagsFromStreamResponseOps(val self: JavaRemoveTagsFromStreamResponse) extends AnyVal {
    def toScala: ScalaRemoveTagsFromStreamResponse = {
      ScalaRemoveTagsFromStreamResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
    }
  }

}
