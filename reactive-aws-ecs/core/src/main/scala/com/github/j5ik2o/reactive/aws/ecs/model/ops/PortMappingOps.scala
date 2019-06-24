// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class PortMappingBuilderOps(val self: PortMapping.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala(value: Option[Int]): PortMapping.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPortAsScala(value: Option[Int]): PortMapping.Builder = {
    value.fold(self) { v =>
      self.hostPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[TransportProtocol]): PortMapping.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

}

final class PortMappingOps(val self: PortMapping) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPortAsScala: Option[Int] = Option(self.hostPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[TransportProtocol] = Option(self.protocol)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPortMappingOps {

  implicit def toPortMappingBuilderOps(v: PortMapping.Builder): PortMappingBuilderOps = new PortMappingBuilderOps(v)

  implicit def toPortMappingOps(v: PortMapping): PortMappingOps = new PortMappingOps(v)

}
