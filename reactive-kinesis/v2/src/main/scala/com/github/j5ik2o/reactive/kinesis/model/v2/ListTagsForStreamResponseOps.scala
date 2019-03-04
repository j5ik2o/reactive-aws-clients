package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ListTagsForStreamResponse => ScalaListTagsForStreamResponse }
import software.amazon.awssdk.services.kinesis.model.{ ListTagsForStreamResponse => JavaListTagsForStreamResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListTagsForStreamResponseOps {

  import TagOps._

  implicit class JavaListTagsForStreamResponseOps(val self: JavaListTagsForStreamResponse) extends AnyVal {

    def toScala: ScalaListTagsForStreamResponse = {
      ScalaListTagsForStreamResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTags(Option(self.tags()).map(_.asScala.map(_.toScala)))
        .withHasMoreTags(Option(self.hasMoreTags))
    }

  }

}
