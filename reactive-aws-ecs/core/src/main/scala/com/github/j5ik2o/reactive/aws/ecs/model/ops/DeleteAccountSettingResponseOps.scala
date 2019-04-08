// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteAccountSettingResponseBuilderOps(val self: DeleteAccountSettingResponse.Builder) extends AnyVal {

  final def settingAsScala(value: Option[Setting]): DeleteAccountSettingResponse.Builder = {
    value.fold(self) { v =>
      self.setting(v)
    }
  }

}

final class DeleteAccountSettingResponseOps(val self: DeleteAccountSettingResponse) extends AnyVal {

  final def settingAsScala: Option[Setting] = Option(self.setting)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAccountSettingResponseOps {

  implicit def toDeleteAccountSettingResponseBuilderOps(
      v: DeleteAccountSettingResponse.Builder
  ): DeleteAccountSettingResponseBuilderOps = new DeleteAccountSettingResponseBuilderOps(v)

  implicit def toDeleteAccountSettingResponseOps(v: DeleteAccountSettingResponse): DeleteAccountSettingResponseOps =
    new DeleteAccountSettingResponseOps(v)

}
