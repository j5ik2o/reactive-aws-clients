// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{
  InventoryIncludedObjectVersions => ScalaInventoryIncludedObjectVersions,
  _
}
import software.amazon.awssdk.services.s3.model.{
  InventoryIncludedObjectVersions => JavaInventoryIncludedObjectVersions
}

object InventoryIncludedObjectVersionsOps {

  implicit class ScalaInventoryIncludedObjectVersionsOps(val self: ScalaInventoryIncludedObjectVersions)
      extends AnyVal {

    def toJava: JavaInventoryIncludedObjectVersions = {
      JavaInventoryIncludedObjectVersions.valueOf(self.entryName)
    }

  }

  implicit class JavaInventoryIncludedObjectVersionsOps(val self: JavaInventoryIncludedObjectVersions) extends AnyVal {

    def toScala: ScalaInventoryIncludedObjectVersions = {
      ScalaInventoryIncludedObjectVersions.withName(self.toString)
    }

  }

}
