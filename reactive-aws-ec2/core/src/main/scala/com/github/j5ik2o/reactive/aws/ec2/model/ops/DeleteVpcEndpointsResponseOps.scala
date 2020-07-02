// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteVpcEndpointsResponseBuilderOps(val self: DeleteVpcEndpointsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala(value: Option[Seq[UnsuccessfulItem]]): DeleteVpcEndpointsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessful(v.asJava)
    }
  }

}

final class DeleteVpcEndpointsResponseOps(val self: DeleteVpcEndpointsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unsuccessfulAsScala: Option[Seq[UnsuccessfulItem]] =
    Option(self.unsuccessful).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteVpcEndpointsResponseOps {

  implicit def toDeleteVpcEndpointsResponseBuilderOps(
      v: DeleteVpcEndpointsResponse.Builder
  ): DeleteVpcEndpointsResponseBuilderOps = new DeleteVpcEndpointsResponseBuilderOps(v)

  implicit def toDeleteVpcEndpointsResponseOps(v: DeleteVpcEndpointsResponse): DeleteVpcEndpointsResponseOps =
    new DeleteVpcEndpointsResponseOps(v)

}
