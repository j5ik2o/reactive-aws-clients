// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceSpecificationBuilderOps(val self: InstanceSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): InstanceSpecification.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludeBootVolumeAsScala(value: Option[Boolean]): InstanceSpecification.Builder = {
    value.fold(self) { v => self.excludeBootVolume(v) }
  }

}

final class InstanceSpecificationOps(val self: InstanceSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def excludeBootVolumeAsScala: Option[Boolean] = Option(self.excludeBootVolume)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceSpecificationOps {

  implicit def toInstanceSpecificationBuilderOps(v: InstanceSpecification.Builder): InstanceSpecificationBuilderOps =
    new InstanceSpecificationBuilderOps(v)

  implicit def toInstanceSpecificationOps(v: InstanceSpecification): InstanceSpecificationOps =
    new InstanceSpecificationOps(v)

}
