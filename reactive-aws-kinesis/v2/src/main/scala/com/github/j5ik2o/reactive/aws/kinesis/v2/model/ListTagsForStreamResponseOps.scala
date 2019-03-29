// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListTagsForStreamResponse => ScalaListTagsForStreamResponse, _ }
import software.amazon.awssdk.services.kinesis.model.{ ListTagsForStreamResponse => JavaListTagsForStreamResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsForStreamResponseOps {

  implicit class JavaListTagsForStreamResponseOps(val self: JavaListTagsForStreamResponse) extends AnyVal {

    def toScala: ScalaListTagsForStreamResponse = {
      ScalaListTagsForStreamResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withTags(Option(self.tags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
        .withHasMoreTags(Option(self.hasMoreTags).map(_.booleanValue)) // Boolean
    }

  }

}
