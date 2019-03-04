package com.github.j5ik2o.reactive.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ Shard => JavaShard }
import com.github.j5ik2o.reactive.kinesis.model.{ Shard => ScalaShard }

object ShardOps {

  import HashKeyRangeOps._
  import SequenceNumberRangeOps._

  implicit class ScalaShardOps(val self: ScalaShard) extends AnyVal {

    def toJava: JavaShard = {
      val result = new JavaShard()
      self.shardId.foreach(result.setShardId)
      self.parentShardId.foreach(result.setParentShardId)
      self.adjacentParentShardId.foreach(result.setAdjacentParentShardId)
      self.hashKeyRange.map(_.toJava).foreach(result.setHashKeyRange)
      self.sequenceNumberRange.map(_.toJava).foreach(result.setSequenceNumberRange)
      result
    }

  }

  implicit class JavaShardOps(val self: JavaShard) extends AnyVal {

    def toScala: ScalaShard = {
      ScalaShard()
        .withShardId(Option(self.getShardId))
        .withParentShardId(Option(self.getParentShardId))
        .withAdjacentParentShardId(Option(self.getAdjacentParentShardId))
        .withHashKeyRange(Option(self.getHashKeyRange).map(_.toScala))
        .withSequenceNumberRange(Option(self.getSequenceNumberRange).map(_.toScala))
    }

  }

}
