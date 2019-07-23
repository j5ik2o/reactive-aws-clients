// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AcceptVpcEndpointConnectionsResponseBuilderOps(val self: AcceptVpcEndpointConnectionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): AcceptVpcEndpointConnectionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class AcceptVpcEndpointConnectionsResponseOps(val self: AcceptVpcEndpointConnectionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAcceptVpcEndpointConnectionsResponseOps {

  implicit def toAcceptVpcEndpointConnectionsResponseBuilderOps(
      v: AcceptVpcEndpointConnectionsResponse.Builder
  ): AcceptVpcEndpointConnectionsResponseBuilderOps = new AcceptVpcEndpointConnectionsResponseBuilderOps(v)

  implicit def toAcceptVpcEndpointConnectionsResponseOps(
      v: AcceptVpcEndpointConnectionsResponse
  ): AcceptVpcEndpointConnectionsResponseOps = new AcceptVpcEndpointConnectionsResponseOps(v)

}
