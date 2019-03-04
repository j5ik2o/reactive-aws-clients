package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ AddTagsToStreamRequest => JavaAddTagsToStreamRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ AddTagsToStreamRequest => ScalaAddTagsToStreamRequest }

import scala.collection.JavaConverters._

object AddTagsToStreamRequestOps {

  implicit class ScalaAddTagsToStreamRequestOps(val self: ScalaAddTagsToStreamRequest) extends AnyVal {

    def toJava: JavaAddTagsToStreamRequest = {
      val result = new JavaAddTagsToStreamRequest
      self.streamName.foreach(result.setStreamName)
      self.tags.map(_.asJava).foreach(result.setTags)
      result
    }

  }

}
