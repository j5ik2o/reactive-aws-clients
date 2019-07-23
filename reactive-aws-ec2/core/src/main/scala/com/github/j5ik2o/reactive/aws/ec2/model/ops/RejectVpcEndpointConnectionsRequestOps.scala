// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RejectVpcEndpointConnectionsRequestBuilderOps(val self: RejectVpcEndpointConnectionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): RejectVpcEndpointConnectionsRequest.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala(value: Option[Seq[String]]): RejectVpcEndpointConnectionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.vpcEndpointIds(v.asJava)
    }
  }

}

final class RejectVpcEndpointConnectionsRequestOps(val self: RejectVpcEndpointConnectionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointIdsAsScala: Option[Seq[String]] = Option(self.vpcEndpointIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRejectVpcEndpointConnectionsRequestOps {

  implicit def toRejectVpcEndpointConnectionsRequestBuilderOps(
      v: RejectVpcEndpointConnectionsRequest.Builder
  ): RejectVpcEndpointConnectionsRequestBuilderOps = new RejectVpcEndpointConnectionsRequestBuilderOps(v)

  implicit def toRejectVpcEndpointConnectionsRequestOps(
      v: RejectVpcEndpointConnectionsRequest
  ): RejectVpcEndpointConnectionsRequestOps = new RejectVpcEndpointConnectionsRequestOps(v)

}
