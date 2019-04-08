// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ActiveInstanceBuilderOps(val self: ActiveInstance.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): ActiveInstance.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): ActiveInstance.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def spotInstanceRequestIdAsScala(value: Option[String]): ActiveInstance.Builder = {
    value.fold(self) { v =>
      self.spotInstanceRequestId(v)
    }
  }

  final def instanceHealthAsScala(value: Option[InstanceHealthStatus]): ActiveInstance.Builder = {
    value.fold(self) { v =>
      self.instanceHealth(v)
    }
  }

}

final class ActiveInstanceOps(val self: ActiveInstance) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def spotInstanceRequestIdAsScala: Option[String] = Option(self.spotInstanceRequestId)

  final def instanceHealthAsScala: Option[InstanceHealthStatus] = Option(self.instanceHealth)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToActiveInstanceOps {

  implicit def toActiveInstanceBuilderOps(v: ActiveInstance.Builder): ActiveInstanceBuilderOps =
    new ActiveInstanceBuilderOps(v)

  implicit def toActiveInstanceOps(v: ActiveInstance): ActiveInstanceOps = new ActiveInstanceOps(v)

}
