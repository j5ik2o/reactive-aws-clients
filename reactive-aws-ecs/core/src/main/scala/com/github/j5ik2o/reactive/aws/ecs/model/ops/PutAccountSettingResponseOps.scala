// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAccountSettingResponseBuilderOps(val self: PutAccountSettingResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingAsScala(value: Option[Setting]): PutAccountSettingResponse.Builder = {
    value.fold(self) { v => self.setting(v) }
  }

}

final class PutAccountSettingResponseOps(val self: PutAccountSettingResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingAsScala: Option[Setting] = Option(self.setting)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAccountSettingResponseOps {

  implicit def toPutAccountSettingResponseBuilderOps(
      v: PutAccountSettingResponse.Builder
  ): PutAccountSettingResponseBuilderOps = new PutAccountSettingResponseBuilderOps(v)

  implicit def toPutAccountSettingResponseOps(v: PutAccountSettingResponse): PutAccountSettingResponseOps =
    new PutAccountSettingResponseOps(v)

}
