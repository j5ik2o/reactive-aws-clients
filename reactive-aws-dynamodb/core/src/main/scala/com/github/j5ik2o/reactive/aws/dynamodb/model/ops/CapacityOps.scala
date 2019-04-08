// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class CapacityBuilderOps(val self: Capacity.Builder) extends AnyVal {

  final def readCapacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  }

  final def writeCapacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  }

  final def capacityUnitsAsScala(value: Option[Double]): Capacity.Builder = {
    value.fold(self) { v =>
      self.capacityUnits(v)
    }
  }

}

final class CapacityOps(val self: Capacity) extends AnyVal {

  final def readCapacityUnitsAsScala: Option[Double] = Option(self.readCapacityUnits)

  final def writeCapacityUnitsAsScala: Option[Double] = Option(self.writeCapacityUnits)

  final def capacityUnitsAsScala: Option[Double] = Option(self.capacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCapacityOps {

  implicit def toCapacityBuilderOps(v: Capacity.Builder): CapacityBuilderOps = new CapacityBuilderOps(v)

  implicit def toCapacityOps(v: Capacity): CapacityOps = new CapacityOps(v)

}
