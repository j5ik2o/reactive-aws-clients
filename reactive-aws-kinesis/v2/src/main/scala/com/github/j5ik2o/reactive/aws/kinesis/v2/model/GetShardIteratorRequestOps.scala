// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v2.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest, _ }
import software.amazon.awssdk.services.kinesis.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = JavaGetShardIteratorRequest.builder()
      self.streamName.filter(_.nonEmpty).foreach(v => result.streamName(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v))       // String
      self.shardIteratorType.foreach { v =>
        import ShardIteratorTypeOps._; result.shardIteratorType(v.toJava)
      } // String
      self.startingSequenceNumber.filter(_.nonEmpty).foreach(v => result.startingSequenceNumber(v)) // String
      self.timestamp.foreach(v => result.timestamp(v))                                              // Instant

      result.build()
    }

  }

}
