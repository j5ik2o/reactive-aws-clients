// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputBuilderOps(val self: ProvisionedThroughput.Builder) extends AnyVal {

  final def readCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughput.Builder = {
    value.fold(self) { v =>
      self.readCapacityUnits(v)
    }
  } // Long

  final def writeCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughput.Builder = {
    value.fold(self) { v =>
      self.writeCapacityUnits(v)
    }
  } // Long

}

final class ProvisionedThroughputOps(val self: ProvisionedThroughput) extends AnyVal {

  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits) // Long

  final def writeCapacityUnitsAsScala: Option[Long] = Option(self.writeCapacityUnits) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedThroughputOps {

  implicit def toProvisionedThroughputBuilderOps(v: ProvisionedThroughput.Builder): ProvisionedThroughputBuilderOps =
    new ProvisionedThroughputBuilderOps(v)

  implicit def toProvisionedThroughputOps(v: ProvisionedThroughput): ProvisionedThroughputOps =
    new ProvisionedThroughputOps(v)

}
