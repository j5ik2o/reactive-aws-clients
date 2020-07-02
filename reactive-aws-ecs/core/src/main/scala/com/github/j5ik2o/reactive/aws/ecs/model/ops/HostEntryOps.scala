// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class HostEntryBuilderOps(val self: HostEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostnameAsScala(value: Option[String]): HostEntry.Builder = {
    value.fold(self) { v => self.hostname(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipAddressAsScala(value: Option[String]): HostEntry.Builder = {
    value.fold(self) { v => self.ipAddress(v) }
  }

}

final class HostEntryOps(val self: HostEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostnameAsScala: Option[String] = Option(self.hostname)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipAddressAsScala: Option[String] = Option(self.ipAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostEntryOps {

  implicit def toHostEntryBuilderOps(v: HostEntry.Builder): HostEntryBuilderOps = new HostEntryBuilderOps(v)

  implicit def toHostEntryOps(v: HostEntry): HostEntryOps = new HostEntryOps(v)

}
