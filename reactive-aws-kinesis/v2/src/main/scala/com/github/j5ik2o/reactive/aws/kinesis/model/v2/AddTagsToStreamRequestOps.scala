package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamRequest => ScalaAddTagsToStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ AddTagsToStreamRequest => JavaAddTagsToStreamRequest }

import scala.collection.JavaConverters._

object AddTagsToStreamRequestOps {

  implicit class ScalaAddTagsToStreamRequestOps(val self: ScalaAddTagsToStreamRequest) extends AnyVal {

    def toJava: JavaAddTagsToStreamRequest = {
      val result = JavaAddTagsToStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.tags.map(_.asJava).foreach(result.tags)
      result.build()
    }

  }

}
