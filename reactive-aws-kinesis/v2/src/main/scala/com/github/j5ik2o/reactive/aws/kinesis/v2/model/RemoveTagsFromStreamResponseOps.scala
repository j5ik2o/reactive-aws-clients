// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RemoveTagsFromStreamResponse => ScalaRemoveTagsFromStreamResponse,
  _
}
import software.amazon.awssdk.services.kinesis.model.{
  RemoveTagsFromStreamResponse => JavaRemoveTagsFromStreamResponse
}

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
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
