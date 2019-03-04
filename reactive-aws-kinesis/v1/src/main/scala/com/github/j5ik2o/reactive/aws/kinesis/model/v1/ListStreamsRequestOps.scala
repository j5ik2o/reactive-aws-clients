package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ ListStreamsRequest => JavaListStreamsRequest }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ ListStreamsRequest => ScalaListStreamsRequest }

object ListStreamsRequestOps {

  implicit class ScalaListStreamsRequestOps(val self: ScalaListStreamsRequest) extends AnyVal {

    def toJava: JavaListStreamsRequest = {
      val result = new JavaListStreamsRequest()
      self.limit.foreach(v => result.setLimit(v))
      self.exclusiveStartStreamName.foreach(result.setExclusiveStartStreamName)
      result
    }

  }

}
