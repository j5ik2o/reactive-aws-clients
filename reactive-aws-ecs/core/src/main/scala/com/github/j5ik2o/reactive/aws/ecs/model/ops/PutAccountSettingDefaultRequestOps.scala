// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PutAccountSettingDefaultRequestBuilderOps(val self: PutAccountSettingDefaultRequest.Builder)
    extends AnyVal {

  final def nameAsScala(value: Option[SettingName]): PutAccountSettingDefaultRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def valueAsScala(value: Option[String]): PutAccountSettingDefaultRequest.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class PutAccountSettingDefaultRequestOps(val self: PutAccountSettingDefaultRequest) extends AnyVal {

  final def nameAsScala: Option[SettingName] = Option(self.name)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutAccountSettingDefaultRequestOps {

  implicit def toPutAccountSettingDefaultRequestBuilderOps(
      v: PutAccountSettingDefaultRequest.Builder
  ): PutAccountSettingDefaultRequestBuilderOps = new PutAccountSettingDefaultRequestBuilderOps(v)

  implicit def toPutAccountSettingDefaultRequestOps(
      v: PutAccountSettingDefaultRequest
  ): PutAccountSettingDefaultRequestOps = new PutAccountSettingDefaultRequestOps(v)

}
