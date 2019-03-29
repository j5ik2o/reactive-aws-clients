// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{
  RemoveTagsFromStreamResponse => ScalaRemoveTagsFromStreamResponse,
  _
}
import com.amazonaws.services.kinesis.model.{ RemoveTagsFromStreamResult => JavaRemoveTagsFromStreamResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RemoveTagsFromStreamResponseOps {

  implicit class JavaRemoveTagsFromStreamResponseOps(val self: JavaRemoveTagsFromStreamResponse) extends AnyVal {

    def toScala: ScalaRemoveTagsFromStreamResponse = {
      ScalaRemoveTagsFromStreamResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
