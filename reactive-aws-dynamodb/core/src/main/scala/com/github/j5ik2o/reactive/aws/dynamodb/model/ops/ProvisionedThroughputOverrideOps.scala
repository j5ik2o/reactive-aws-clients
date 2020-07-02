// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ProvisionedThroughputOverrideBuilderOps(val self: ProvisionedThroughputOverride.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala(value: Option[Long]): ProvisionedThroughputOverride.Builder = {
    value.fold(self) { v => self.readCapacityUnits(v) }
  }

}

final class ProvisionedThroughputOverrideOps(val self: ProvisionedThroughputOverride) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readCapacityUnitsAsScala: Option[Long] = Option(self.readCapacityUnits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedThroughputOverrideOps {

  implicit def toProvisionedThroughputOverrideBuilderOps(
      v: ProvisionedThroughputOverride.Builder
  ): ProvisionedThroughputOverrideBuilderOps = new ProvisionedThroughputOverrideBuilderOps(v)

  implicit def toProvisionedThroughputOverrideOps(v: ProvisionedThroughputOverride): ProvisionedThroughputOverrideOps =
    new ProvisionedThroughputOverrideOps(v)

}
