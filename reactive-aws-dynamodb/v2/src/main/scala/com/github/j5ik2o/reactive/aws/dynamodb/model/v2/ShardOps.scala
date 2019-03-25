package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Shard => ScalaShard, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Shard => JavaShard }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ShardOps {

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = JavaShard.builder()
      self.shardId.filter(_.nonEmpty).foreach(v => result.shardId(v)) // String
      self.sequenceNumberRange.foreach { v =>
        import SequenceNumberRangeOps._; result.sequenceNumberRange(v.toJava)
      } // SequenceNumberRange
      self.parentShardId.filter(_.nonEmpty).foreach(v => result.parentShardId(v)) // String

      result.build()
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.shardId)) // String
        .withSequenceNumberRange(Option(self.sequenceNumberRange).map { v =>
          import SequenceNumberRangeOps._; v.toScala
        }) // SequenceNumberRange
        .withParentShardId(Option(self.parentShardId)) // String
    }

  }

}
