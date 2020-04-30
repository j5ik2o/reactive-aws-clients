// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicesResponseBuilderOps(val self: DescribeVpcEndpointServicesResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceNamesAsScala(value: Option[Seq[String]]): DescribeVpcEndpointServicesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def serviceDetailsAsScala(value: Option[Seq[ServiceDetail]]): DescribeVpcEndpointServicesResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceDetails(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicesResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcEndpointServicesResponseOps(val self: DescribeVpcEndpointServicesResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def serviceNamesAsScala: Option[Seq[String]] = Option(self.serviceNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def serviceDetailsAsScala: Option[Seq[ServiceDetail]] = Option(self.serviceDetails).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServicesResponseOps {

implicit def toDescribeVpcEndpointServicesResponseBuilderOps(v: DescribeVpcEndpointServicesResponse.Builder): DescribeVpcEndpointServicesResponseBuilderOps = new DescribeVpcEndpointServicesResponseBuilderOps(v)

implicit def toDescribeVpcEndpointServicesResponseOps(v: DescribeVpcEndpointServicesResponse): DescribeVpcEndpointServicesResponseOps = new DescribeVpcEndpointServicesResponseOps(v)

}

