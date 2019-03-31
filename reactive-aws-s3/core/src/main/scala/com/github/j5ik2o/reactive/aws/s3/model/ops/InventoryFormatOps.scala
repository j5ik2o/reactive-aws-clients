// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryFormat => ScalaInventoryFormat, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryFormat => JavaInventoryFormat }

object InventoryFormatOps {

  implicit class ScalaInventoryFormatOps(val self: ScalaInventoryFormat) extends AnyVal {

    def toJava: JavaInventoryFormat = {
      JavaInventoryFormat.valueOf(self.entryName)
    }

  }

  implicit class JavaInventoryFormatOps(val self: JavaInventoryFormat) extends AnyVal {

    def toScala: ScalaInventoryFormat = {
      ScalaInventoryFormat.withName(self.toString)
    }

  }

}
