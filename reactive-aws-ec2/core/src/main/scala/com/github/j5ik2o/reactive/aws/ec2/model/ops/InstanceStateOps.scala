// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceStateBuilderOps(val self: InstanceState.Builder) extends AnyVal {

  final def codeAsScala(value: Option[Int]): InstanceState.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def nameAsScala(value: Option[InstanceStateName]): InstanceState.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class InstanceStateOps(val self: InstanceState) extends AnyVal {

  final def codeAsScala: Option[Int] = Option(self.code)

  final def nameAsScala: Option[InstanceStateName] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceStateOps {

  implicit def toInstanceStateBuilderOps(v: InstanceState.Builder): InstanceStateBuilderOps =
    new InstanceStateBuilderOps(v)

  implicit def toInstanceStateOps(v: InstanceState): InstanceStateOps = new InstanceStateOps(v)

}
