package com.github.j5ik2o.reactive.kinesis.model.v2

import com.github.j5ik2o.reactive.kinesis.model.{ UpdateShardCountRequest => ScalaUpdateShardCountRequest }
import software.amazon.awssdk.services.kinesis.model.{ UpdateShardCountRequest => JavaUpdateShardCountRequest }

object UpdateShardCountRequestOps {

  implicit class ScalaUpdateShardCountRequestOps(val self: ScalaUpdateShardCountRequest) extends AnyVal {

    def toJava: JavaUpdateShardCountRequest = {
      val result = JavaUpdateShardCountRequest.builder()
      self.streamName.foreach(result.streamName)
      self.targetShardCount.foreach(v => result.targetShardCount(v))
      self.scalingType.map(_.entryName).foreach(result.scalingType)
      result.build()
    }

  }

}
