// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest, _ }
import com.amazonaws.services.kinesis.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = new JavaGetShardIteratorRequest()
      self.streamName.filter(_.nonEmpty).foreach(v => result.withStreamName(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.withShardId(v))       // String
      self.shardIteratorType.foreach { v =>
        import ShardIteratorTypeOps._; result.withShardIteratorType(v.toJava)
      } // String
      self.startingSequenceNumber.filter(_.nonEmpty).foreach(v => result.withStartingSequenceNumber(v)) // String
      self.timestamp.map(java.util.Date.from).foreach(v => result.withTimestamp(v))                     // Instant

      result
    }

  }

}
