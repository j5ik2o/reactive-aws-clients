package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ AddTagsToStreamResult => JavaAddTagsToStreamResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamResponse => ScalaAddTagsToStreamResponse }

import scala.collection.JavaConverters._

object AddTagsToStreamResponseOps {

  implicit class JavaAddTagsToStreamResponseOps(val self: JavaAddTagsToStreamResponse) extends AnyVal {

    def toScala: ScalaAddTagsToStreamResponse = {
      ScalaAddTagsToStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
