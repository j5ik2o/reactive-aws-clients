// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class MergeShardsRequestBuilderOps(val self: MergeShardsRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withShardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.shardToMerge(v)
    }
  } // String

  final def withAdjacentShardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
    value.fold(self) { v =>
      self.adjacentShardToMerge(v)
    }
  } // String

}

final class MergeShardsRequestOps(val self: MergeShardsRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def shardToMergeAsScala: Option[String] = Option(self.shardToMerge) // String

  final def adjacentShardToMergeAsScala: Option[String] = Option(self.adjacentShardToMerge) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMergeShardsRequestOps {

  implicit def toMergeShardsRequestBuilderOps(v: MergeShardsRequest.Builder): MergeShardsRequestBuilderOps =
    new MergeShardsRequestBuilderOps(v)

  implicit def toMergeShardsRequestOps(v: MergeShardsRequest): MergeShardsRequestOps = new MergeShardsRequestOps(v)

}
