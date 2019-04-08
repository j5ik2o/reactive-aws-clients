// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class IncreaseReplicationFactorResponseBuilderOps(val self: IncreaseReplicationFactorResponse.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[Cluster]): IncreaseReplicationFactorResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class IncreaseReplicationFactorResponseOps(val self: IncreaseReplicationFactorResponse) extends AnyVal {

  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIncreaseReplicationFactorResponseOps {

  implicit def toIncreaseReplicationFactorResponseBuilderOps(
      v: IncreaseReplicationFactorResponse.Builder
  ): IncreaseReplicationFactorResponseBuilderOps = new IncreaseReplicationFactorResponseBuilderOps(v)

  implicit def toIncreaseReplicationFactorResponseOps(
      v: IncreaseReplicationFactorResponse
  ): IncreaseReplicationFactorResponseOps = new IncreaseReplicationFactorResponseOps(v)

}
