// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetAssociatedIpv6PoolCidrsRequestBuilderOps(val self: GetAssociatedIpv6PoolCidrsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def poolIdAsScala(value: Option[String]): GetAssociatedIpv6PoolCidrsRequest.Builder = {
            value.fold(self){ v => self.poolId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetAssociatedIpv6PoolCidrsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): GetAssociatedIpv6PoolCidrsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 


}

final class GetAssociatedIpv6PoolCidrsRequestOps(val self: GetAssociatedIpv6PoolCidrsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def poolIdAsScala: Option[String] = Option(self.poolId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAssociatedIpv6PoolCidrsRequestOps {

implicit def toGetAssociatedIpv6PoolCidrsRequestBuilderOps(v: GetAssociatedIpv6PoolCidrsRequest.Builder): GetAssociatedIpv6PoolCidrsRequestBuilderOps = new GetAssociatedIpv6PoolCidrsRequestBuilderOps(v)

implicit def toGetAssociatedIpv6PoolCidrsRequestOps(v: GetAssociatedIpv6PoolCidrsRequest): GetAssociatedIpv6PoolCidrsRequestOps = new GetAssociatedIpv6PoolCidrsRequestOps(v)

}

