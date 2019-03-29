// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListTagsForStreamResponse => ScalaListTagsForStreamResponse, _ }
import com.amazonaws.services.kinesis.model.{ ListTagsForStreamResult => JavaListTagsForStreamResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsForStreamResponseOps {

  implicit class JavaListTagsForStreamResponseOps(val self: JavaListTagsForStreamResponse) extends AnyVal {

    def toScala: ScalaListTagsForStreamResponse = {
      ScalaListTagsForStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTags(Option(self.getTags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
        .withHasMoreTags(Option(self.getHasMoreTags).map(_.booleanValue)) // Boolean
    }

  }

}
