// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Shard => ScalaShard, _ }
import software.amazon.awssdk.services.kinesis.model.{ Shard => JavaShard }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ShardOps {

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = JavaShard.builder()
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v))                             // String
      self.parentShardId.filter(_.nonEmpty).foreach(v => result.parentShardId(v))                 // String
      self.adjacentParentShardId.filter(_.nonEmpty).foreach(v => result.adjacentParentShardId(v)) // String
      self.hashKeyRange.foreach { v =>
        import HashKeyRangeOps._; result.hashKeyRange(v.toJava)
      } // HashKeyRange
      self.sequenceNumberRange.foreach { v =>
        import SequenceNumberRangeOps._; result.sequenceNumberRange(v.toJava)
      } // SequenceNumberRange

      result.build()
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.shardId)) // String
        .withParentShardId(Option(self.parentShardId)) // String
        .withAdjacentParentShardId(Option(self.adjacentParentShardId)) // String
        .withHashKeyRange(Option(self.hashKeyRange).map { v =>
          import HashKeyRangeOps._; v.toScala
        }) // HashKeyRange
        .withSequenceNumberRange(Option(self.sequenceNumberRange).map { v =>
          import SequenceNumberRangeOps._; v.toScala
        }) // SequenceNumberRange
    }

  }

}
