// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NetworkInfoBuilderOps(val self: NetworkInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkPerformanceAsScala(value: Option[String]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.networkPerformance(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumNetworkInterfacesAsScala(value: Option[Int]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.maximumNetworkInterfaces(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv4AddressesPerInterfaceAsScala(value: Option[Int]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.ipv4AddressesPerInterface(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesPerInterfaceAsScala(value: Option[Int]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressesPerInterface(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportedAsScala(value: Option[Boolean]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.ipv6Supported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala(value: Option[EnaSupport]): NetworkInfo.Builder = {
    value.fold(self) { v =>
      self.enaSupport(v)
    }
  }

}

final class NetworkInfoOps(val self: NetworkInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkPerformanceAsScala: Option[String] = Option(self.networkPerformance)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maximumNetworkInterfacesAsScala: Option[Int] = Option(self.maximumNetworkInterfaces)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv4AddressesPerInterfaceAsScala: Option[Int] = Option(self.ipv4AddressesPerInterface)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6AddressesPerInterfaceAsScala: Option[Int] = Option(self.ipv6AddressesPerInterface)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipv6SupportedAsScala: Option[Boolean] = Option(self.ipv6Supported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enaSupportAsScala: Option[EnaSupport] = Option(self.enaSupport)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNetworkInfoOps {

  implicit def toNetworkInfoBuilderOps(v: NetworkInfo.Builder): NetworkInfoBuilderOps = new NetworkInfoBuilderOps(v)

  implicit def toNetworkInfoOps(v: NetworkInfo): NetworkInfoOps = new NetworkInfoOps(v)

}
