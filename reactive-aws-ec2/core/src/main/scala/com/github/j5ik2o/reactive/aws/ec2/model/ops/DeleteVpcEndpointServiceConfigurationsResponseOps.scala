// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointServiceConfigurationsResponseBuilderOps(val self: DeleteVpcEndpointServiceConfigurationsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): DeleteVpcEndpointServiceConfigurationsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava) } 
            }


}

final class DeleteVpcEndpointServiceConfigurationsResponseOps(val self: DeleteVpcEndpointServiceConfigurationsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointServiceConfigurationsResponseOps {

implicit def toDeleteVpcEndpointServiceConfigurationsResponseBuilderOps(v: DeleteVpcEndpointServiceConfigurationsResponse.Builder): DeleteVpcEndpointServiceConfigurationsResponseBuilderOps = new DeleteVpcEndpointServiceConfigurationsResponseBuilderOps(v)

implicit def toDeleteVpcEndpointServiceConfigurationsResponseOps(v: DeleteVpcEndpointServiceConfigurationsResponse): DeleteVpcEndpointServiceConfigurationsResponseOps = new DeleteVpcEndpointServiceConfigurationsResponseOps(v)

}

