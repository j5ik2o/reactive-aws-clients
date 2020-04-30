// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayRouteTablesRequestBuilderOps(val self: DescribeTransitGatewayRouteTablesRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayRouteTableIdsAsScala(value: Option[Seq[String]]): DescribeTransitGatewayRouteTablesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayRouteTableIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewayRouteTablesRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewayRouteTablesRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayRouteTablesRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTransitGatewayRouteTablesRequestOps(val self: DescribeTransitGatewayRouteTablesRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def transitGatewayRouteTableIdsAsScala: Option[Seq[String]] = Option(self.transitGatewayRouteTableIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayRouteTablesRequestOps {

implicit def toDescribeTransitGatewayRouteTablesRequestBuilderOps(v: DescribeTransitGatewayRouteTablesRequest.Builder): DescribeTransitGatewayRouteTablesRequestBuilderOps = new DescribeTransitGatewayRouteTablesRequestBuilderOps(v)

implicit def toDescribeTransitGatewayRouteTablesRequestOps(v: DescribeTransitGatewayRouteTablesRequest): DescribeTransitGatewayRouteTablesRequestOps = new DescribeTransitGatewayRouteTablesRequestOps(v)

}

