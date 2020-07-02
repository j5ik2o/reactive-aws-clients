// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UpdateClusterSettingsRequestBuilderOps(val self: UpdateClusterSettingsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): UpdateClusterSettingsRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala(value: Option[Seq[ClusterSetting]]): UpdateClusterSettingsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.settings(v.asJava)
    }
  }

}

final class UpdateClusterSettingsRequestOps(val self: UpdateClusterSettingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala: Option[Seq[ClusterSetting]] =
    Option(self.settings).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterSettingsRequestOps {

  implicit def toUpdateClusterSettingsRequestBuilderOps(
      v: UpdateClusterSettingsRequest.Builder
  ): UpdateClusterSettingsRequestBuilderOps = new UpdateClusterSettingsRequestBuilderOps(v)

  implicit def toUpdateClusterSettingsRequestOps(v: UpdateClusterSettingsRequest): UpdateClusterSettingsRequestOps =
    new UpdateClusterSettingsRequestOps(v)

}
