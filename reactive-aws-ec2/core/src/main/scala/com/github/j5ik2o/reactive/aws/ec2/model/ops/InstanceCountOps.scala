// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceCountBuilderOps(val self: InstanceCount.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala(value: Option[Int]): InstanceCount.Builder = {
    value.fold(self) { v =>
      self.instanceCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[ListingState]): InstanceCount.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

}

final class InstanceCountOps(val self: InstanceCount) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceCountAsScala: Option[Int] = Option(self.instanceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[ListingState] = Option(self.state)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCountOps {

  implicit def toInstanceCountBuilderOps(v: InstanceCount.Builder): InstanceCountBuilderOps =
    new InstanceCountBuilderOps(v)

  implicit def toInstanceCountOps(v: InstanceCount): InstanceCountOps = new InstanceCountOps(v)

}
