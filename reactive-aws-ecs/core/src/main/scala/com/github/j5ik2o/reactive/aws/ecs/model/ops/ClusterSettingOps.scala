// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ClusterSettingBuilderOps(val self: ClusterSetting.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[ClusterSettingName]): ClusterSetting.Builder = {
    value.fold(self) { v => self.name(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): ClusterSetting.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class ClusterSettingOps(val self: ClusterSetting) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[ClusterSettingName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterSettingOps {

  implicit def toClusterSettingBuilderOps(v: ClusterSetting.Builder): ClusterSettingBuilderOps =
    new ClusterSettingBuilderOps(v)

  implicit def toClusterSettingOps(v: ClusterSetting): ClusterSettingOps = new ClusterSettingOps(v)

}
