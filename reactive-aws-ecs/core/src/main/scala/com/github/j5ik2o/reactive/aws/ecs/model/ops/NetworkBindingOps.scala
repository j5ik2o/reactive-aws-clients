// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class NetworkBindingBuilderOps(val self: NetworkBinding.Builder) extends AnyVal {

  final def bindIPAsScala(value: Option[String]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.bindIP(v)
    }
  }

  final def containerPortAsScala(value: Option[Int]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.containerPort(v)
    }
  }

  final def hostPortAsScala(value: Option[Int]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.hostPort(v)
    }
  }

  final def protocolAsScala(value: Option[TransportProtocol]): NetworkBinding.Builder = {
    value.fold(self) { v =>
      self.protocol(v)
    }
  }

}

final class NetworkBindingOps(val self: NetworkBinding) extends AnyVal {

  final def bindIPAsScala: Option[String] = Option(self.bindIP)

  final def containerPortAsScala: Option[Int] = Option(self.containerPort)

  final def hostPortAsScala: Option[Int] = Option(self.hostPort)

  final def protocolAsScala: Option[TransportProtocol] = Option(self.protocol)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkBindingOps {

  implicit def toNetworkBindingBuilderOps(v: NetworkBinding.Builder): NetworkBindingBuilderOps =
    new NetworkBindingBuilderOps(v)

  implicit def toNetworkBindingOps(v: NetworkBinding): NetworkBindingOps = new NetworkBindingOps(v)

}
