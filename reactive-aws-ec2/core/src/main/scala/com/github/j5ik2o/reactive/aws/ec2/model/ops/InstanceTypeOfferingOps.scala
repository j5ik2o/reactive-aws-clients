// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceTypeOfferingBuilderOps(val self: InstanceTypeOffering.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[InstanceType]): InstanceTypeOffering.Builder = {
    value.fold(self) { v => self.instanceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationTypeAsScala(value: Option[LocationType]): InstanceTypeOffering.Builder = {
    value.fold(self) { v => self.locationType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala(value: Option[String]): InstanceTypeOffering.Builder = {
    value.fold(self) { v => self.location(v) }
  }

}

final class InstanceTypeOfferingOps(val self: InstanceTypeOffering) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationTypeAsScala: Option[LocationType] = Option(self.locationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationAsScala: Option[String] = Option(self.location)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceTypeOfferingOps {

  implicit def toInstanceTypeOfferingBuilderOps(v: InstanceTypeOffering.Builder): InstanceTypeOfferingBuilderOps =
    new InstanceTypeOfferingBuilderOps(v)

  implicit def toInstanceTypeOfferingOps(v: InstanceTypeOffering): InstanceTypeOfferingOps =
    new InstanceTypeOfferingOps(v)

}
