package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ RemoveTagsFromStreamRequest => JavaRemoveTagsFromStreamRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ RemoveTagsFromStreamRequest => ScalaRemoveTagsFromStreamRequest }

import scala.collection.JavaConverters._

object RemoveTagsFromStreamRequestOps {

  implicit class ScalaRemoveTagsFromStreamRequestOps(val self: ScalaRemoveTagsFromStreamRequest) extends AnyVal {

    def toJava: JavaRemoveTagsFromStreamRequest = {
      val result = new JavaRemoveTagsFromStreamRequest()
      self.streamName.foreach(result.setStreamName)
      self.tagKeys.map(_.asJava).foreach(result.setTagKeys)
      result
    }

  }

}
