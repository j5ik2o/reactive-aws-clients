// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceCapacityBuilderOps(val self: InstanceCapacity.Builder) extends AnyVal {

  final def availableCapacityAsScala(value: Option[Int]): InstanceCapacity.Builder = {
    value.fold(self) { v =>
      self.availableCapacity(v)
    }
  }

  final def instanceTypeAsScala(value: Option[String]): InstanceCapacity.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

  final def totalCapacityAsScala(value: Option[Int]): InstanceCapacity.Builder = {
    value.fold(self) { v =>
      self.totalCapacity(v)
    }
  }

}

final class InstanceCapacityOps(val self: InstanceCapacity) extends AnyVal {

  final def availableCapacityAsScala: Option[Int] = Option(self.availableCapacity)

  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

  final def totalCapacityAsScala: Option[Int] = Option(self.totalCapacity)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCapacityOps {

  implicit def toInstanceCapacityBuilderOps(v: InstanceCapacity.Builder): InstanceCapacityBuilderOps =
    new InstanceCapacityBuilderOps(v)

  implicit def toInstanceCapacityOps(v: InstanceCapacity): InstanceCapacityOps = new InstanceCapacityOps(v)

}
