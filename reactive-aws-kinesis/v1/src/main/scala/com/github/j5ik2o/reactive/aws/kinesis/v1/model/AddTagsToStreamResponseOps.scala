// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamResponse => ScalaAddTagsToStreamResponse, _ }
import com.amazonaws.services.kinesis.model.{ AddTagsToStreamResult => JavaAddTagsToStreamResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AddTagsToStreamResponseOps {

  implicit class JavaAddTagsToStreamResponseOps(val self: JavaAddTagsToStreamResponse) extends AnyVal {

    def toScala: ScalaAddTagsToStreamResponse = {
      ScalaAddTagsToStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
