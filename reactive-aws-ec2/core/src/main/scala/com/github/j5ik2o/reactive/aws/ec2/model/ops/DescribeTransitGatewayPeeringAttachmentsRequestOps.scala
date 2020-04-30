// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeTransitGatewayPeeringAttachmentsRequestBuilderOps(val self: DescribeTransitGatewayPeeringAttachmentsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def transitGatewayAttachmentIdsAsScala(value: Option[Seq[String]]): DescribeTransitGatewayPeeringAttachmentsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitGatewayAttachmentIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeTransitGatewayPeeringAttachmentsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeTransitGatewayPeeringAttachmentsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeTransitGatewayPeeringAttachmentsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeTransitGatewayPeeringAttachmentsRequestOps(val self: DescribeTransitGatewayPeeringAttachmentsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def transitGatewayAttachmentIdsAsScala: Option[Seq[String]] = Option(self.transitGatewayAttachmentIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTransitGatewayPeeringAttachmentsRequestOps {

implicit def toDescribeTransitGatewayPeeringAttachmentsRequestBuilderOps(v: DescribeTransitGatewayPeeringAttachmentsRequest.Builder): DescribeTransitGatewayPeeringAttachmentsRequestBuilderOps = new DescribeTransitGatewayPeeringAttachmentsRequestBuilderOps(v)

implicit def toDescribeTransitGatewayPeeringAttachmentsRequestOps(v: DescribeTransitGatewayPeeringAttachmentsRequest): DescribeTransitGatewayPeeringAttachmentsRequestOps = new DescribeTransitGatewayPeeringAttachmentsRequestOps(v)

}

