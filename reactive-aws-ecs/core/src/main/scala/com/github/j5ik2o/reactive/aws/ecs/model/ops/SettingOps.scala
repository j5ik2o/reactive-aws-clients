// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SettingBuilderOps(val self: Setting.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[SettingName]): Setting.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): Setting.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala(value: Option[String]): Setting.Builder = {
    value.fold(self) { v =>
      self.principalArn(v)
    }
  }

}

final class SettingOps(val self: Setting) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[SettingName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala: Option[String] = Option(self.principalArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSettingOps {

  implicit def toSettingBuilderOps(v: Setting.Builder): SettingBuilderOps = new SettingBuilderOps(v)

  implicit def toSettingOps(v: Setting): SettingOps = new SettingOps(v)

}
