// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIpv6PoolsResponseBuilderOps(val self: DescribeIpv6PoolsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipv6PoolsAsScala(value: Option[Seq[Ipv6Pool]]): DescribeIpv6PoolsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipv6Pools(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeIpv6PoolsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeIpv6PoolsResponseOps(val self: DescribeIpv6PoolsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipv6PoolsAsScala: Option[Seq[Ipv6Pool]] = Option(self.ipv6Pools).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIpv6PoolsResponseOps {

implicit def toDescribeIpv6PoolsResponseBuilderOps(v: DescribeIpv6PoolsResponse.Builder): DescribeIpv6PoolsResponseBuilderOps = new DescribeIpv6PoolsResponseBuilderOps(v)

implicit def toDescribeIpv6PoolsResponseOps(v: DescribeIpv6PoolsResponse): DescribeIpv6PoolsResponseOps = new DescribeIpv6PoolsResponseOps(v)

}

