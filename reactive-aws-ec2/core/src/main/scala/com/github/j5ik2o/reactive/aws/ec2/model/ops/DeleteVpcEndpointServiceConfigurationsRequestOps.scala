// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointServiceConfigurationsRequestBuilderOps(
    val self: DeleteVpcEndpointServiceConfigurationsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdsAsScala(value: Option[Seq[String]]): DeleteVpcEndpointServiceConfigurationsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceIds(v.asJava)
    }
  }

}

final class DeleteVpcEndpointServiceConfigurationsRequestOps(val self: DeleteVpcEndpointServiceConfigurationsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdsAsScala: Option[Seq[String]] = Option(self.serviceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointServiceConfigurationsRequestOps {

  implicit def toDeleteVpcEndpointServiceConfigurationsRequestBuilderOps(
      v: DeleteVpcEndpointServiceConfigurationsRequest.Builder
  ): DeleteVpcEndpointServiceConfigurationsRequestBuilderOps =
    new DeleteVpcEndpointServiceConfigurationsRequestBuilderOps(v)

  implicit def toDeleteVpcEndpointServiceConfigurationsRequestOps(
      v: DeleteVpcEndpointServiceConfigurationsRequest
  ): DeleteVpcEndpointServiceConfigurationsRequestOps = new DeleteVpcEndpointServiceConfigurationsRequestOps(v)

}
