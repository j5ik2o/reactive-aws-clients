// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateClusterSettingsResponseBuilderOps(val self: UpdateClusterSettingsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[Cluster]): UpdateClusterSettingsResponse.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

}

final class UpdateClusterSettingsResponseOps(val self: UpdateClusterSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[Cluster] = Option(self.cluster)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterSettingsResponseOps {

  implicit def toUpdateClusterSettingsResponseBuilderOps(
      v: UpdateClusterSettingsResponse.Builder
  ): UpdateClusterSettingsResponseBuilderOps = new UpdateClusterSettingsResponseBuilderOps(v)

  implicit def toUpdateClusterSettingsResponseOps(v: UpdateClusterSettingsResponse): UpdateClusterSettingsResponseOps =
    new UpdateClusterSettingsResponseOps(v)

}
