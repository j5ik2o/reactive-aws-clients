// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ UpdateShardCountRequest => ScalaUpdateShardCountRequest, _ }
import com.amazonaws.services.kinesis.model.{ UpdateShardCountRequest => JavaUpdateShardCountRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateShardCountRequestOps {

  implicit class ScalaUpdateShardCountRequestOps(val self: ScalaUpdateShardCountRequest) extends AnyVal {

    def toJava: JavaUpdateShardCountRequest = {
      val result = new JavaUpdateShardCountRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v))          // String
      self.targetShardCount.map(_.intValue).foreach(v => result.withTargetShardCount(v)) // Int
      self.scalingType.foreach { v =>
        import ScalingTypeOps._; result.withScalingType(v.toJava)
      } // String

      result
    }

  }

}
