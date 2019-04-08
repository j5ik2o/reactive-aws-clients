// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostPropertiesBuilderOps(val self: HostProperties.Builder) extends AnyVal {

  final def coresAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.cores(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def socketsAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.sockets(v)
    }
  }

  final def totalVCpusAsScala(value: Option[Int]): HostProperties.Builder = {
    value.fold(self) { v =>
      self.totalVCpus(v)
    }
  }

}

final class HostPropertiesOps(val self: HostProperties) extends AnyVal {

  final def coresAsScala: Option[Int] = Option(self.cores)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def socketsAsScala: Option[Int] = Option(self.sockets)

  final def totalVCpusAsScala: Option[Int] = Option(self.totalVCpus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostPropertiesOps {

  implicit def toHostPropertiesBuilderOps(v: HostProperties.Builder): HostPropertiesBuilderOps =
    new HostPropertiesBuilderOps(v)

  implicit def toHostPropertiesOps(v: HostProperties): HostPropertiesOps = new HostPropertiesOps(v)

}
