// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointConnectionNotificationsRequestBuilderOps(val self: DeleteVpcEndpointConnectionNotificationsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def connectionNotificationIdsAsScala(value: Option[Seq[String]]): DeleteVpcEndpointConnectionNotificationsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.connectionNotificationIds(v.asJava) } 
            }


}

final class DeleteVpcEndpointConnectionNotificationsRequestOps(val self: DeleteVpcEndpointConnectionNotificationsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def connectionNotificationIdsAsScala: Option[Seq[String]] = Option(self.connectionNotificationIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointConnectionNotificationsRequestOps {

implicit def toDeleteVpcEndpointConnectionNotificationsRequestBuilderOps(v: DeleteVpcEndpointConnectionNotificationsRequest.Builder): DeleteVpcEndpointConnectionNotificationsRequestBuilderOps = new DeleteVpcEndpointConnectionNotificationsRequestBuilderOps(v)

implicit def toDeleteVpcEndpointConnectionNotificationsRequestOps(v: DeleteVpcEndpointConnectionNotificationsRequest): DeleteVpcEndpointConnectionNotificationsRequestOps = new DeleteVpcEndpointConnectionNotificationsRequestOps(v)

}

