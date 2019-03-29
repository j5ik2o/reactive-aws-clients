// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Shard => ScalaShard, _ }
import com.amazonaws.services.kinesis.model.{ Shard => JavaShard }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ShardOps {

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = new JavaShard()
      self.shardId.filter(_.nonEmpty).foreach(v => result.withShardId(v))                             // String
      self.parentShardId.filter(_.nonEmpty).foreach(v => result.withParentShardId(v))                 // String
      self.adjacentParentShardId.filter(_.nonEmpty).foreach(v => result.withAdjacentParentShardId(v)) // String
      self.hashKeyRange.foreach { v =>
        import HashKeyRangeOps._; result.withHashKeyRange(v.toJava)
      } // HashKeyRange
      self.sequenceNumberRange.foreach { v =>
        import SequenceNumberRangeOps._; result.withSequenceNumberRange(v.toJava)
      } // SequenceNumberRange

      result
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.getShardId)) // String
        .withParentShardId(Option(self.getParentShardId)) // String
        .withAdjacentParentShardId(Option(self.getAdjacentParentShardId)) // String
        .withHashKeyRange(Option(self.getHashKeyRange).map { v =>
          import HashKeyRangeOps._; v.toScala
        }) // HashKeyRange
        .withSequenceNumberRange(Option(self.getSequenceNumberRange).map { v =>
          import SequenceNumberRangeOps._; v.toScala
        }) // SequenceNumberRange
    }

  }

}
