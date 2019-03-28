// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = new JavaGetShardIteratorRequest()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.withStreamArn(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.withShardId(v))     // String
      self.shardIteratorType.foreach { v =>
        import ShardIteratorTypeOps._; result.withShardIteratorType(v.toJava)
      } // String
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.withSequenceNumber(v)) // String

      result
    }

  }

}
