// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicePermissionsRequestBuilderOps(val self: DescribeVpcEndpointServicePermissionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala(value: Option[String]): DescribeVpcEndpointServicePermissionsRequest.Builder = {
            value.fold(self){ v => self.serviceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def filtersAsScala(value: Option[Seq[Filter]]): DescribeVpcEndpointServicePermissionsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala(value: Option[Int]): DescribeVpcEndpointServicePermissionsRequest.Builder = {
            value.fold(self){ v => self.maxResults(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicePermissionsRequest.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcEndpointServicePermissionsRequestOps(val self: DescribeVpcEndpointServicePermissionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceIdAsScala: Option[String] = Option(self.serviceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def maxResultsAsScala: Option[Int] = Option(self.maxResults) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServicePermissionsRequestOps {

implicit def toDescribeVpcEndpointServicePermissionsRequestBuilderOps(v: DescribeVpcEndpointServicePermissionsRequest.Builder): DescribeVpcEndpointServicePermissionsRequestBuilderOps = new DescribeVpcEndpointServicePermissionsRequestBuilderOps(v)

implicit def toDescribeVpcEndpointServicePermissionsRequestOps(v: DescribeVpcEndpointServicePermissionsRequest): DescribeVpcEndpointServicePermissionsRequestOps = new DescribeVpcEndpointServicePermissionsRequestOps(v)

}

