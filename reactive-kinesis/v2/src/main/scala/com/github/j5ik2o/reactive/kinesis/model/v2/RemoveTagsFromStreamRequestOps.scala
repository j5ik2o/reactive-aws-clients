package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ RemoveTagsFromStreamRequest => ScalaRemoveTagsFromStreamRequest }
import software.amazon.awssdk.services.kinesis.model.{ RemoveTagsFromStreamRequest => JavaRemoveTagsFromStreamRequest }

import scala.collection.JavaConverters._

object RemoveTagsFromStreamRequestOps {

  implicit class ScalaRemoveTagsFromStreamRequestOps(val self: ScalaRemoveTagsFromStreamRequest) extends AnyVal {

    def toJava: JavaRemoveTagsFromStreamRequest = {
      val result = JavaRemoveTagsFromStreamRequest.builder()
      self.streamName.foreach(result.streamName)
      self.tagKeys.map(_.asJava).foreach(result.tagKeys)
      result.build()
    }

  }

}
