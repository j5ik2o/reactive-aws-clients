// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ShardBuilderOps(val self: Shard.Builder) extends AnyVal {

  final def shardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  }

  final def parentShardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.parentShardId(v)
    }
  }

  final def adjacentParentShardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.adjacentParentShardId(v)
    }
  }

  final def hashKeyRangeAsScala(value: Option[HashKeyRange]): Shard.Builder = {
    value.fold(self) { v =>
      self.hashKeyRange(v)
    }
  }

  final def sequenceNumberRangeAsScala(value: Option[SequenceNumberRange]): Shard.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberRange(v)
    }
  }

}

final class ShardOps(val self: Shard) extends AnyVal {

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def parentShardIdAsScala: Option[String] = Option(self.parentShardId)

  final def adjacentParentShardIdAsScala: Option[String] = Option(self.adjacentParentShardId)

  final def hashKeyRangeAsScala: Option[HashKeyRange] = Option(self.hashKeyRange)

  final def sequenceNumberRangeAsScala: Option[SequenceNumberRange] = Option(self.sequenceNumberRange)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToShardOps {

  implicit def toShardBuilderOps(v: Shard.Builder): ShardBuilderOps = new ShardBuilderOps(v)

  implicit def toShardOps(v: Shard): ShardOps = new ShardOps(v)

}
