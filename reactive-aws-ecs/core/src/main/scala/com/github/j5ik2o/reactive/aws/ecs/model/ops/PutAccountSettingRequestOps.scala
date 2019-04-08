// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAccountSettingRequestBuilderOps(val self: PutAccountSettingRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[SettingName]): PutAccountSettingRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valueAsScala(value: Option[String]): PutAccountSettingRequest.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

  final def principalArnAsScala(value: Option[String]): PutAccountSettingRequest.Builder = {
    value.fold(self) { v =>
      self.principalArn(v)
    }
  }

}

final class PutAccountSettingRequestOps(val self: PutAccountSettingRequest) extends AnyVal {

  final def nameAsScala: Option[SettingName] = Option(self.name)

  final def valueAsScala: Option[String] = Option(self.value)

  final def principalArnAsScala: Option[String] = Option(self.principalArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAccountSettingRequestOps {

  implicit def toPutAccountSettingRequestBuilderOps(
      v: PutAccountSettingRequest.Builder
  ): PutAccountSettingRequestBuilderOps = new PutAccountSettingRequestBuilderOps(v)

  implicit def toPutAccountSettingRequestOps(v: PutAccountSettingRequest): PutAccountSettingRequestOps =
    new PutAccountSettingRequestOps(v)

}
