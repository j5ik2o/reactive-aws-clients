// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SplitShardRequestBuilderOps(val self: SplitShardRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): SplitShardRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def shardToSplitAsScala(value: Option[String]): SplitShardRequest.Builder = {
    value.fold(self) { v =>
      self.shardToSplit(v)
    }
  }

  final def newStartingHashKeyAsScala(value: Option[String]): SplitShardRequest.Builder = {
    value.fold(self) { v =>
      self.newStartingHashKey(v)
    }
  }

}

final class SplitShardRequestOps(val self: SplitShardRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def shardToSplitAsScala: Option[String] = Option(self.shardToSplit)

  final def newStartingHashKeyAsScala: Option[String] = Option(self.newStartingHashKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSplitShardRequestOps {

  implicit def toSplitShardRequestBuilderOps(v: SplitShardRequest.Builder): SplitShardRequestBuilderOps =
    new SplitShardRequestBuilderOps(v)

  implicit def toSplitShardRequestOps(v: SplitShardRequest): SplitShardRequestOps = new SplitShardRequestOps(v)

}
