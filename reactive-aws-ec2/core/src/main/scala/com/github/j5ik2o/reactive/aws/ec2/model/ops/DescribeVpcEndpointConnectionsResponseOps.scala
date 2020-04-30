// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointConnectionsResponseBuilderOps(val self: DescribeVpcEndpointConnectionsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcEndpointConnectionsAsScala(value: Option[Seq[VpcEndpointConnection]]): DescribeVpcEndpointConnectionsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcEndpointConnections(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointConnectionsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcEndpointConnectionsResponseOps(val self: DescribeVpcEndpointConnectionsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def vpcEndpointConnectionsAsScala: Option[Seq[VpcEndpointConnection]] = Option(self.vpcEndpointConnections).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointConnectionsResponseOps {

implicit def toDescribeVpcEndpointConnectionsResponseBuilderOps(v: DescribeVpcEndpointConnectionsResponse.Builder): DescribeVpcEndpointConnectionsResponseBuilderOps = new DescribeVpcEndpointConnectionsResponseBuilderOps(v)

implicit def toDescribeVpcEndpointConnectionsResponseOps(v: DescribeVpcEndpointConnectionsResponse): DescribeVpcEndpointConnectionsResponseOps = new DescribeVpcEndpointConnectionsResponseOps(v)

}

