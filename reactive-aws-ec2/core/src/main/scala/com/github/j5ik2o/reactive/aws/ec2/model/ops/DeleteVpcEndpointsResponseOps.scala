// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointsResponseBuilderOps(val self: DeleteVpcEndpointsResponse.Builder) extends AnyVal {

  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): DeleteVpcEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessful(v.asJava)
    }
  }

}

final class DeleteVpcEndpointsResponseOps(val self: DeleteVpcEndpointsResponse) extends AnyVal {

  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] = Option(self.unsuccessful).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointsResponseOps {

  implicit def toDeleteVpcEndpointsResponseBuilderOps(
      v: DeleteVpcEndpointsResponse.Builder
  ): DeleteVpcEndpointsResponseBuilderOps = new DeleteVpcEndpointsResponseBuilderOps(v)

  implicit def toDeleteVpcEndpointsResponseOps(v: DeleteVpcEndpointsResponse): DeleteVpcEndpointsResponseOps =
    new DeleteVpcEndpointsResponseOps(v)

}
