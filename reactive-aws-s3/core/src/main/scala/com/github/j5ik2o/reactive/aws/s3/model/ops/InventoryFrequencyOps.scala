// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryFrequency => ScalaInventoryFrequency, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryFrequency => JavaInventoryFrequency }

object InventoryFrequencyOps {

  implicit class ScalaInventoryFrequencyOps(val self: ScalaInventoryFrequency) extends AnyVal {

    def toJava: JavaInventoryFrequency = {
      JavaInventoryFrequency.valueOf(self.entryName)
    }

  }

  implicit class JavaInventoryFrequencyOps(val self: JavaInventoryFrequency) extends AnyVal {

    def toScala: ScalaInventoryFrequency = {
      ScalaInventoryFrequency.withName(self.toString)
    }

  }

}
