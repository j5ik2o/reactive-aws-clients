// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStateChangeBuilderOps(val self: InstanceStateChange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentStateAsScala(value: Option[InstanceState]): InstanceStateChange.Builder = {
    value.fold(self) { v => self.currentState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): InstanceStateChange.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStateAsScala(value: Option[InstanceState]): InstanceStateChange.Builder = {
    value.fold(self) { v => self.previousState(v) }
  }

}

final class InstanceStateChangeOps(val self: InstanceStateChange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentStateAsScala: Option[InstanceState] = Option(self.currentState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousStateAsScala: Option[InstanceState] = Option(self.previousState)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStateChangeOps {

  implicit def toInstanceStateChangeBuilderOps(v: InstanceStateChange.Builder): InstanceStateChangeBuilderOps =
    new InstanceStateChangeBuilderOps(v)

  implicit def toInstanceStateChangeOps(v: InstanceStateChange): InstanceStateChangeOps = new InstanceStateChangeOps(v)

}
