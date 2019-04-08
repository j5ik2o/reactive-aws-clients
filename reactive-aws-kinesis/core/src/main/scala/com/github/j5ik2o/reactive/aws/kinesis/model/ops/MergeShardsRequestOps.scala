// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class MergeShardsRequestBuilderOps(val self: MergeShardsRequest.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  }

  final def shardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.shardToMerge(v)
    }
  }

  final def adjacentShardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.adjacentShardToMerge(v)
    }
  }

}

final class MergeShardsRequestOps(val self: MergeShardsRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName)

  final def shardToMergeAsScala: Option[String] = Option(self.shardToMerge)

  final def adjacentShardToMergeAsScala: Option[String] = Option(self.adjacentShardToMerge)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMergeShardsRequestOps {

  implicit def toMergeShardsRequestBuilderOps(v: MergeShardsRequest.Builder): MergeShardsRequestBuilderOps =
    new MergeShardsRequestBuilderOps(v)

  implicit def toMergeShardsRequestOps(v: MergeShardsRequest): MergeShardsRequestOps = new MergeShardsRequestOps(v)

}
