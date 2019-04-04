// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InventoryScheduleBuilderOps(val self: InventorySchedule.Builder) extends AnyVal {

  final def withFrequencyAsScala(value: Option[InventoryFrequency]): InventorySchedule.Builder = {
    value.fold(self) { v =>
      self.frequency(v)
    }
  } // String

}

final class InventoryScheduleOps(val self: InventorySchedule) extends AnyVal {

  final def frequencyAsScala: Option[InventoryFrequency] = Option(self.frequency) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInventoryScheduleOps {

  implicit def toInventoryScheduleBuilderOps(v: InventorySchedule.Builder): InventoryScheduleBuilderOps =
    new InventoryScheduleBuilderOps(v)

  implicit def toInventoryScheduleOps(v: InventorySchedule): InventoryScheduleOps = new InventoryScheduleOps(v)

}
