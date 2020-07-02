// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputBuilderOps(val self: ProvisionedThroughput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughput.Builder = {
    value.fold(self) { v => self.readCapacityUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughput.Builder = {
    value.fold(self) { v => self.writeCapacityUnits(v) }
  }

}

final class ProvisionedThroughputOps(val self: ProvisionedThroughput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def writeCapacityUnitsAsScala: Option[Long] = Option(self.writeCapacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedThroughputOps {

  implicit def toProvisionedThroughputBuilderOps(v: ProvisionedThroughput.Builder): ProvisionedThroughputBuilderOps =
    new ProvisionedThroughputBuilderOps(v)

  implicit def toProvisionedThroughputOps(v: ProvisionedThroughput): ProvisionedThroughputOps =
    new ProvisionedThroughputOps(v)

}
