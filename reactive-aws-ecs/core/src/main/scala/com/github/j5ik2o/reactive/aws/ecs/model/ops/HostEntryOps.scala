// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class HostEntryBuilderOps(val self: HostEntry.Builder) extends AnyVal {

  final def hostnameAsScala(value: Option[String]): HostEntry.Builder = {
    value.fold(self) { v =>
      self.hostname(v)
    }
  }

  final def ipAddressAsScala(value: Option[String]): HostEntry.Builder = {
    value.fold(self) { v =>
      self.ipAddress(v)
    }
  }

}

final class HostEntryOps(val self: HostEntry) extends AnyVal {

  final def hostnameAsScala: Option[String] = Option(self.hostname)

  final def ipAddressAsScala: Option[String] = Option(self.ipAddress)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostEntryOps {

  implicit def toHostEntryBuilderOps(v: HostEntry.Builder): HostEntryBuilderOps = new HostEntryBuilderOps(v)

  implicit def toHostEntryOps(v: HostEntry): HostEntryOps = new HostEntryOps(v)

}
