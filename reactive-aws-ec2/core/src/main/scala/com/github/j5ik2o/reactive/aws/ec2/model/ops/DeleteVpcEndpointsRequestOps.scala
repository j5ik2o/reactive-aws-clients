// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointsRequestBuilderOps(val self: DeleteVpcEndpointsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala(value: Option[Seq[String]]): DeleteVpcEndpointsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcEndpointIds(v.asJava)
    }
  }

}

final class DeleteVpcEndpointsRequestOps(val self: DeleteVpcEndpointsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala: Option[Seq[String]] =
    Option(self.vpcEndpointIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointsRequestOps {

  implicit def toDeleteVpcEndpointsRequestBuilderOps(
      v: DeleteVpcEndpointsRequest.Builder
  ): DeleteVpcEndpointsRequestBuilderOps = new DeleteVpcEndpointsRequestBuilderOps(v)

  implicit def toDeleteVpcEndpointsRequestOps(v: DeleteVpcEndpointsRequest): DeleteVpcEndpointsRequestOps =
    new DeleteVpcEndpointsRequestOps(v)

}
