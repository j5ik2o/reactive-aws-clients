// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryOptionalField => ScalaInventoryOptionalField, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryOptionalField => JavaInventoryOptionalField }

object InventoryOptionalFieldOps {

  implicit class ScalaInventoryOptionalFieldOps(val self: ScalaInventoryOptionalField) extends AnyVal {

    def toJava: JavaInventoryOptionalField = {
      JavaInventoryOptionalField.valueOf(self.entryName)
    }

  }

  implicit class JavaInventoryOptionalFieldOps(val self: JavaInventoryOptionalField) extends AnyVal {

    def toScala: ScalaInventoryOptionalField = {
      ScalaInventoryOptionalField.withName(self.toString)
    }

  }

}
