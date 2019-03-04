package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ ListStreamsRequest => ScalaListStreamsRequest }
import software.amazon.awssdk.services.kinesis.model.{ ListStreamsRequest => JavaListStreamsRequest }

object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = JavaListStreamsRequest.builder()
      self.limit.foreach(v => result.limit(v))
      self.exclusiveStartStreamName.foreach(result.exclusiveStartStreamName)
      result.build()
    }

  }

}
