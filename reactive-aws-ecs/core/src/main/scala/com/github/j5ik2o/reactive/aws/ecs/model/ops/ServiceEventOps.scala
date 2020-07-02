// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ServiceEventBuilderOps(val self: ServiceEvent.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): ServiceEvent.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): ServiceEvent.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): ServiceEvent.Builder = {
    value.fold(self) { v => self.message(v) }
  }

}

final class ServiceEventOps(val self: ServiceEvent) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceEventOps {

  implicit def toServiceEventBuilderOps(v: ServiceEvent.Builder): ServiceEventBuilderOps = new ServiceEventBuilderOps(v)

  implicit def toServiceEventOps(v: ServiceEvent): ServiceEventOps = new ServiceEventOps(v)

}
