// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InventorySchedule => ScalaInventorySchedule, _ }
import software.amazon.awssdk.services.s3.model.{ InventorySchedule => JavaInventorySchedule }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryScheduleOps {

  implicit class ScalaInventoryScheduleOps(val self: ScalaInventorySchedule) extends AnyVal {

    def toJava: JavaInventorySchedule = {
      val result = JavaInventorySchedule.builder()
      self.frequency.foreach { v =>
        import InventoryFrequencyOps._; result.frequency(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaInventoryScheduleOps(val self: JavaInventorySchedule) extends AnyVal {

    def toScala: ScalaInventorySchedule = {
      ScalaInventorySchedule()
        .withFrequency(Option(self.frequency).map { v =>
          import InventoryFrequencyOps._; v.toScala
        }) // String
    }

  }

}
