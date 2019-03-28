// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Select => ScalaSelect, _ }
import com.amazonaws.services.dynamodbv2.model.{ Select => JavaSelect }

object SelectOps {

  implicit class ScalaSelectOps(val self: ScalaSelect) extends AnyVal {

    def toJava: JavaSelect = {
      JavaSelect.valueOf(self.entryName)
    }

  }

  implicit class JavaSelectOps(val self: String) extends AnyVal {

    def toScala: ScalaSelect = {
      ScalaSelect.withName(self)
    }

  }

}
