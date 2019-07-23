// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class NetworkBindingBuilderOps(val self: NetworkBinding.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bindIPAsScala(value: Option[String]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.bindIP(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala(value: Option[Int]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPortAsScala(value: Option[Int]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.hostPort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala(value: Option[TransportProtocol]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

}

final class NetworkBindingOps(val self: NetworkBinding) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bindIPAsScala: Option[String] = Option(self.bindIP)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostPortAsScala: Option[Int] = Option(self.hostPort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def protocolAsScala: Option[TransportProtocol] = Option(self.protocol)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkBindingOps {

  implicit def toNetworkBindingBuilderOps(v: NetworkBinding.Builder): NetworkBindingBuilderOps =
    new NetworkBindingBuilderOps(v)

  implicit def toNetworkBindingOps(v: NetworkBinding): NetworkBindingOps = new NetworkBindingOps(v)

}
