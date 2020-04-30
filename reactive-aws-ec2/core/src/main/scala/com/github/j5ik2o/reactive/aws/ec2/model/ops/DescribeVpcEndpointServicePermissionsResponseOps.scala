// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeVpcEndpointServicePermissionsResponseBuilderOps(val self: DescribeVpcEndpointServicePermissionsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def allowedPrincipalsAsScala(value: Option[Seq[AllowedPrincipal]]): DescribeVpcEndpointServicePermissionsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allowedPrincipals(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala(value: Option[String]): DescribeVpcEndpointServicePermissionsResponse.Builder = {
            value.fold(self){ v => self.nextToken(v) }
            } 


}

final class DescribeVpcEndpointServicePermissionsResponseOps(val self: DescribeVpcEndpointServicePermissionsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def allowedPrincipalsAsScala: Option[Seq[AllowedPrincipal]] = Option(self.allowedPrincipals).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nextTokenAsScala: Option[String] = Option(self.nextToken) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeVpcEndpointServicePermissionsResponseOps {

implicit def toDescribeVpcEndpointServicePermissionsResponseBuilderOps(v: DescribeVpcEndpointServicePermissionsResponse.Builder): DescribeVpcEndpointServicePermissionsResponseBuilderOps = new DescribeVpcEndpointServicePermissionsResponseBuilderOps(v)

implicit def toDescribeVpcEndpointServicePermissionsResponseOps(v: DescribeVpcEndpointServicePermissionsResponse): DescribeVpcEndpointServicePermissionsResponseOps = new DescribeVpcEndpointServicePermissionsResponseOps(v)

}

