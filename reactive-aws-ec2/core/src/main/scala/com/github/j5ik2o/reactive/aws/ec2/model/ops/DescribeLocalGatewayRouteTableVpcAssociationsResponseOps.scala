// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayRouteTableVpcAssociationsResponseBuilderOps(val self: DescribeLocalGatewayRouteTableVpcAssociationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTableVpcAssociationsAsScala(value: Option[Seq[LocalGatewayRouteTableVpcAssociation]]): DescribeLocalGatewayRouteTableVpcAssociationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGatewayRouteTableVpcAssociations(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayRouteTableVpcAssociationsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeLocalGatewayRouteTableVpcAssociationsResponseOps(val self: DescribeLocalGatewayRouteTableVpcAssociationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def localGatewayRouteTableVpcAssociationsAsScala: Option[Seq[LocalGatewayRouteTableVpcAssociation]] = Option(self.localGatewayRouteTableVpcAssociations).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayRouteTableVpcAssociationsResponseOps {

implicit def toDescribeLocalGatewayRouteTableVpcAssociationsResponseBuilderOps(v: DescribeLocalGatewayRouteTableVpcAssociationsResponse.Builder): DescribeLocalGatewayRouteTableVpcAssociationsResponseBuilderOps = new DescribeLocalGatewayRouteTableVpcAssociationsResponseBuilderOps(v)

implicit def toDescribeLocalGatewayRouteTableVpcAssociationsResponseOps(v: DescribeLocalGatewayRouteTableVpcAssociationsResponse): DescribeLocalGatewayRouteTableVpcAssociationsResponseOps = new DescribeLocalGatewayRouteTableVpcAssociationsResponseOps(v)

}

