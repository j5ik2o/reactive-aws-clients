// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetShardIteratorRequest => ScalaGetShardIteratorRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ GetShardIteratorRequest => JavaGetShardIteratorRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorRequestOps {

  implicit class ScalaGetShardIteratorRequestOps(val self: ScalaGetShardIteratorRequest) extends AnyVal {

    def toJava: JavaGetShardIteratorRequest = {
      val result = JavaGetShardIteratorRequest.builder()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.streamArn(v)) // String
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v))     // String
      self.shardIteratorType.foreach { v =>
        import ShardIteratorTypeOps._; result.shardIteratorType(v.toJava)
      } // String
      self.sequenceNumber.filter(_.nonEmpty).foreach(v => result.sequenceNumber(v)) // String

      result.build()
    }

  }

}
