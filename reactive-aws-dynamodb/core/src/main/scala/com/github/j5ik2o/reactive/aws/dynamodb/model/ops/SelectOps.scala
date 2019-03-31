// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Select => ScalaSelect, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Select => JavaSelect }

object SelectOps {

  implicit class ScalaSelectOps(val self: ScalaSelect) extends AnyVal {

    def toJava: JavaSelect = {
      JavaSelect.valueOf(self.entryName)
    }

  }

  implicit class JavaSelectOps(val self: JavaSelect) extends AnyVal {

    def toScala: ScalaSelect = {
      ScalaSelect.withName(self.toString)
    }

  }

}
