// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class EnvironmentFileBuilderOps(val self: EnvironmentFile.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): EnvironmentFile.Builder = {
    value.fold(self) { v => self.value(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[EnvironmentFileType]): EnvironmentFile.Builder = {
    value.fold(self) { v => self.`type`(v) }
  }

}

final class EnvironmentFileOps(val self: EnvironmentFile) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[EnvironmentFileType] = Option(self.`type`)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnvironmentFileOps {

  implicit def toEnvironmentFileBuilderOps(v: EnvironmentFile.Builder): EnvironmentFileBuilderOps =
    new EnvironmentFileBuilderOps(v)

  implicit def toEnvironmentFileOps(v: EnvironmentFile): EnvironmentFileOps = new EnvironmentFileOps(v)

}
