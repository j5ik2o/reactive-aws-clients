// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetRecordsRequestBuilderOps(val self: GetRecordsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIteratorAsScala(value: Option[String]): GetRecordsRequest.Builder = {
            value.fold(self){ v => self.shardIterator(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def limitAsScala(value: Option[Int]): GetRecordsRequest.Builder = {
            value.fold(self){ v => self.limit(v) }
            } 


}

final class GetRecordsRequestOps(val self: GetRecordsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def shardIteratorAsScala: Option[String] = Option(self.shardIterator) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def limitAsScala: Option[Int] = Option(self.limit) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRecordsRequestOps {

implicit def toGetRecordsRequestBuilderOps(v: GetRecordsRequest.Builder): GetRecordsRequestBuilderOps = new GetRecordsRequestBuilderOps(v)

implicit def toGetRecordsRequestOps(v: GetRecordsRequest): GetRecordsRequestOps = new GetRecordsRequestOps(v)

}

