// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ SubscribeToShardRequest => ScalaSubscribeToShardRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ SubscribeToShardRequest => JavaSubscribeToShardRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SubscribeToShardRequestOps {

  implicit class ScalaSubscribeToShardRequestOps(val self: ScalaSubscribeToShardRequest) extends AnyVal {

    def toJava: JavaSubscribeToShardRequest = {
      val result = JavaSubscribeToShardRequest.builder()
      self.consumerARN.filter(_.nonEmpty).foreach(v => result.consumerARN(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v))         // String
      self.startingPosition.foreach { v =>
        import StartingPositionOps._; result.startingPosition(v.toJava)
      } // StartingPosition

      result.build()
    }

  }

}
