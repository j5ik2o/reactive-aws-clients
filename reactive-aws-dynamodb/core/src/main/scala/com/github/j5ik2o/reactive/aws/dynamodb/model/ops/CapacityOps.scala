// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CapacityBuilderOps(val self: Capacity.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v => self.readCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v => self.writeCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v => self.capacityUnits(v) }
  }

}

final class CapacityOps(val self: Capacity) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala: Option[Double] = Option(self.readCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala: Option[Double] = Option(self.writeCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityUnitsAsScala: Option[Double] = Option(self.capacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityOps {

  implicit def toCapacityBuilderOps(v: Capacity.Builder): CapacityBuilderOps = new CapacityBuilderOps(v)

  implicit def toCapacityOps(v: Capacity): CapacityOps = new CapacityOps(v)

}
