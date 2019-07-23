// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RequestSpotInstancesResponseBuilderOps(val self: RequestSpotInstancesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestsAsScala(
      value: Option[Seq[SpotInstanceRequest]]
  ): RequestSpotInstancesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.spotInstanceRequests(v.asJava)
    }
  }

}

final class RequestSpotInstancesResponseOps(val self: RequestSpotInstancesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def spotInstanceRequestsAsScala: Option[Seq[SpotInstanceRequest]] = Option(self.spotInstanceRequests).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestSpotInstancesResponseOps {

  implicit def toRequestSpotInstancesResponseBuilderOps(
      v: RequestSpotInstancesResponse.Builder
  ): RequestSpotInstancesResponseBuilderOps = new RequestSpotInstancesResponseBuilderOps(v)

  implicit def toRequestSpotInstancesResponseOps(v: RequestSpotInstancesResponse): RequestSpotInstancesResponseOps =
    new RequestSpotInstancesResponseOps(v)

}
