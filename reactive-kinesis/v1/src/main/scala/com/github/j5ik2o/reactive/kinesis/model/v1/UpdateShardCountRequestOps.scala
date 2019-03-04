package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ UpdateShardCountRequest => JavaUpdateShardCountRequest }
import com.github.j5ik2o.reactive.kinesis.model.{ UpdateShardCountRequest => ScalaUpdateShardCountRequest }

object UpdateShardCountRequestOps {

  implicit class ScalaUpdateShardCountRequestOps(val self: ScalaUpdateShardCountRequest) extends AnyVal {

    def toJava: JavaUpdateShardCountRequest = {
      val result = new JavaUpdateShardCountRequest()
      self.streamName.foreach(result.setStreamName)
      self.targetShardCount.foreach(v => result.setTargetShardCount(v))
      self.scalingType.map(_.entryName).foreach(result.setScalingType)
      result
    }

  }

}
