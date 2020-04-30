// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeLocalGatewayRouteTablesResponseBuilderOps(val self: DescribeLocalGatewayRouteTablesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def localGatewayRouteTablesAsScala(value: Option[Seq[LocalGatewayRouteTable]]): DescribeLocalGatewayRouteTablesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localGatewayRouteTables(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeLocalGatewayRouteTablesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeLocalGatewayRouteTablesResponseOps(val self: DescribeLocalGatewayRouteTablesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def localGatewayRouteTablesAsScala: Option[Seq[LocalGatewayRouteTable]] = Option(self.localGatewayRouteTables).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeLocalGatewayRouteTablesResponseOps {

implicit def toDescribeLocalGatewayRouteTablesResponseBuilderOps(v: DescribeLocalGatewayRouteTablesResponse.Builder): DescribeLocalGatewayRouteTablesResponseBuilderOps = new DescribeLocalGatewayRouteTablesResponseBuilderOps(v)

implicit def toDescribeLocalGatewayRouteTablesResponseOps(v: DescribeLocalGatewayRouteTablesResponse): DescribeLocalGatewayRouteTablesResponseOps = new DescribeLocalGatewayRouteTablesResponseOps(v)

}

