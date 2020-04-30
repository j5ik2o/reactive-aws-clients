// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class MergeShardsRequestBuilderOps(val self: MergeShardsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): MergeShardsRequest.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
            value.fold(self){ v => self.shardToMerge(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def adjacentShardToMergeAsScala(value: Option[String]): MergeShardsRequest.Builder = {
            value.fold(self){ v => self.adjacentShardToMerge(v) }
            } 


}

final class MergeShardsRequestOps(val self: MergeShardsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardToMergeAsScala: Option[String] = Option(self.shardToMerge) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def adjacentShardToMergeAsScala: Option[String] = Option(self.adjacentShardToMerge) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMergeShardsRequestOps {

implicit def toMergeShardsRequestBuilderOps(v: MergeShardsRequest.Builder): MergeShardsRequestBuilderOps = new MergeShardsRequestBuilderOps(v)

implicit def toMergeShardsRequestOps(v: MergeShardsRequest): MergeShardsRequestOps = new MergeShardsRequestOps(v)

}

