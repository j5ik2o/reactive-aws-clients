// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DeleteAccountSettingRequestBuilderOps(val self: DeleteAccountSettingRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[SettingName]): DeleteAccountSettingRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala(value: Option[String]): DeleteAccountSettingRequest.Builder = {
    value.fold(self) { v =>
      self.principalArn(v)
    }
  }

}

final class DeleteAccountSettingRequestOps(val self: DeleteAccountSettingRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[SettingName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def principalArnAsScala: Option[String] = Option(self.principalArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAccountSettingRequestOps {

  implicit def toDeleteAccountSettingRequestBuilderOps(
      v: DeleteAccountSettingRequest.Builder
  ): DeleteAccountSettingRequestBuilderOps = new DeleteAccountSettingRequestBuilderOps(v)

  implicit def toDeleteAccountSettingRequestOps(v: DeleteAccountSettingRequest): DeleteAccountSettingRequestOps =
    new DeleteAccountSettingRequestOps(v)

}
