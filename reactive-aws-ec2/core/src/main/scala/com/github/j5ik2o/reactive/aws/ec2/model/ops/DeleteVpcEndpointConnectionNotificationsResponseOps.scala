// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointConnectionNotificationsResponseBuilderOps(
    val self: DeleteVpcEndpointConnectionNotificationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(
      value: Option[Seq[UnsuccessfulItem]]
  ): DeleteVpcEndpointConnectionNotificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class DeleteVpcEndpointConnectionNotificationsResponseOps(
    val self: DeleteVpcEndpointConnectionNotificationsResponse
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointConnectionNotificationsResponseOps {

  implicit def toDeleteVpcEndpointConnectionNotificationsResponseBuilderOps(
      v: DeleteVpcEndpointConnectionNotificationsResponse.Builder
  ): DeleteVpcEndpointConnectionNotificationsResponseBuilderOps =
    new DeleteVpcEndpointConnectionNotificationsResponseBuilderOps(v)

  implicit def toDeleteVpcEndpointConnectionNotificationsResponseOps(
      v: DeleteVpcEndpointConnectionNotificationsResponse
  ): DeleteVpcEndpointConnectionNotificationsResponseOps = new DeleteVpcEndpointConnectionNotificationsResponseOps(v)

}
