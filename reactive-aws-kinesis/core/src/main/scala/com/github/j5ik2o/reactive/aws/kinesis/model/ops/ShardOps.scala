// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ShardBuilderOps(val self: Shard.Builder) extends AnyVal {

  final def shardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  } // String

  final def parentShardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.parentShardId(v)
    }
  } // String

  final def adjacentParentShardIdAsScala(value: Option[String]): Shard.Builder = {
    value.fold(self) { v =>
      self.adjacentParentShardId(v)
    }
  } // String

  final def hashKeyRangeAsScala(value: Option[HashKeyRange]): Shard.Builder = {
    value.fold(self) { v =>
      self.hashKeyRange(v)
    }
  } // HashKeyRange

  final def sequenceNumberRangeAsScala(value: Option[SequenceNumberRange]): Shard.Builder = {
    value.fold(self) { v =>
      self.sequenceNumberRange(v)
    }
  } // SequenceNumberRange

}

final class ShardOps(val self: Shard) extends AnyVal {

  final def shardIdAsScala: Option[String] = Option(self.shardId) // String

  final def parentShardIdAsScala: Option[String] = Option(self.parentShardId) // String

  final def adjacentParentShardIdAsScala: Option[String] = Option(self.adjacentParentShardId) // String

  final def hashKeyRangeAsScala: Option[HashKeyRange] = Option(self.hashKeyRange) // HashKeyRange

  final def sequenceNumberRangeAsScala: Option[SequenceNumberRange] =
    Option(self.sequenceNumberRange) // SequenceNumberRange

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToShardOps {

  implicit def toShardBuilderOps(v: Shard.Builder): ShardBuilderOps = new ShardBuilderOps(v)

  implicit def toShardOps(v: Shard): ShardOps = new ShardOps(v)

}
