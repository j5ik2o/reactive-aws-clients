// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutClusterCapacityProvidersResponseBuilderOps(val self: PutClusterCapacityProvidersResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[Cluster]): PutClusterCapacityProvidersResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class PutClusterCapacityProvidersResponseOps(val self: PutClusterCapacityProvidersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutClusterCapacityProvidersResponseOps {

  implicit def toPutClusterCapacityProvidersResponseBuilderOps(
      v: PutClusterCapacityProvidersResponse.Builder
  ): PutClusterCapacityProvidersResponseBuilderOps = new PutClusterCapacityProvidersResponseBuilderOps(v)

  implicit def toPutClusterCapacityProvidersResponseOps(
      v: PutClusterCapacityProvidersResponse
  ): PutClusterCapacityProvidersResponseOps = new PutClusterCapacityProvidersResponseOps(v)

}
