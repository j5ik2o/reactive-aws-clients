// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetAssociatedIpv6PoolCidrsResponseBuilderOps(val self: GetAssociatedIpv6PoolCidrsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6CidrAssociationsAsScala(value: Option[Seq[Ipv6CidrAssociation]]): GetAssociatedIpv6PoolCidrsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6CidrAssociations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): GetAssociatedIpv6PoolCidrsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class GetAssociatedIpv6PoolCidrsResponseOps(val self: GetAssociatedIpv6PoolCidrsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipv6CidrAssociationsAsScala: Option[Seq[Ipv6CidrAssociation]] = Option(self.ipv6CidrAssociations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAssociatedIpv6PoolCidrsResponseOps {

implicit def toGetAssociatedIpv6PoolCidrsResponseBuilderOps(v: GetAssociatedIpv6PoolCidrsResponse.Builder): GetAssociatedIpv6PoolCidrsResponseBuilderOps = new GetAssociatedIpv6PoolCidrsResponseBuilderOps(v)

implicit def toGetAssociatedIpv6PoolCidrsResponseOps(v: GetAssociatedIpv6PoolCidrsResponse): GetAssociatedIpv6PoolCidrsResponseOps = new GetAssociatedIpv6PoolCidrsResponseOps(v)

}

