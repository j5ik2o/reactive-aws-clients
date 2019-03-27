// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Shard => ScalaShard, _ }
import com.amazonaws.services.dynamodbv2.model.{ Shard => JavaShard }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ShardOps {

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = new JavaShard()
      self.shardId.filter(_.nonEmpty).foreach(v => result.withShardId(v)) // String
      self.sequenceNumberRange.foreach { v =>
        import SequenceNumberRangeOps._; result.withSequenceNumberRange(v.toJava)
      } // SequenceNumberRange
      self.parentShardId.filter(_.nonEmpty).foreach(v => result.withParentShardId(v)) // String

      result
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.getShardId)) // String
        .withSequenceNumberRange(Option(self.getSequenceNumberRange).map { v =>
          import SequenceNumberRangeOps._; v.toScala
        }) // SequenceNumberRange
        .withParentShardId(Option(self.getParentShardId)) // String
    }

  }

}
