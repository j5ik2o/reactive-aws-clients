// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HostInstanceBuilderOps(val self: HostInstance.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): HostInstance.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): HostInstance.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

}

final class HostInstanceOps(val self: HostInstance) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHostInstanceOps {

  implicit def toHostInstanceBuilderOps(v: HostInstance.Builder): HostInstanceBuilderOps = new HostInstanceBuilderOps(v)

  implicit def toHostInstanceOps(v: HostInstance): HostInstanceOps = new HostInstanceOps(v)

}
