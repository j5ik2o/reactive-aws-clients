package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ RemoveTagsFromStreamResult => JavaRemoveTagsFromStreamResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ RemoveTagsFromStreamResponse => ScalaRemoveTagsFromStreamResponse }

import scala.collection.JavaConverters._

object RemoveTagsFromStreamResponseOps {

  implicit class JavaRemoveTagsFromStreamResponseOps(val self: JavaRemoveTagsFromStreamResponse) extends AnyVal {
    def toScala: ScalaRemoveTagsFromStreamResponse = {
      ScalaRemoveTagsFromStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }
  }

}
