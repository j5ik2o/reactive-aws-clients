// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountRequest => ScalaUpdateShardCountRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ UpdateShardCountRequest => JavaUpdateShardCountRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateShardCountRequestOps {

  implicit class ScalaUpdateShardCountRequestOps(val self: ScalaUpdateShardCountRequest) extends AnyVal {

    def toJava: JavaUpdateShardCountRequest = {
      val result = JavaUpdateShardCountRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v))          // String
      self.targetShardCount.map(_.intValue).foreach(v => result.targetShardCount(v)) // Int
      self.scalingType.foreach { v =>
        import ScalingTypeOps._; result.scalingType(v.toJava)
      } // String

      result.build()
    }

  }

}
