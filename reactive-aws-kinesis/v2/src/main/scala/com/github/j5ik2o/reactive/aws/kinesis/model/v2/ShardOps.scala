package com.github.j5ik2o.reactive.aws.kinesis.model.v2

import com.github.j5ik2o.reactive.aws.kinesis.model.{ Shard => ScalaShard }
import software.amazon.awssdk.services.kinesis.model.{ Shard => JavaShard }

object ShardOps {

  import HashKeyRangeOps._
  import SequenceNumberRangeOps._

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = JavaShard.builder()
      self.shardId.foreach(result.shardId)
      self.parentShardId.foreach(result.parentShardId)
      self.adjacentParentShardId.foreach(result.adjacentParentShardId)
      self.hashKeyRange.map(_.toJava).foreach(result.hashKeyRange)
      self.sequenceNumberRange.map(_.toJava).foreach(result.sequenceNumberRange)
      result.build()
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.shardId()))
        .withParentShardId(Option(self.parentShardId()))
        .withAdjacentParentShardId(Option(self.adjacentParentShardId()))
        .withHashKeyRange(Option(self.hashKeyRange()).map(_.toScala))
        .withSequenceNumberRange(Option(self.sequenceNumberRange()).map(_.toScala))
    }

  }

}
