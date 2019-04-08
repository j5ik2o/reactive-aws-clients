// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DecreaseReplicationFactorResponseBuilderOps(val self: DecreaseReplicationFactorResponse.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[Cluster]): DecreaseReplicationFactorResponse.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

}

final class DecreaseReplicationFactorResponseOps(val self: DecreaseReplicationFactorResponse) extends AnyVal {

  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDecreaseReplicationFactorResponseOps {

  implicit def toDecreaseReplicationFactorResponseBuilderOps(
      v: DecreaseReplicationFactorResponse.Builder
  ): DecreaseReplicationFactorResponseBuilderOps = new DecreaseReplicationFactorResponseBuilderOps(v)

  implicit def toDecreaseReplicationFactorResponseOps(
      v: DecreaseReplicationFactorResponse
  ): DecreaseReplicationFactorResponseOps = new DecreaseReplicationFactorResponseOps(v)

}
