// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostPropertiesBuilderOps(val self: HostProperties.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coresAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.cores(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala(value: Option[String]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.instanceFamily(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def socketsAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.sockets(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalVCpusAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.totalVCpus(v)
    }
  }

}

final class HostPropertiesOps(val self: HostProperties) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def coresAsScala: Option[Int] = Option(self.cores)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceFamilyAsScala: Option[String] = Option(self.instanceFamily)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def socketsAsScala: Option[Int] = Option(self.sockets)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalVCpusAsScala: Option[Int] = Option(self.totalVCpus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostPropertiesOps {

  implicit def toHostPropertiesBuilderOps(v: HostProperties.Builder): HostPropertiesBuilderOps =
    new HostPropertiesBuilderOps(v)

  implicit def toHostPropertiesOps(v: HostProperties): HostPropertiesOps = new HostPropertiesOps(v)

}
