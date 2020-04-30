// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
            value.fold(self){ v => self.streamName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIdAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
            value.fold(self){ v => self.shardId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIteratorTypeAsScala(value: Option[ShardIteratorType]): GetShardIteratorRequest.Builder = {
            value.fold(self){ v => self.shardIteratorType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startingSequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
            value.fold(self){ v => self.startingSequenceNumber(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala(value: Option[java.time.Instant]): GetShardIteratorRequest.Builder = {
            value.fold(self){ v => self.timestamp(v) }
            } 


}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamNameAsScala: Option[String] = Option(self.streamName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIdAsScala: Option[String] = Option(self.shardId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startingSequenceNumberAsScala: Option[String] = Option(self.startingSequenceNumber) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorRequestOps {

implicit def toGetShardIteratorRequestBuilderOps(v: GetShardIteratorRequest.Builder): GetShardIteratorRequestBuilderOps = new GetShardIteratorRequestBuilderOps(v)

implicit def toGetShardIteratorRequestOps(v: GetShardIteratorRequest): GetShardIteratorRequestOps = new GetShardIteratorRequestOps(v)

}

