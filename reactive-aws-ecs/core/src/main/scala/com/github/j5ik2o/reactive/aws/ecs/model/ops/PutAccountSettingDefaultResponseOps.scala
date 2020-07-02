// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAccountSettingDefaultResponseBuilderOps(val self: PutAccountSettingDefaultResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingAsScala(value: Option[Setting]): PutAccountSettingDefaultResponse.Builder = {
    value.fold(self) { v => self.setting(v) }
  }

}

final class PutAccountSettingDefaultResponseOps(val self: PutAccountSettingDefaultResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingAsScala: Option[Setting] = Option(self.setting)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAccountSettingDefaultResponseOps {

  implicit def toPutAccountSettingDefaultResponseBuilderOps(
      v: PutAccountSettingDefaultResponse.Builder
  ): PutAccountSettingDefaultResponseBuilderOps = new PutAccountSettingDefaultResponseBuilderOps(v)

  implicit def toPutAccountSettingDefaultResponseOps(
      v: PutAccountSettingDefaultResponse
  ): PutAccountSettingDefaultResponseOps = new PutAccountSettingDefaultResponseOps(v)

}
