package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListTagsForStreamResult => JavaListTagsForStreamResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListTagsForStreamResponse => ScalaListTagsForStreamResponse }

import scala.collection.JavaConverters._

object ListTagsForStreamResponseOps {

  import TagOps._

  implicit class JavaListTagsForStreamResponseOps(val self: JavaListTagsForStreamResponse) extends AnyVal {

    def toScala: ScalaListTagsForStreamResponse = {
      ScalaListTagsForStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTags(Option(self.getTags).map(_.asScala.map(_.toScala)))
        .withHasMoreTags(Option(self.getHasMoreTags))
    }

  }

}
