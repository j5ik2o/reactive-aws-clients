// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SystemControlBuilderOps(val self: SystemControl.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): SystemControl.Builder = {
    value.fold(self) { v => self.namespace(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[String]): SystemControl.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class SystemControlOps(val self: SystemControl) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSystemControlOps {

  implicit def toSystemControlBuilderOps(v: SystemControl.Builder): SystemControlBuilderOps =
    new SystemControlBuilderOps(v)

  implicit def toSystemControlOps(v: SystemControl): SystemControlOps = new SystemControlOps(v)

}
