// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InventoryFilter => ScalaInventoryFilter, _ }
import software.amazon.awssdk.services.s3.model.{ InventoryFilter => JavaInventoryFilter }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InventoryFilterOps {

  implicit class ScalaInventoryFilterOps(val self: ScalaInventoryFilter) extends AnyVal {

    def toJava: JavaInventoryFilter = {
      val result = JavaInventoryFilter.builder()
      self.prefix.filter(_.nonEmpty).foreach(v => result.prefix(v)) // String

      result.build()
    }

  }

  implicit class JavaInventoryFilterOps(val self: JavaInventoryFilter) extends AnyVal {

    def toScala: ScalaInventoryFilter = {
      ScalaInventoryFilter()
        .withPrefix(Option(self.prefix)) // String
    }

  }

}
